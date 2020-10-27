package leerFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import metodosComunes.EscribirPantalla;
import objetos.Libro;

public class LeerFicheroCsv {
	/**
	 * Esta clase contiene el metodo de leer Fichero Csv
	 * 
	 * @param nombreFichero Nombre del fichero que se le pasa al metodo como
	 *                      parametro
	 * @author Fran
	 * @return Retorna un booleano true para saber si se ha temrinado de leer el
	 *         fichero
	 */
	public static Boolean LeerCSV(String nombreFichero) {

		ArrayList<Libro> libros = new ArrayList<Libro>();
		BufferedReader br = null;
		String linea = "";
		// Se define separador ","
		final String cvsSplitBy = ",";
		try {
			// cargamos en el bufer el fichero
			br = new BufferedReader(new FileReader(nombreFichero + ".csv"));
			// Leemos liena a linea el fichero csv
			while ((linea = br.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(linea, ";");
				Libro libro = new Libro();

				while (st.hasMoreTokens()) {

					libro.setTitulo(st.nextToken());
					libro.setEditorial(st.nextToken());
					libro.setPaginas(st.nextToken());
					libro.setAltura(st.nextToken());
					libro.setNotas(st.nextToken());
					libro.setIsbn(st.nextToken());
					libro.setMaterias(st.nextToken());
				}
				libros.add(libro);
			}

			EscribirPantalla.escribirLibro(libros, false);
		} catch (IOException e) {
			// Error en el nombre del fichero
			System.out.println("");
			System.out.println("El fichero no es compatible o no se encuentra en el sistema");
			return false;
			// e.printStackTrace();
		} finally {
			System.out.println();
			// Cerramos el bufferedReader independientemente de que haya excepcion o no
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}
}