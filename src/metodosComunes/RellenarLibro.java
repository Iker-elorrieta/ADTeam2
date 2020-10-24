package metodosComunes;

import java.util.Scanner;

import objetos.Libro;

public class RellenarLibro {

	public static Libro rellenarLibro(Scanner sc) {

		// He metido una variable booleana para poder generar un libro vacio y generar
		// pruabas automaticas

//		Validacion v = new Validacion();

		String titulo;
		String editorial;
		String paginas;
		String altura;
		String notas;
		String isbn;
		String materias;

		System.out.println("Introduce un titulo de libro ");
		titulo = sc.nextLine();
//		while (v.validarTitulo(titulo) == false) {
//			System.out.println("Introduce un titulo de libro ");
//			titulo = sc.nextLine();
//		}

		System.out.println("Introduce una editorial ");
		editorial = sc.nextLine();
//		while (v.validarEditorial(editorial) == false) {
//			System.out.println("Introduce una editorial ");
//			editorial = sc.nextLine();
//		}

		System.out.println("Introduce un numero de paginas ");
		paginas = sc.nextLine();
//		while (v.validarPaginas(paginas) == false) {
//			System.out.println("Introduce un numero de paginas ");
//			paginas = sc.nextLine();
//		}

		System.out.println("Introduce un altura ");
		altura = sc.nextLine();
//		while (v.validarAltura(altura) == false) {
//			System.out.println("Introduce un altura ");
//			altura = sc.nextLine();
//		}

		System.out.println("Introduce un notas ");
		notas = sc.nextLine();
//		while (v.validarNotas(notas) == false) {
//			System.out.println("Introduce un notas ");
//			notas = sc.nextLine();
//		}

		System.out.println("Introduce una isbn ");
		isbn = sc.nextLine();
//		while (v.validarIsbn(isbn) == false) {
//			System.out.println("Introduce una isbn ");
//			isbn = sc.nextLine();
//		}

		System.out.println("Introduce una materias ");
		materias = sc.nextLine();
//		while (v.validarMaterias(materias) == false) {
//			System.out.println("Introduce una materias ");
//			materias = sc.nextLine();
//		}

		Libro libro = new Libro(titulo, editorial, paginas, altura, notas, isbn, materias);

		return libro;

	}

}
