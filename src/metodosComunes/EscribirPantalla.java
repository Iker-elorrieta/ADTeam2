package metodosComunes;

import java.util.ArrayList;

import Objetos.Libro;

public class EscribirPantalla {

	public static void escribirLibro(ArrayList<Libro> libros) {
		
		
		System.out.println("\n" + Visualizacion.textoEspacios(30, "Titulo")
		+ Visualizacion.textoEspacios(15, "Editorial")
		+ Visualizacion.textoEspacios(15, "Paginas")
		+ Visualizacion.textoEspacios(15, "Altura")
		+ Visualizacion.textoEspacios(15, "Notas")
		+ Visualizacion.textoEspacios(30, "Isbn")
		+ Visualizacion.textoEspacios(30, "Materias"));	
		
		for(int x=0;x<libros.size();x++) {
			
			System.out.println("\n" + Visualizacion.textoEspacios(30, libros.get(x).getTitulo().toString())
			+ Visualizacion.textoEspacios(15, libros.get(x).getEditorial().toString())
			+ Visualizacion.textoEspacios(15, libros.get(x).getPaginas().toString())
			+ Visualizacion.textoEspacios(15, libros.get(x).getAltura().toString())
			+ Visualizacion.textoEspacios(15, libros.get(x).getNotas().toString())
			+ Visualizacion.textoEspacios(30, libros.get(x).getIsbn().toString())
			+ Visualizacion.textoEspacios(30, libros.get(x).getMaterias().toString()));	
		}
	}
}
