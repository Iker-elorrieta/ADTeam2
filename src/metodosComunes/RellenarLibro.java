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
		float altura;
		String notas;
		String isbn;
		String materias;

		System.out.println("Introduce un titulo de libro ");
		titulo = sc.next();
		

		System.out.println("Introduce una editorial ");
		editorial = sc.next();
		

		System.out.println("Introduce un numero de paginas ");
		paginas = sc.nextInt();
		

		System.out.println("Introduce un altura ");
		altura = sc.nextFloat();
		
		System.out.println("Introduce un notas ");
		notas = sc.next();
		

		System.out.println("Introduce una isbn ");
		isbn = sc.next();
		

		System.out.println("Introduce una materias ");
		materias = sc.next();
		

		Libro libro = new Libro(titulo, editorial, paginas, altura, notas, isbn, materias);

		return libro;

	}

}
