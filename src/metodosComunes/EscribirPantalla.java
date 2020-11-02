package metodosComunes;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Libro;

public class EscribirPantalla {
	/**
	 * Esta clase contiene el metodo de escrbir LIbro 
	 * @param libros Nombre del ArrayList de Libros que se le pasa al metodo como parametro
	 * @param cabezera Nombre del booleano que se le pasa al metodo como parametro
	 * @author Fran
	 * 
	 */

	public static void escribirLibro(ArrayList<Libro> libros ,boolean cabezera,int datoFiltrado,Scanner sc) {
		String DatoAFiltrar = null;
		boolean escribir=false;
		
		
		if(cabezera)
			System.out.println("\n" + Visualizacion.textoEspacios(30, "Titulo")
			+ Visualizacion.textoEspacios(15, "Editorial")
			+ Visualizacion.textoEspacios(15, "Paginas")
			+ Visualizacion.textoEspacios(15, "Altura")
			+ Visualizacion.textoEspacios(15, "Notas")
			+ Visualizacion.textoEspacios(30, "Isbn")
			+ Visualizacion.textoEspacios(30, "Materias"));	
		for(int x=0;x<libros.size();x++) {
		switch (datoFiltrado) {
		
		
		case 0:
			escribir=true;
			
			
		break;
		
		}
			if(escribir) {
			
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
}

