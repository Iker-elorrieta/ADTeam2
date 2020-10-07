package reto_01;

import java.io.IOException;
import java.util.Scanner;
import leerFicheros.LeerFicheroCsv;
import leerFicheros.LeerFicheroXml;
import leerFicheros.LeerFicheroTxt;
import metodosComunes.Validacion;

public class Aplicacion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String opcion = "";
		String opcionSubMenu = "";
		boolean error = true;
		boolean prueba;

		// Menu principal para preguntar si quiero leer, escribir y futuras opciones
		// bucle para la opcion de terminar del programa
		do {
			error = true;
			opcion = "";
			do {
				// try catch para comprobar que me introduce un numero valido
				try {
					System.out.println(
							"Bienvenido al Menu principal:\n\n 1.- Leer ficheros \n 2.----------\n 3.----------\n 4.- Salir");
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
			// switch con la opcion elegida del menu principal
			switch (Integer.parseInt(opcion)) {
			case 1:
				do {
					error=true;
					do {
						try {
							opcionSubMenu = "";
							System.out.println(
									"Que tipo de fichero quiere leer :\n 1.- Fichero CSV  \n 2.- Fichero XML\n 3.- Fichero TXT\n 4.- Volver");
							opcionSubMenu = sc.nextLine();
							System.out.println();
							// comprobacion de que se introduce un numero valido
							if (!Validacion.mValidar(opcionSubMenu, "[1-4]{1,1}")) {
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
					// switch con la ejecucion del submenu
					switch (Integer.parseInt(opcionSubMenu)) {
					case 1:

						LeerFicheroCsv.LeerCSV();
						break;// final de la accion elegida del submenu
					case 2:
						LeerFicheroXml.leerXml();
						System.out.println();
						// Aqui ira las demas acciones del submenu
						break;
					case 3:
						LeerFicheroTxt.LeerTxt("fichero.txt");//Le pasamos el nombre del fichero que queremos leer
						break;// final de la accion elegida del submenu
					}

				} while (Integer.parseInt(opcionSubMenu) != 4);

				break;// terminacion de la elecion del primer menu
			// otras opciones del menu principal
			case 2:
				// Escribir ficheros
				break;
			case 3:
				// otras opciones del menu
				break;
			}

		} while (Integer.parseInt(opcion) != 4);

	}

}
