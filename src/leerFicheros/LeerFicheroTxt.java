package leerFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import metodosComunes.Visualizacion;

public class LeerFicheroTxt {

	/**
	 * Esta clase contiene el metodo para leer el fichero txt
	 * 
	 * @author Ibai Bugedo
	 */
	public static void LeerTxt() throws IOException {
		String[] cortarString;
		String Titulo = "", Editorial = "", Paginas = "", Altura = "", Notas = "", Isbn = "", Materias = "";
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		System.out.println("\n" + Visualizacion.textoEspacios(30, "Titulo")
				+ Visualizacion.textoEspacios(15, "Editorial") + Visualizacion.textoEspacios(15, "Paginas")
				+ Visualizacion.textoEspacios(15, "Altura") + Visualizacion.textoEspacios(15, "Notas")
				+ Visualizacion.textoEspacios(30, "Isbn") + Visualizacion.textoEspacios(30, "Materias"));

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("fichero.txt");
			// Le pasamos la variable del Fichero que queremos leer
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				if (linea.contains("Titulo")) {

					cortarString = linea.split(": ");

					Titulo = cortarString[1];

				} else if (linea.contains("Editorial")) {

					cortarString = linea.split(": ");

					Editorial = cortarString[1];

				} else if (linea.contains("Paginas")) {

					cortarString = linea.split(": ");

					Paginas = cortarString[1];

				} else if (linea.contains("Altura")) {

					cortarString = linea.split(": ");

					Altura = cortarString[1];

				} else if (linea.contains("Notas")) {

					cortarString = linea.split(": ");

					Notas = cortarString[1];

				} else if (linea.contains("Isbn")) {

					cortarString = linea.split(": ");

					Isbn = cortarString[1];

				} else if (linea.contains("Materias")) {

					cortarString = linea.split(": ");

					Materias = cortarString[1];

				} else if (linea.contains("***************")) {
					System.out.println("\n" + Visualizacion.textoEspacios(30, Titulo)
							+ Visualizacion.textoEspacios(15, Editorial) + Visualizacion.textoEspacios(15, Paginas)
							+ Visualizacion.textoEspacios(15, Altura) + Visualizacion.textoEspacios(15, Notas)
							+ Visualizacion.textoEspacios(30, Isbn) + Visualizacion.textoEspacios(30, Materias));

				}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
