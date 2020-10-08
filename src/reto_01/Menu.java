package reto_01;

import java.util.Scanner;
import metodosComunes.Validacion;

public class Menu {

	public static String menu() {
		String opcion = "";
		Scanner sc = new Scanner(System.in);
		boolean error = true;
		
			do {
				// try catch para comprobar que me introduce un numero valido
				try {
					System.out.println(
							"Bienvenido al Menu principal:\n\n 1.-Leer ficheros \n 2.-Escribir Fichero\n 3.----------\n 4.- Salir");
					opcion = sc.nextLine();

					System.out.println();

					if (!Validacion.mValidar(opcion, "[1-4]{1,1}")) {
						System.out.println("\n NUMERO INEXISTENTE\n");
						System.out.println(" Debe introducir una de las siguientes opciones (1-4):\n");
					} else {
						error = false;
					}
					// Excepcion de que se introduce un numero valido
				} catch (Exception e) {
					System.out.println(
							"\n ¡ERROR! Debe introducir un numero entero.\n\n Selecciona una de las siguientes opciones (1-4):\n");
					sc.nextLine();
				}

			} while (error);
	
		return opcion;
	}
	
	
	
}
