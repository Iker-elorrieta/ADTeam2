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

import Objetos.Libro;
import leerFicheros.LeerFicheroXml;

public class EscribirXml {

	private String titulo;
	private String editorial;
	private String paginas;
	private String altura;
	private String notas;
	private String isbn;
	private String materias;

	public EscribirXml(String nombre) {

		xmlData();

		try {

			generarXml(nombre);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean xmlData() {

		Scanner sc = new Scanner(System.in);

		boolean salir = false;

		System.out.println("Introduzca el título del libro: ");
		this.titulo = sc.next();

		System.out.println("Introdusca la editorial: ");
		this.editorial = sc.next();

		while (salir == false) {
			System.out.println("Introduzca altura: ");
			try {
				String sAltura = sc.next();
				Double dAltura = Double.parseDouble(sAltura);
				this.altura = sAltura;
				salir = true;
			} catch (Exception e) {
				System.out.println("¿Dato incorrecto!");
			}
		}
		salir = false;
		while (salir == false) {
			System.out.println("Introduzca notas: ");
			try {

				String sNotas = sc.next();
				int iNotas = Integer.parseInt(sNotas);
				this.altura = sNotas;
				salir = true;
			} catch (Exception e) {
				System.out.println("¿Dato incorrecto!");
			}

		}
		System.out.println("Introduzca la Isbn: ");
		this.isbn = sc.next();

		System.out.println("Introdusca la materias: ");
		this.materias = sc.next();

		return true;

	}

	public ArrayList<Libro> generarXml(String name) {

		ArrayList<Libro> libros = LeerFicheroXml.leerXml(name);
		Libro nuevoLibro = new Libro(titulo, editorial, paginas, altura, notas, isbn, materias);

		libros.add(nuevoLibro);

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
			StreamResult result = new StreamResult(new File(name));



			((javax.xml.transform.Transformer) transformer).transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return libros;
	}

}
