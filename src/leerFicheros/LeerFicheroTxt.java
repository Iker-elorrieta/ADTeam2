package leerFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import metodosComunes.EscribirPantalla;
import objetos.Libro;

public class LeerFicheroTxt {

	/**
	 * Esta clase contiene el metodo de leer Fichero txt
	 * 
	 * @param nombreFichero Nombre del fichero que se le pasa al metodo como
	 *                      parametro
	 * @author Ibai
	 * @param sc 
	 * @return retorna un booleano true para saber si se ha temrinado de leer el
	 *         fichero
	 */
	public static Boolean LeerTxt(File Fichero,ArrayList<Libro> libros, Scanner sc) {

		String cortar1;
		
		Libro libro = new Libro();
		Boolean RepetirCabezera = true;
		File archivo = Fichero;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			// Le pasamos la variable del Fichero que queremos leer
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			// Lectura del fichero
			String linea;
			String obj;
			while ((linea = br.readLine()) != null) {
				if (linea.contains("*******************************")) {

					libros.add(libro);
					libro = new Libro();
				} else {
					StringTokenizer st = new StringTokenizer(linea, ":");
					obj=st.nextToken();
					
					if(st.hasMoreTokens()) {
						obj=st.nextToken();
					}
					
					obj=obj.trim();
					
						if (linea.contains("Titulo"))
							libro.setTitulo(obj);

						else if (linea.contains("Editorial"))
							libro.setEditorial(obj);

						else if (linea.contains("Paginas"))
							libro.setPaginas(Integer.parseInt(obj.trim()));
					
						else if (linea.contains("Altura"))
							libro.setAltura(Float.parseFloat(obj.trim()));

						else if (linea.contains("Notas"))
							libro.setNotas(obj);

						else if (linea.contains("Isbn"))
							libro.setIsbn(obj);

						else if (linea.contains("Materias"))
							libro.setMaterias(obj);
					}
				}

			
		
		} catch (Exception e) {
			System.out.println("El fichero no es compatible o no se encuentra en el sistema");
			return false;
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				
			}
		}
		return true;
	}

}
