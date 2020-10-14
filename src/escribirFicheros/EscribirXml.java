package escribirFicheros;

import java.util.Scanner;

public class EscribirXml {
	
	
	private String titulo;
	private String editorial;
	private int paginas;
	private double altura;
	private int notas;
	private String isbn;
	private String materias;
	
	public EscribirXml() {
		
	}
	
	private boolean xmlData() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduzca el título del libro");
		this.titulo = sc.next();
				
		return false;
		
	}

}
