package metodosComunes;

import java.util.ArrayList;
import java.util.Scanner;

import Objetos.Libro;


public class RellenarLibro {

	static Scanner sc = new Scanner(System.in);

	public static ArrayList<Libro> rellenarLibro() {

		ArrayList<Libro> libros = new ArrayList<Libro>();

		String titulo;
		String Editorial;
		String Paginas;
		String Altura;
		String Notas;
		String Isbn;
		String Materias;

		System.out.println("Introduce un titulo");
		titulo = sc.nextLine();
		System.out.println("Introduce un Editorial");
		Editorial = sc.nextLine();
		System.out.println("Introduce un Paginas");
		Paginas = sc.nextLine();
		System.out.println("Introduce un Altura");
		Altura = sc.nextLine();
		System.out.println("Introduce un Notas");
		Notas = sc.nextLine();
		System.out.println("Introduce un Isbn");
		Isbn = sc.nextLine();
		System.out.println("Introduce un Materias");
		Materias = sc.nextLine();

		Libro libro = new Libro(titulo, Editorial, Paginas, Altura, Notas, Isbn, Materias);
		libros.add(libro);
		
		return libros;

	}
}
