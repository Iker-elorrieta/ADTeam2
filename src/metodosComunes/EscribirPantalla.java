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
		if(datoFiltrado!=0) {
			System.out.println("Escribe lo que quieras buscar:");
			DatoAFiltrar=sc.nextLine();
		}
		
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
		case 1://titulo
			
				if(libros.get(x).getTitulo().toString().contains(DatoAFiltrar)) 
					escribir=true;
			break;
		case 2://Editorial
			
				if(libros.get(x).getEditorial().toString().contains(DatoAFiltrar))
					escribir=true;
			
			break;
		case 3://paginas
			
				//if(libros.get(x).getPaginas().toString().contains(DatoAFiltrar))
					//escribir=true;
			break;
		case 4://Altura
			
				//if(libros.get(x).getAltura().toString().contains(DatoAFiltrar)) 
					//escribir=true;
			
			break;
		case 5://Notas
				if(libros.get(x).getNotas().toString().contains(DatoAFiltrar))
					escribir=true;
			break;
		case 6://Isbn
			
				if(libros.get(x).getIsbn().toString().contains(DatoAFiltrar)) 
				escribir=true;
			break;
		case 7://Materias
			
				if(libros.get(x).getMaterias().toString().contains(DatoAFiltrar)) 
					escribir=true;
			break;
		}
			if(escribir) {
			
			System.out.println("\n" + Visualizacion.textoEspacios(30, libros.get(x).getTitulo().toString())
			+ Visualizacion.textoEspacios(15, libros.get(x).getEditorial().toString())
			+ Visualizacion.textoEspacios(15, Integer.toString(libros.get(x).getPaginas()))
			+ Visualizacion.textoEspacios(15, String.valueOf(libros.get(x).getAltura()))
			+ Visualizacion.textoEspacios(15, libros.get(x).getNotas().toString())
			+ Visualizacion.textoEspacios(30, libros.get(x).getIsbn().toString())
			+ Visualizacion.textoEspacios(30, libros.get(x).getMaterias().toString()));	
			}
		
		}
	
	}
}

