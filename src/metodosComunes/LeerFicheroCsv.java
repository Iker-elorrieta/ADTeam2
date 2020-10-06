package metodosComunes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import modelo.Fichero;

public class LeerFicheroCsv {

	public static void LeerCSV() throws IOException {

		String csvFile = "prueba1.csv";
		BufferedReader br = null;
		String line = "";
		// Se define separador ","
		String cvsSplitBy = ",";
		try {
			// cargamos en el bufer el fichero
			br = new BufferedReader(new FileReader(csvFile));
			// Leemos liena a linea el fichero csv
			while ((line = br.readLine()) != null) {
				String[] datos = line.split(cvsSplitBy);

				// Imprime datos formateados para que se puedan leer bien
				System.out.println(Visualizacion.textoEspacios(30, datos[0]) + Visualizacion.textoEspacios(15, datos[1])
						+ Visualizacion.textoEspacios(15, datos[2]) + Visualizacion.textoEspacios(15, datos[3])
						+ Visualizacion.textoEspacios(15, datos[4]) + Visualizacion.textoEspacios(30, datos[5])
						+ Visualizacion.textoEspacios(30, datos[6]));

				/*
				 * Para cuando tenga que tratar los datos ya lo tengo creado en un objeto String
				 * titulo = datos[0]; String editorial = datos[1]; int paginas =
				 * Integer.valueOf(datos[2]); int altura = Integer.valueOf(datos[3]); double
				 * notas = Double.valueOf(datos[4]); int isbn =Integer.valueOf(datos[5]); String
				 * materias = datos[6];
				 * 
				 * Fichero fichero = new Fichero(titulo, editorial, paginas, altura, notas,
				 * isbn, materias);
				 */
			}

		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se encuentra en el sistema");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
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
	}
}

