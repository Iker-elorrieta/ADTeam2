package leerFicheros;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import metodosComunes.Visualizacion;

public class LeerFicheroXml {

	public static boolean leerXml() {
		// leer xml
		File file = new File("fichero.xml");

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("libro");
			System.out.println("Número de libros: " + nList.getLength());

			System.out.println("\n" + Visualizacion.textoEspacios(30, "Título")
					+ Visualizacion.textoEspacios(15, "Editorial") + Visualizacion.textoEspacios(15, "Páginas")
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

				}
			}
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

}
