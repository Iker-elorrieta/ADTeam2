package reto_01;

import java.io.IOException;
import java.util.Scanner;

import leerFicheros.LeerFicheroCsv;
import metodosComunes.Validacion;

public class Aplicacion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int opcionSubMenu = 0;
		boolean error = true;
		boolean prueba;

		// Menu principal para preguntar si quiero leer, escribir y futuras opciones
		// bucle para la opcion de terminar del programa
		do {
			opcion = 0;
			do {
				// try catch para comprobar que me introduce un numero valido
				try {
					System.out.println(
							"Bienvenido al Menu principal:\n\n 1.- Leer ficheros \n 2.----------\n 3.----------\n 4.- Salir");
					opcion = sc.nextInt();

					System.out.println();

					if (!Validacion.mValidar(Integer.toString(opcion), "[1-4]{1,1}")) {
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
			switch (opcion) {
			case 1:
				do {
					do {
						try {
							opcionSubMenu = 0;
							System.out.println(
									"Que tipo de fichero quiere leer :\n 1.- Fichero CSV  \n 2.- Fichero XML\n 3.- Fichero TXT\n 4.- Volver");
							opcionSubMenu = sc.nextInt();
							System.out.println();
							// comprobacion de que se introduce un numero valido
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
					// switch con la ejecucion del submenu
					switch (opcionSubMenu) {
					case 1:

						LeerFicheroCsv.LeerCSV();
						break;// final de la accion elegida del submenu
					case 2:
						// Aqui ira las demas acciones del submenu
						break;
					}

				} while (opcionSubMenu != 4);

				break;// terminacion de la elecion del primer menu
			// otras opciones del menu principal
			case 2:
				// Escribir ficheros
				break;
			case 3:
				// otras opciones del menu
				break;
			}

		} while (opcion != 4);

	}

}