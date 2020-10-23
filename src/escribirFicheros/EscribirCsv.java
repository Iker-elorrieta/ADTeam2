package escribirFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import metodosComunes.RellenarLibro;
import objetos.Libro;

public class EscribirCsv {
	final static String cvsSplitBy = ",";

	public static ArrayList<Libro> EscribeFichero(String nombreFichero, boolean automatico) {

		File fichero = new File(nombreFichero + ".csv"); // Inicializamos el objeto fichero con su ruta.

		// Si no existe un fichero en esa ruta, lo creamos.

		ArrayList<Libro> arrayLibro = new ArrayList<Libro>();

		if (!fichero.exists()) {

			try {
				fichero.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try (FileWriter fw = new FileWriter(fichero.getAbsoluteFile(), true);
					BufferedWriter bw = new BufferedWriter(fw);) {

				Libro libros = RellenarLibro.rellenarLibro(automatico);
				StringBuilder sbTexto = new StringBuilder();

				sbTexto.append("Titulo" + cvsSplitBy + "Editorial" + cvsSplitBy + "Paginas" + cvsSplitBy + "Altura"
						+ cvsSplitBy + "Notas" + cvsSplitBy + "Isbn" + cvsSplitBy + "Materias" + "\n");

				sbTexto.append(libros.getTitulo() + cvsSplitBy + libros.getEditorial() + cvsSplitBy
						+ libros.getPaginas() + cvsSplitBy + libros.getAltura() + cvsSplitBy + libros.getNotas()
						+ cvsSplitBy + libros.getIsbn() + cvsSplitBy + libros.getMaterias() + "\n");

				bw.write(sbTexto.toString());

				System.out.println("Libro creado");

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		else {
			
			try (FileWriter fw = new FileWriter(fichero.getAbsoluteFile(), true);
					BufferedWriter bw = new BufferedWriter(fw);) {

				Libro libros = RellenarLibro.rellenarLibro(automatico);
				StringBuilder sbTexto = new StringBuilder();
				
				arrayLibro.add(libros);

				sbTexto.append(libros.getTitulo() + cvsSplitBy + libros.getEditorial() + cvsSplitBy
						+ libros.getPaginas() + cvsSplitBy + libros.getAltura() + cvsSplitBy + libros.getNotas()
						+ cvsSplitBy + libros.getIsbn() + cvsSplitBy + libros.getMaterias());
				

				bw.write(sbTexto.toString());

				System.out.println("Libro Añadido");
				
				return arrayLibro;

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return arrayLibro;
		

	}
}
