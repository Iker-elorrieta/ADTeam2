package reto_01;

import java.util.Scanner;

import metodosComunes.Validacion;

public class SubMenu {

	public static String subMenu(String opcionMenu) {

		Scanner sc = new Scanner(System.in);
		boolean error = true;
			do {
				try {
					opcionMenu = "";
					System.out.println(
							"Que tipo de fichero quiere leer :\n 1.- Fichero CSV  \n 2.- Fichero XML\n 3.- Fichero TXT\n 4.- Volver");
					opcionMenu = sc.nextLine();
					System.out.println();
					// comprobacion de que se introduce un numero valido
					if (!Validacion.mValidar(opcionMenu, "[1-4]{1,1}")) {
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

		return opcionMenu;
	}
	
}
