package metodosComunes;

import java.util.ArrayList;

import objetos.Libro;

public class BuscarLibro {

	public static ArrayList<Libro> buscar(ArrayList<Libro> libros, String categoria, String dato, int busqueda) {

		ArrayList<Libro> librosEncontrados = new ArrayList<>();

		for (Libro libro : libros) {

			switch (categoria) {

			case "titulo":

				if (busqueda == 0) {
					if (libro.getTitulo().equals(dato)) {
						librosEncontrados.add(libro);

					}
				}

				else if (busqueda == 1) {
					if (libro.getTitulo().startsWith(dato)) {
						librosEncontrados.add(libro);

					}
				} else if (busqueda == 2) {
					if (libro.getTitulo().contains(dato)) {
						librosEncontrados.add(libro);

					}
				}

				else {
					if (libro.getTitulo().endsWith(dato)) {
						librosEncontrados.add(libro);

					}

				}
				break;

			case "editorial":
				if (libro.getEditorial().equals(dato)) {
					librosEncontrados.add(libro);
					break;
				}
			case "paginas":
				if (libro.getPaginas() == Integer.parseInt(dato)) {
					librosEncontrados.add(libro);
				}
				break;
			case "altura":
				if (libro.getAltura() == Float.parseFloat(dato)) {
					librosEncontrados.add(libro);
				}
				break;
			case "notas":
				if (libro.getNotas().equals(dato)) {
					librosEncontrados.add(libro);
				}
				break;
			case "isbn":
				if (libro.getIsbn().equals(dato)) {
					librosEncontrados.add(libro);
				}
				break;

			case "materias":
				if (libro.getMaterias().equals(dato)) {
					librosEncontrados.add(libro);
				}
				break;
			default:
				break;
			}

		}

		return librosEncontrados;

	}

}
