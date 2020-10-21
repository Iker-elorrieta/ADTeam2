package metodosComunes;

import java.util.Scanner;

import Objetos.Libro;

public class RellenarLibro {
	static Scanner sc = new Scanner(System.in);
	
	public static Libro rellenarLibro() {
		
		String titulo;
		String editorial;
		String paginas;
		String altura;
		String notas;
		String isbn;
		String materias;
		 
		boolean seguir;
		
		while (seguir == false || titulo.equals("salir")) {
			
		System.out.println("Introduce un titulo de libro ");
		titulo = sc.nextLine();
		seguir = Validador.validar(patron, titulo);
		
		}
		
		while (seguir == false || editorial.equals("salir")) {
			
			System.out.println("Introduce una editorial ");
			titulo = sc.nextLine();
			seguir = Validador.validar(patron, editorial);
			
			}
		
		while (seguir == false || paginas.equals("salir")) {
			
			System.out.println("Introduce un numero de paginas ");
			titulo = sc.nextLine();
			seguir = Validador.validar(patron, paginas);
			
			}
		
		while (seguir == false || notas.equals("salir")) {
			
			System.out.println("Introduce un libro ");
			titulo = sc.nextLine();
			seguir = Validador.validar(patron, notas);
			
			}
		
		while (seguir == false || isbn.equals("salir")) {
			
			System.out.println("Introduce un libro ");
			titulo = sc.nextLine();
			seguir = Validador.validar(patron, isbn);
			
			}
		
		while (seguir == false || materias.equals("salir")) {
			
			System.out.println("Introduce una materia ");
			titulo = sc.nextLine();
			seguir = Validador.validar(patron, materias);
			
			}
		
		
		
		
		
		
		return null;
			
	}
	
	
	
}
