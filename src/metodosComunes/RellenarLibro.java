package metodosComunes;

import java.util.Scanner;

import Objetos.Libro;

public class RellenarLibro {
	
	static Scanner sc = new Scanner(System.in);
	
	public static Libro rellenarLibro() {
		
		String titulo = null;;
		String editorial = null;;
		String paginas = null;;
		String altura = null;
		String notas = null;
		String isbn = null;;
		String materias = null;;
		 
		
		
		
			
		System.out.println("Introduce un titulo de libro ");
		titulo = sc.nextLine();
	
		
		
			
			System.out.println("Introduce una editorial ");
			titulo = sc.nextLine();
			
			
			
		
		
			
			System.out.println("Introduce un numero de paginas ");
			titulo = sc.nextLine();
			
			
			
		
	
			
			System.out.println("Introduce un libro ");
			titulo = sc.nextLine();
			
			
			
		
		
			
			System.out.println("Introduce un libro ");
			titulo = sc.nextLine();
			
		
		
			
			System.out.println("Introduce una materia ");
			titulo = sc.nextLine();
			
	
		Libro libro = new Libro (titulo, editorial, paginas, altura, notas, isbn, materias);
		return libro ;
			
	}
	
	
	
}
