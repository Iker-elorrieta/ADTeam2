package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import leerFicheros.LeerFicheroCsv;
import leerFicheros.LeerFicheroTxt;
import leerFicheros.LeerFicheroXml;

public class controladorMenus {

	static Scanner sc = new Scanner(System.in);

	/**
	 * Esta clase contiene el metodo de opcion del menu principal
	 * @param sc Entrada de teclado automatica para la realizacion de las pruebas
	 * @author jonatan,fran
	 * @return retorna un numero entero que sera la opcion elegida
	 */
	public static int menu(Scanner sc) {
		int opcion = 0;
		boolean error = true;
		do {
			try {
				System.out.println(
						"Bienvenido al Menu principal:\n\n 1.-Leer ficheros \n 2.-Escribir Fichero\n 3.----------\n 4.- Salir");
				opcion = sc.nextInt();
				System.out.println();
				// Comprobacion de que se intoduce un numero del 1 al 4
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

	/**
	 * Esta clase contiene el metodo de opcion del menu principal
	 * @param sc Entrada de teclado automatica para la realizacion de las pruebas
	 * @author jonatan,fran
	 * @return retorna un numero entero que sera la opcion elegida
	 */
	public static int subMenuLeerFicheros(Scanner sc) {

		int opcion = 0;
		boolean error = true;
		do {
			try {
				System.out.println(
						"Que tipo de fichero quiere leer :\n 1.- Fichero CSV  \n 2.- Fichero XML\n 3.- Fichero TXT\n 4.- Volver");
				opcion = sc.nextInt();
				System.out.println();
				// Comprobacion de que se intoduce un numero del 1 al 4
				if (opcion < 1 || opcion > 4) {
					System.out.println("\n NUMERO INEXISTENTE\n");
					System.out.println(" Debe introducir una de las siguientes opciones (1-4):\n");
				} else {
					error = false;
				}
			} catch (Exception e) {
				// Mensaje de error si el usuario introduce letras
				System.out.println(
						"\n ¡ERROR! Debe introducir un numero entero.\n\n Selecciona una de las siguientes opciones (1-4):\n");
				sc.nextLine();
			}
		} while (error);

		return opcion;
	}

	/**
	 * Metodo donde se llama al metodo de la opcion elegida en el SubMenu de LeerFichero
	 * @param sc Entrada de teclado automatica para la realizacion de las pruebas
	 * @author jonatan,fran
	 * @return retorna un 1 para comprobar que termina correctamente
	 * @throws IOException clase general de excepciones producidas por operaciones de E / S fallidas o interrumpidas.
	 * 
	 * 
	 */
	public static int opcionElegida(Scanner sc) throws IOException {
		int opcion = 0;
		int opcionSubMenu = 0;
		String nombreFichero = "";
		do {
			opcion = controladorMenus.menu(sc);
			// Comprobacion de que el usuario no haya elegido la opcion 4.- Salir
			if (opcion != 4) {

				opcionSubMenu = controladorMenus.subMenuLeerFicheros(sc);
				// Comprobacion de que el usuario no haya elegido la opcion 4.- Salir
				if (opcionSubMenu != 4) {

					switch (opcionSubMenu) {
					case 1:

						System.out.println("Introduzca el nombre del CSV con extension :");
						nombreFichero = sc.next();
						LeerFicheroCsv.LeerCSV(nombreFichero);
						System.out.println();
						break;// final de la accion elegida del submenu
					case 2:

						System.out.println("Introduzca el nombre del XML con extension :");
						nombreFichero = sc.next();
						LeerFicheroXml.leerXml(nombreFichero);
						System.out.println();
						// Aqui ira las demas acciones del submenu
						break;
					case 3:

						System.out.println("Introduzca el nombre del TXT con extension :");
						nombreFichero = sc.next();
						LeerFicheroTxt.LeerTxt(nombreFichero);// Le pasamos el nombre del fichero que queremos leer
						System.out.println();
						break;// final de la accion elegida del submenu
					}

				}
			}

		} while (opcion != 4);
		return 1;

	}

}
