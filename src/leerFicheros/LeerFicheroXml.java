package leerFicheros;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import metodosComunes.EscribirPantalla;
import metodosComunes.Visualizacion;
import objetos.Libro;

public class LeerFicheroXml {

	public static ArrayList<Libro> leerXml(String nombreFichero) {
		

		File file = new File(nombreFichero + ".xml");
		ArrayList<Libro> libros = new ArrayList<>();

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("libro");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

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
			EscribirPantalla.escribirLibro(libros, false);
			return libros;
		} catch (Exception e) {

			return libros;
		}
	}

}
