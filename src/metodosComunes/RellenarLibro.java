package metodosComunes;

import java.util.Scanner;

import objetos.Libro;

public class RellenarLibro {
	/**
	 * Esta clase contiene el metodo de rellenar Libro 
	 * @param sc Nombre del scanner que se le pasa al metodo como parametro para los tests
	 * @author Asier
	 * @return Retorna un objeto Libro
	 */

	public static Libro rellenarLibro(Scanner sc) {


		String titulo;
		String editorial;
		int paginas;
		String paginasSinParse;
		float altura;
		String alturaSinParse;
		String notas;
		String isbn;
		String materias;
		Validador v = new Validador();
		do{
		System.out.println("Introduce un titulo de libro ");
		titulo = sc.next();
		// *sdfjbvkn*{a-z}(0-9)[0-30] ]
		}while(!v.validador("{a-z}(0-9)[30]", titulo)) ;
		
		do{
		System.out.println("Introduce una editorial ");
		editorial = sc.next();
		}while(!v.validador("{a-z}(0-9)[30]", editorial)) ;

		
		do{
		System.out.println("Introduce un numero de paginas ");
		paginasSinParse = sc.next();
		}while(!v.validador("(0-9)[4]", (paginasSinParse)));
		paginas = Integer.parseInt(paginasSinParse);

		do{
		System.out.println("Introduce un altura ");
		alturaSinParse = sc.next();
		}while(!v.validador("(0-9)[6]", (alturaSinParse)));
		altura = Float.parseFloat(alturaSinParse);
		
		do{
		System.out.println("Introduce un notas ");
		notas = sc.next();
		}while(!v.validador("{a-z}(0-9)[30]", (notas)));
	
		System.out.println("Introduce una isbn ");
		isbn = sc.next();
		
		do{
		System.out.println("Introduce una materias ");
		materias = sc.next();
		}while(!v.validador("{a-z}(0-9)[30]", (materias)));

		Libro libro = new Libro(titulo, editorial, paginas, altura, notas, isbn, materias);

		return libro;

	}

}
