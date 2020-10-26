package escribirFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import metodosComunes.RellenarLibro;
import objetos.Libro;

public class EscribirCsv {
	/**
	 * Esta clase contiene el metodo de Escribir Fichero Csv 
	 * @param nombreFichero Nombre del fichero que se le pasa al metodo como parametro
	 * @author Fran, Jonatan
	 * @return Retorna un booleano false para saber si ha saltado alguna excepcion
	 * @return Retorna un booleano true para saber si se ha terminado de escribir o crear el fichero
	 * 
	 * @throws IOException clase general de excepciones producidas por operaciones de E / S fallidas o interrumpidas.
	 */
	final static String cvsSplitBy = ",";
	static Scanner sc = new Scanner(System.in);
	public static boolean EscribeFichero(String nombreFichero, Scanner sc) {

		BufferedWriter bw = null;
		FileWriter fw = null;
		Libro libro = new Libro();
		try {

			File file = new File(nombreFichero + ".csv");
			// Si el archivo no existe, se crea!
			if (!file.exists()) {
				fw = new FileWriter(file.getAbsoluteFile(), true);
				bw = new BufferedWriter(fw);
				libro = metodosComunes.RellenarLibro.rellenarLibro(sc);
				bw.write("Titulo" + cvsSplitBy + "Editorial" + cvsSplitBy + "Paginas" + cvsSplitBy + "Altura"
						+ cvsSplitBy + "Notas" + cvsSplitBy + "Isbn" + cvsSplitBy + "Materias" + "\n");
				file.createNewFile();
				bw.write(libro.getTitulo() + cvsSplitBy + libro.getEditorial() + cvsSplitBy + libro.getPaginas()
				+ cvsSplitBy + libro.getAltura() + cvsSplitBy + libro.getNotas() + cvsSplitBy + libro.getIsbn()
				+ cvsSplitBy + libro.getMaterias() + "\n");
			}else {
				
				fw = new FileWriter(file.getAbsoluteFile(), true);
				bw = new BufferedWriter(fw);
				libro = metodosComunes.RellenarLibro.rellenarLibro(sc);
				bw.write(libro.getTitulo() + cvsSplitBy + libro.getEditorial() + cvsSplitBy + libro.getPaginas()
						+ cvsSplitBy + libro.getAltura() + cvsSplitBy + libro.getNotas() + cvsSplitBy + libro.getIsbn()
						+ cvsSplitBy + libro.getMaterias() + "\n");

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// Cierra instancias de FileWriter y BufferedWriter
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
				return false;

			}
		}
		return true;
		
	}
}