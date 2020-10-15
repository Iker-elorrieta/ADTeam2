package escribirFicheros;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.platform.commons.function.Try.Transformer;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
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

		System.out.println("Introduzca el t�tulo del libro: ");
		this.titulo = sc.next();

		System.out.println("Introdusca la editorial: ");
		this.editorial = sc.next();

		while (salir == false) {
			System.out.println("Introduzca altura: ");
			try {
				//this.altura = sc.nextDouble();
				salir = true;
			} catch (Exception e) {
				System.out.println("�Dato incorrecto!");
			}
		}
		while (salir == false) {
			System.out.println("Introduzca notas: ");
			try {
			//	this.altura = sc.nextInt();
				salir = true;
			} catch (Exception e) {
				System.out.println("�Dato incorrecto!");
			}

		}
		System.out.println("Introdusca la Isbn: ");
		this.isbn = sc.next();
		
		System.out.println("Introdusca la materias: ");
		this.materias = sc.next();
		

		return false;

	}
	
	 private boolean generarXml(String name) throws Exception{

	        ArrayList<Libro> libros = LeerFicheroXml.leerXml(name);
	        Libro nuevoLibro = new Libro(titulo, editorial, paginas, altura, notas, isbn, materias);

	        libros.add(nuevoLibro);
	        
		 try {
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.newDocument();

			  // definimos el elemento ra�z del documento
			  Element eBiblioteca = doc.createElement("biblioteca");
			  doc.appendChild(eBiblioteca);
			  
			  for (Libro libro: libros) {
				  
				// definimos el nodo que contendr� los elementos
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

			  

			  // clases necesarias finalizar la creaci�n del archivo XML
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = (Transformer) transformerFactory.newTransformer();
			  DOMSource source = new DOMSource(doc);
			  StreamResult result = new StreamResult(new File(name+".xml"));

			  ((javax.xml.transform.Transformer) transformer).transform(source, result);
			} catch(Exception e) {
			  e.printStackTrace();
			}
		return false;
	 }

}