package metodosComunes;

import java.util.ArrayList;

import objetos.Libro;

public class BuscarLibro {

	/**
	 * Esta clase contiene el metodo de Buscar Libro 
	 * @param libros ArrayList de Libros que se le pasa al metodo como parametro
	 * @param categoria String que se le pasa al metodo como parametro(Indica por que atributo del Libro se quiere buscar)
	 * @param dato String que se le pasa al metodo como parametro(patron a buscar)
	 * @param busqueda Numero entero que se le pasa al metodo como parametro(Indica la zona de busqueda)
	 * @author Asier, Jonatan
	 * @return librosencontrados ArrayList de Libros encontrados en la busqueda
	 * @throws IOException clase general de excepciones producidas por operaciones de E / S fallidas o interrumpidas.
	 */
	
	public static ArrayList<Libro> buscar(ArrayList<Libro> libros, String categoria, String dato, int busqueda) {

		ArrayList<Libro> librosEncontrados = new ArrayList<>();
		
		final String titulo = "titulo";
		final String editorial = "editorial"; 
		final String paginas = "paginas"; 
		final String altura = "altura"; 
		final String notas = "notas"; 
		final String isbn = "isbn"; 
		final String materias = "materias"; 
		

		for (Libro libro : libros) {

			switch (categoria) {

			case titulo:

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

			case editorial:
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

			case paginas:

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

			case altura:

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

			case notas:
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

			case isbn:
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

			case materias:
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
