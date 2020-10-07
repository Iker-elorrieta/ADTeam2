package leerFicheros;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class LeerFicheroXml {

	public static void leerXml() {
// leer xml
		File file = new File("prueba.xml");

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("libro");
			System.out.println("Número de libros: " + nList.getLength());

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("\nLibro id: " + eElement.getAttribute("id"));
					System.out.println("Título: " + eElement.getElementsByTagName("titulo").item(0).getTextContent());
					System.out.println(
							"Editorial: " + eElement.getElementsByTagName("editorial").item(0).getTextContent());
					System.out.println(
							"Páginas: " + eElement.getElementsByTagName("paginas").item(0).getTextContent());
					System.out.println("Altura: " + eElement.getElementsByTagName("altura").item(0).getTextContent());
					System.out.println("Notas: " + eElement.getElementsByTagName("notas").item(0).getTextContent());
					System.out.println(
							"Isbn: " + eElement.getElementsByTagName("isbn").item(0).getTextContent());
					System.out.println(
							"Materias: " + eElement.getElementsByTagName("materias").item(0).getTextContent());
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
