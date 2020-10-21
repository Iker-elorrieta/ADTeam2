package leerFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import metodosComunes.Visualizacion;

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
		String[] cortarString;
		String Titulo = "", Editorial = "", Paginas = "", Altura = "", Notas = "", Isbn = "", Materias = "";
		String CabeceraTitulo = "", CabeceraEditorial = "", CabeceraPaginas = "", CabeceraAltura = "", CabeceraNotas = "", CabeceraIsbn = "", CabeceraMaterias = "";
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
				if (linea.contains("Titulo")) {

					cortarString = linea.split(": ");
					CabeceraTitulo = cortarString[0];
					Titulo = cortarString[1];

				} else if (linea.contains("Editorial")) {

					cortarString = linea.split(": ");
					CabeceraEditorial = cortarString[0];
					Editorial = cortarString[1];

				} else if (linea.contains("Paginas")) {

					cortarString = linea.split(": ");
					CabeceraPaginas = cortarString[0];
					Paginas = cortarString[1];

				} else if (linea.contains("Altura")) {

					cortarString = linea.split(": ");

					CabeceraAltura = cortarString[0];
					Altura = cortarString[1];

				} else if (linea.contains("Notas")) {

					cortarString = linea.split(": ");
					CabeceraNotas = cortarString[0];
					Notas = cortarString[1];

				} else if (linea.contains("Isbn")) {

					cortarString = linea.split(": ");
					CabeceraIsbn = cortarString[0];
					Isbn = cortarString[1];

				} else if (linea.contains("Materias")) {

					cortarString = linea.split(": ");
					CabeceraMaterias = cortarString[0];
					Materias = cortarString[1];

				} else if (linea.contains("***************")) {
					if (RepetirCabezera) {
						System.out.println("\n" + Visualizacion.textoEspacios(30, CabeceraTitulo)
								+ Visualizacion.textoEspacios(15, CabeceraEditorial)
								+ Visualizacion.textoEspacios(15, CabeceraPaginas)
								+ Visualizacion.textoEspacios(15, CabeceraAltura)
								+ Visualizacion.textoEspacios(15, CabeceraNotas)
								+ Visualizacion.textoEspacios(30, CabeceraIsbn)
								+ Visualizacion.textoEspacios(30, CabeceraMaterias));

						RepetirCabezera = false;
					}
					System.out.println("\n" + Visualizacion.textoEspacios(30, Titulo)
							+ Visualizacion.textoEspacios(15, Editorial) + Visualizacion.textoEspacios(15, Paginas)
							+ Visualizacion.textoEspacios(15, Altura) + Visualizacion.textoEspacios(15, Notas)
							+ Visualizacion.textoEspacios(30, Isbn) + Visualizacion.textoEspacios(30, Materias));

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
				e2.printStackTrace();
			}
		}
		return true;
	}

}
