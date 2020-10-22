package escribirFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Objetos.Libro;
import metodosComunes.RellenarLibro;

public class EscribirCsv {
	final static String cvsSplitBy = ",";

	public static ArrayList EscribeFichero(String nombreFichero) {

		File fichero = new File(nombreFichero + ".csv"); // Inicializamos el objeto fichero con su ruta.

		// Si no existe un fichero en esa ruta, lo creamos.
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();

				try (FileWriter fw = new FileWriter(fichero.getAbsoluteFile(), true);
						BufferedWriter bw = new BufferedWriter(fw);) {

					Libro libros = RellenarLibro.rellenarLibro();
					StringBuilder sbTexto = new StringBuilder();

					sbTexto.append("Titulo" + cvsSplitBy + "Editorial" + cvsSplitBy + "Paginas" + cvsSplitBy + "Altura"
							+ cvsSplitBy + "Notas" + cvsSplitBy + "Isbn" + cvsSplitBy + "Materias"+"\n");

					sbTexto.append(libros.getTitulo() + cvsSplitBy + libros.getEditorial() + cvsSplitBy
							+ libros.getPaginas() + cvsSplitBy + libros.getAltura() + cvsSplitBy + libros.getNotas()
							+ cvsSplitBy + libros.getIsbn() + cvsSplitBy + libros.getMaterias()+"\n" );
					

					bw.write(sbTexto.toString());

					System.out.println("Libro creado");

				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try (FileWriter fw = new FileWriter(fichero.getAbsoluteFile(), true);
					BufferedWriter bw = new BufferedWriter(fw);) {

				Libro libros = RellenarLibro.rellenarLibro();
				StringBuilder sbTexto = new StringBuilder();
				ArrayList<Libro> arrayLibro = new ArrayList<Libro>();
				arrayLibro.add(libros);

				sbTexto.append(libros.getTitulo() + cvsSplitBy + libros.getEditorial() + cvsSplitBy
						+ libros.getPaginas() + cvsSplitBy + libros.getAltura() + cvsSplitBy + libros.getNotas()
						+ cvsSplitBy + libros.getIsbn() + cvsSplitBy + libros.getMaterias());
				

				bw.write(sbTexto.toString());

				System.out.println("Libro Añadido");

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return null;

	}
}
