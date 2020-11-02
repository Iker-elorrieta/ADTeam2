package escribirFicheros;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import leerFicheros.LeerFicheroXml;
import metodosComunes.*;
import objetos.Libro;

public class EscribirXml {/**
	 * Esta clase contiene el metodo de escribir Fichero .xml 
	 * @param nombre Nombre del fichero que se le pasa al metodo como parametro
	 * @param name Nombre del fichero que se le pasa al metodo como parametro
	 * @author Asier, Jonatan  
	 * @return Retorna un ArrayList de Libros
	 * 
	 * @throws Exception clase general de excepciones.
	 */
	static Scanner sc = new Scanner(System.in);
	public EscribirXml() {

//		try {
//
//			generarXml(nombre);
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public ArrayList<Libro> generarXml(String name, Scanner sc) {

		ArrayList<Libro> libros = LeerFicheroXml.leerXml(name, 0, sc);

		libros.add(RellenarLibro.rellenarLibro(sc));

		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			
			// definimos el elemento raíz del documento
			Element eBiblioteca = doc.createElement("biblioteca");
			doc.appendChild(eBiblioteca);

			for (Libro libro : libros) {

				// definimos el nodo que contendrá los elementos
				Element eLibro = doc.createElement("libro");
				eBiblioteca.appendChild(eLibro);

				// atributo para el nodo coche
				Attr attr = doc.createAttribute("id");

				// attr.setValue(libros.indexOf(libro));
				eLibro.setAttributeNode(attr);

				// definimos cada uno de los elementos y le asignamos un valor
				Element eTitulo = doc.createElement("titulo");
				eTitulo.appendChild(doc.createTextNode(libro.getTitulo()));
				eLibro.appendChild(eTitulo);

				Element eEditorial = doc.createElement("editorial");
				eEditorial.appendChild(doc.createTextNode(libro.getEditorial()));
				eLibro.appendChild(eEditorial);

				Element ePaginas = doc.createElement("paginas");
				ePaginas.appendChild(doc.createTextNode(libro.getPaginas()));
				eLibro.appendChild(ePaginas);

				Element eAltura = doc.createElement("altura");
				eAltura.appendChild(doc.createTextNode(libro.getAltura()));
				eLibro.appendChild(eAltura);

				Element eNotas = doc.createElement("notas");
				eNotas.appendChild(doc.createTextNode(libro.getNotas()));
				eLibro.appendChild(eNotas);

				Element eIsbn = doc.createElement("isbn");
				eIsbn.appendChild(doc.createTextNode(libro.getIsbn()));
				eLibro.appendChild(eIsbn);

				Element eMaterias = doc.createElement("materias");
				eMaterias.appendChild(doc.createTextNode(libro.getMaterias()));
				eLibro.appendChild(eMaterias);
			}

			// clases necesarias finalizar la creación del archivo XML

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = (Transformer) transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(name + ".xml"));

			
			((javax.xml.transform.Transformer) transformer).transform(source, result);
		} catch (Exception e) {
			System.out.println("!ERROR AL CREAR DOCUMENTO¡");
			e.printStackTrace();
			libros = null;
			return libros;
		}
		return libros;
	}

}
