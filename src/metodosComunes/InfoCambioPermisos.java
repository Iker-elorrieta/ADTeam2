package metodosComunes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import objetos.Libro;

public class InfoCambioPermisos {

	
	public static void InfoPermisosLinux() {
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("InfoPermisosLinux.txt");
			// Le pasamos la variable del Fichero que queremos leer
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			// Lectura del fichero
			String linea;
			String obj;
			while ((linea = br.readLine()) != null) {
				
					System.out.println(linea);
				}

			
		
		} catch (Exception e) {
			System.out.println("El fichero no es compatible o no se encuentra en el sistema");
		
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
		
		
		
	}
	
	
}
