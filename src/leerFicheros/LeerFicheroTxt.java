package leerFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import metodosComunes.EscribirPantalla;
import metodosComunes.Visualizacion;
import objetos.Libro;

public class LeerFicheroTxt {

	/**
	 * Esta clase contiene el metodo de leer Fichero txt 
	 * @param nombreFichero Nombre del fichero que se le pasa al metodo como parametro
	 * @author Ibai 
	 * @return retorna un booleano true para saber si se ha temrinado de leer el fichero
	 * 
	 * @throws IOException clase general de excepciones producidas por operaciones de E / S fallidas o interrumpidas.
	 */
	public static Boolean LeerTxt(String nombreFichero) {
		
		String cortar1;
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro libro = new Libro();
		Boolean RepetirCabezera=true;
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(nombreFichero+".txt");
			// Le pasamos la variable del Fichero que queremos leer
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				if (linea.contains("***********")) {
					
					libros.add(libro);
					libro=new Libro();
				}else {
					cortar1 = linea.split(": ")[1];
				if (linea.contains("Titulo")) 
					libro.setTitulo(cortar1);
					
				 else if (linea.contains("Editorial")) 
					libro.setEditorial(cortar1);

				 else if (linea.contains("Paginas")) 
					libro.setPaginas(cortar1);

				 else if (linea.contains("Altura")) 
					libro.setAltura(cortar1);

				 else if (linea.contains("Notas")) 
					libro.setNotas(cortar1);

				 else if (linea.contains("Isbn")) 
					libro.setIsbn(cortar1);

				 else if (linea.contains("Materias")) 
					libro.setMaterias(cortar1);
				}
			EscribirPantalla.escribirLibro(libros,true);
			return true;
		}catch (Exception e) {
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
				e2.printStackTrace();
			}
		}
	
	}

}
