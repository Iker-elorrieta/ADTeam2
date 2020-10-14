package escribirFicheros;

import java.util.Scanner;

import org.w3c.dom.Element;

public class EscribirXml {

	private String titulo;
	private String editorial;
	private int paginas;
	private double altura;
	private int notas;
	private String isbn;
	private String materias;

	public EscribirXml() {

		xmlData();
	}

	private boolean xmlData() {

		Scanner sc = new Scanner(System.in);

		boolean salir = false;

		System.out.println("Introduzca el título del libro: ");
		this.titulo = sc.next();

		System.out.println("Introdusca la editorial: ");
		this.editorial = sc.next();

		while (salir == false) {
			System.out.println("Introduzca altura: ");
			try {
				this.altura = sc.nextDouble();
				salir = true;
			} catch (Exception e) {
				System.out.println("¿Dato incorrecto!");
			}
		}
		while (salir == false) {
			System.out.println("Introduzca notas: ");
			try {
				this.altura = sc.nextInt();
				salir = true;
			} catch (Exception e) {
				System.out.println("¿Dato incorrecto!");
			}

		}
		System.out.println("Introdusca la Isbn: ");
		this.isbn = sc.next();
		
		System.out.println("Introdusca la materias: ");
		this.materias = sc.next();
		

		return false;

	}

}
