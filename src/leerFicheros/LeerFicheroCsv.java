package leerFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import metodosComunes.Visualizacion;


public class LeerFicheroCsv {
	/**
	 * Esta clase contiene el metodo de leer Fichero Csv 
	 * @param nombreFichero Nombre del fichero que se le pasa al metodo como parametro
	 * @author Fran 
	 * @return Retorna un booleano true para saber si se ha temrinado de leer el fichero
	 * 
	 * @throws IOException clase general de excepciones producidas por operaciones de E / S fallidas o interrumpidas.
	 */
	public static boolean LeerCSV(String  nombreFichero) throws IOException {
		
	
		BufferedReader br = null;
		String linea = "";
		// Se define separador ","
		String cvsSplitBy = ",";
		try {
			// cargamos en el bufer el fichero
			br = new BufferedReader(new FileReader(nombreFichero+".csv"));
			// Leemos liena a linea el fichero csv
			while ((linea = br.readLine()) != null) {
				String[] datos = linea.split(cvsSplitBy);
				
				// Imprime datos formateados para que se puedan leer bien
				System.out.println("\n"+Visualizacion.textoEspacios(30, datos[0]) + Visualizacion.textoEspacios(15, datos[1])
						+ Visualizacion.textoEspacios(15, datos[2]) + Visualizacion.textoEspacios(15, datos[3])
						+ Visualizacion.textoEspacios(15, datos[4]) + Visualizacion.textoEspacios(30, datos[5])
						+ Visualizacion.textoEspacios(30, datos[6]));

			}

		} catch (FileNotFoundException e) {
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

