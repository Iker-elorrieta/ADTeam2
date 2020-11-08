package metodosComunes;

import java.util.ArrayList;

import objetos.Libro;

public class BuscarLibro {

	public static ArrayList<Libro> buscar(ArrayList<Libro> libros, String categoria, String dato, int busqueda) {

		ArrayList<Libro> librosEncontrados = new ArrayList<>();

		for (Libro libro : libros) {

			switch (categoria) {

			case "titulo":

				

				if (busqueda == 1) {
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
				if (busqueda == 1) {
					if (libro.getEditorial().startsWith(dato)) {
						librosEncontrados.add(libro);

					}
				} else if (busqueda == 2) {
					if (libro.getEditorial().contains(dato)) {
						librosEncontrados.add(libro);

					}
				}

				else {
					if (libro.getEditorial().endsWith(dato)) {
						librosEncontrados.add(libro);

					}

				}
				break;

			case "paginas":

				if (busqueda == 1) {
					if (libro.getPaginas() == Integer.parseInt(dato)) {
						librosEncontrados.add(libro);

					}
				}

				else if (busqueda == 2) {
					if (libro.getPaginas() <= Integer.parseInt(dato)) {
						librosEncontrados.add(libro);

					}
				} else if (busqueda == 3) {
					if (libro.getPaginas() >= Integer.parseInt(dato)) {
						librosEncontrados.add(libro);

					}
				}

				break;

			case "altura":

				if (busqueda == 1) {
					if (libro.getAltura() < Double.parseDouble(dato)) {
						librosEncontrados.add(libro);

					}
				} else if (busqueda == 2) {
					if (libro.getAltura() > Double.parseDouble(dato)) {
						librosEncontrados.add(libro);

					}
				}

				break;

			case "notas":
				if (busqueda == 1) {
					if (libro.getNotas().startsWith(dato)) {
						librosEncontrados.add(libro);

					}
				} else if (busqueda == 2) {
					if (libro.getNotas().contains(dato)) {
						librosEncontrados.add(libro);

					}
				}

				else {
					if (libro.getNotas().endsWith(dato)) {
						librosEncontrados.add(libro);
					}
				}
				break;
				
			case "isbn":
				if (busqueda == 1) {
					if (libro.getIsbn().startsWith(dato)) {
						librosEncontrados.add(libro);

					}
				} else if (busqueda == 2) {
					if (libro.getIsbn().contains(dato)) {
						librosEncontrados.add(libro);

					}
				}

				else {
					if (libro.getIsbn().endsWith(dato)) {
						librosEncontrados.add(libro);
					}
				}
				break;

			case "materias":
			if (busqueda == 1) {
					if (libro.getMaterias().startsWith(dato)) {
						librosEncontrados.add(libro);

					}
				} else if (busqueda == 2) {
					if (libro.getMaterias().contains(dato)) {
						librosEncontrados.add(libro);

					}
				}

				else {
					if (libro.getMaterias().endsWith(dato)) {
						librosEncontrados.add(libro);
					}
				}
				break;

			default:
				break;
			}

		}

		return librosEncontrados;

	}

}
