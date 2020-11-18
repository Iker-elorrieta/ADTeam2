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

	public Libro rellenarLibro(Scanner sc) {


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
		sc.nextLine();
		do{
			
		System.out.println("Introduce un titulo de libro ");
		titulo = sc.nextLine();
		// *sdfjbvkn*{a-z}(0-9)[0-30] ]
		}while(!v.validador("{a-z}(0-9)[30]", titulo)) ;
		
		do{
		System.out.println("Introduce una editorial ");
		editorial = sc.nextLine();
		}while(!v.validador("{a-z}(0-9)[30]", editorial)) ;

		
		do{
		System.out.println("Introduce un numero de paginas ");
		paginasSinParse = sc.nextLine();
		}while(!v.validador("(0-9)[5]", (paginasSinParse)));
		paginas = Integer.parseInt(paginasSinParse);

		do{
		System.out.println("Introduce un altura ");
		alturaSinParse = sc.nextLine();
		}while(!v.validador("(0-9)[6]", (alturaSinParse)));
		altura = Float.parseFloat(alturaSinParse);
		
		do{
		System.out.println("Introduce un notas ");
		notas = sc.nextLine();
		}while(!v.validador("{a-z}(0-9)[30]", (notas)));
	
		do {
			System.out.println("Introduce una isbn ");
			isbn = sc.nextLine();
		}while(!v.validarIsbn(isbn));
		
		
		do{
		System.out.println("Introduce una materias ");
		materias = sc.nextLine();
		}while(!v.validador("{a-z}(0-9)[30]", (materias)));

		Libro libro = new Libro(titulo, editorial, paginas, altura, notas, isbn, materias);

		return libro;

	}

}
