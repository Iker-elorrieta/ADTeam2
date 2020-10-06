package reto_01;

import java.io.IOException;
import java.util.Scanner;

import metodosComunes.LeerFicheroCsv;

public class Aplicacion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		boolean error = true;
		
		do {
			try {
				System.out.println("Bienvenido :\n 1.- Leer fichero TXT \n 2.- Leer fichero XML\n 3.- Leer fichero CSV\n 4.- Salir");
				opcion = sc.nextInt();
				System.out.println();
				if (opcion < 1 || opcion > 4) {
					System.out.println("\n NUMERO INEXISTENTE\n");
					System.out.println(" Debe introducir una de las siguientes opciones (1-3):\n");
				} else {
					error = false;
				}
			} catch (Exception e) {
				System.out.println(
						"\n ¡ERROR! Debe introducir un numero entero.\n\n Selecciona una de las siguientes opciones (1-4):\n");
				sc.next();
			}
		} while (error);
		
		switch (opcion) {
		case 1:

		case 2:

		case 3:
		 LeerFicheroCsv.LeerCSV();	
		}

	}

}