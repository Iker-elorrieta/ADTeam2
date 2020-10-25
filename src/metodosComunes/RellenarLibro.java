package metodosComunes;

import java.util.Scanner;

import objetos.Libro;

public class RellenarLibro {

	public static Libro rellenarLibro(Scanner sc) {

		
		// pruabas automaticas



		String titulo;
		String editorial;
		String paginas;
		String altura;
		String notas;
		String isbn;
		String materias;

		System.out.println("Introduce un titulo de libro ");
		titulo = sc.nextLine();
		

		System.out.println("Introduce una editorial ");
		editorial = sc.nextLine();
		

		System.out.println("Introduce un numero de paginas ");
		paginas = sc.nextLine();
		

		System.out.println("Introduce un altura ");
		altura = sc.nextLine();
		
		System.out.println("Introduce un notas ");
		notas = sc.nextLine();
		

		System.out.println("Introduce una isbn ");
		isbn = sc.nextLine();
		

		System.out.println("Introduce una materias ");
		materias = sc.nextLine();
		

		Libro libro = new Libro(titulo, editorial, paginas, altura, notas, isbn, materias);

		return libro;

	}

}
