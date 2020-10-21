package leerFicheros;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import Objetos.Libro;
import metodosComunes.Visualizacion;

public class LeerFicheroXml {

	public static ArrayList<Libro> leerXml(String nombreFichero) {
		// leer xml

		File file = new File(nombreFichero);
		ArrayList<Libro> libros = new ArrayList<>();

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("libro");
			System.out.println("N�mero de libros: " + nList.getLength());

			System.out.println("\n" + Visualizacion.textoEspacios(30, "T�tulo")
					+ Visualizacion.textoEspacios(15, "Editorial") + Visualizacion.textoEspacios(15, "P�ginas")
					+ Visualizacion.textoEspacios(15, "Altura") + Visualizacion.textoEspacios(15, "Notas")
					+ Visualizacion.textoEspacios(30, "Isbn") + Visualizacion.textoEspacios(30, "Materias"));

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("\n"
							+ Visualizacion.textoEspacios(30,
									eElement.getElementsByTagName("titulo").item(0).getTextContent())
							+ Visualizacion.textoEspacios(15,
									eElement.getElementsByTagName("editorial").item(0).getTextContent())
							+ Visualizacion.textoEspacios(15,
									eElement.getElementsByTagName("paginas").item(0).getTextContent())
							+ Visualizacion.textoEspacios(15,
									eElement.getElementsByTagName("altura").item(0).getTextContent())
							+ Visualizacion.textoEspacios(15,
									eElement.getElementsByTagName("notas").item(0).getTextContent())
							+ Visualizacion.textoEspacios(30,
									eElement.getElementsByTagName("isbn").item(0).getTextContent())
							+ Visualizacion.textoEspacios(30,
									eElement.getElementsByTagName("materias").item(0).getTextContent()));

					Libro libro = new Libro(eElement.getElementsByTagName("titulo").item(0).getTextContent(),
							eElement.getElementsByTagName("editorial").item(0).getTextContent(),
							eElement.getElementsByTagName("paginas").item(0).getTextContent(),
							eElement.getElementsByTagName("altura").item(0).getTextContent(),
							eElement.getElementsByTagName("notas").item(0).getTextContent(),
							eElement.getElementsByTagName("isbn").item(0).getTextContent(),
							eElement.getElementsByTagName("materias").item(0).getTextContent());
					libros.add(libro);
				}
			}
			return libros;
		} catch (Exception e) {

			System.out.println("El fichero no se encuentra en el sistema");
			// Hago NULL el array de libros para poder comprobar en JUnit que no ha
			// terminado correctamente este metodo.
			libros = null;
			return libros;
		}

	}

}
