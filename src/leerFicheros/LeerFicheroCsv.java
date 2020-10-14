package leerFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import metodosComunes.Visualizacion;


public class LeerFicheroCsv {

	public static boolean LeerCSV(String  nombreFichero) throws IOException {
		
	
		BufferedReader br = null;
		String linea = "";
		// Se define separador ","
		String cvsSplitBy = ",";
		try {
			// cargamos en el bufer el fichero
			br = new BufferedReader(new FileReader(nombreFichero));
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
			System.out.println("");
			System.out.println("El fichero no se encuentra en el sistema");
			return false;
			// e.printStackTrace();
		} finally {
			System.out.println();
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

