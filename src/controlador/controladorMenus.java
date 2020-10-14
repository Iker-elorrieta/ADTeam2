package controlador;

import java.io.IOException;
import java.util.Scanner;
import leerFicheros.LeerFicheroCsv;
import leerFicheros.LeerFicheroTxt;
import leerFicheros.LeerFicheroXml;


public class controladorMenus {
	
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int opcion = 0;
		boolean error = true;
		do {
			try {
				System.out.println(
						"Bienvenido al Menu principal:\n\n 1.-Leer ficheros \n 2.-Escribir Fichero\n 3.----------\n 4.- Salir");
				opcion = sc.nextInt();

				System.out.println();

				if (opcion < 1 || opcion > 4) {
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

	public static int subMenuLeerFicheros() {

		int opcion = 0;
		boolean error = true;
		do {
			try {
				System.out.println(
						"Que tipo de fichero quiere leer :\n 1.- Fichero CSV  \n 2.- Fichero XML\n 3.- Fichero TXT\n 4.- Volver");
				opcion = sc.nextInt();
				System.out.println();
				if (opcion < 1 || opcion > 4) {
					System.out.println("\n NUMERO INEXISTENTE\n");
					System.out.println(" Debe introducir una de las siguientes opciones (1-4):\n");
				} else {
					error = false;
				}
			} catch (Exception e) {
				System.out.println(
						"\n ¡ERROR! Debe introducir un numero entero.\n\n Selecciona una de las siguientes opciones (1-4):\n");
				sc.nextLine();
			}
		} while (error);

		return opcion;
	}

	public static boolean opcionElegida() throws IOException {
		int opcion;
		int opcionSubMenu;
		do {
			opcion = controladorMenus.menu();
			if (opcion != 4) {

				opcionSubMenu = controladorMenus.subMenuLeerFicheros();
				if (opcionSubMenu != 4) {

					switch (opcionSubMenu) {
					case 1:
						LeerFicheroCsv.LeerCSV();
						break;
					case 2:
						LeerFicheroXml.leerXml();
						break;
					case 3:
						LeerFicheroTxt.LeerTxt();
						break;
					}

				}
			}
			
		} while (opcion != 4);
		return true;

	}

}
