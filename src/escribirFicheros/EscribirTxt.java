package escribirFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import objetos.Libro;

public class EscribirTxt {

	public static boolean a�adirTxt(String nombreArchivo) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		Libro libro = new Libro();
		try {

			File file = new File(nombreArchivo + ".txt");
			// Si el archivo no existe, se crea!
			if (!file.exists()) {
				file.createNewFile();
			}
			// flag true, indica adjuntar informaci�n al archivo.
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			libro = metodosComunes.RellenarLibro.rellenarLibro();
			bw.write("Titulo : " + libro.getTitulo() + "\n");
			bw.write("Editorial : " + libro.getEditorial() + "\n");
			bw.write("Paginas : " + libro.getPaginas() + "\n");
			bw.write("Altura : " + libro.getAltura() + "\n");
			bw.write("Notas : " + libro.getNotas() + "\n");
			bw.write("Isbn : " + libro.getIsbn() + "\n");
			bw.write("Materias : " + libro.getMaterias() + "\n");
			bw.write("*******************************" + "\n");
			System.out.println("informaci�n agregada!");

			return true;

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
		return false;
	}
}