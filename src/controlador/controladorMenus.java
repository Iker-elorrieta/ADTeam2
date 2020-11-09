package controlador;

import java.util.ArrayList;
import java.util.Scanner;
import escribirFicheros.EscribirCsv;
import escribirFicheros.EscribirXml;
import leerFicheros.LeerFicheroCsv;
import leerFicheros.LeerFicheroTxt;
import leerFicheros.LeerFicheroXml;
import metodosComunes.EscribirPantalla;
import metodosComunes.Validador;
import objetos.Libro;

public class controladorMenus {

	static Scanner sc = new Scanner(System.in);
	final static int EscribirTodos = 0;

	/**
	 * Esta clase contiene el metodo de opcion del menu principal
	 * 
	 * @param sc Entrada de teclado automatica para la realizacion de las pruebas
	 * @author jonatan,fran
	 * @return retorna un numero entero que sera la opcion elegida
	 */
	public static int menu(Scanner sc) {
		int opcion = 0;
		boolean error = true;

		System.out.println("------BIENVENIDO AL MENU PRINCIPAL------:\n\n");
		do {
			try {
				System.out.println(
						"Elija una opcion:\n\n 1.-Leer ficheros \n 2.-Escribir Ficheros \n 3.-Buscar en Fichero \n 4.- Salir");
				opcion = sc.nextInt();
				System.out.println();
				// Comprobacion de que se intoduce un numero del 1 al 2
				if (opcion < 1 || opcion > 4) {
					System.out.println("\n NUMERO INEXISTENTE\n");
					System.out.println(" Debe introducir una de las siguientes opciones (1-2):\n");
				} else {
					error = false;
				}

				// Excepcion de que se introduce un numero valido
			} catch (Exception e) {
				System.out.println(
						"\n !ERROR! Debe introducir un numero entero.\n\n Selecciona una de las siguientes opciones (1-4):\n");
				sc.nextLine();
			}

		} while (error);

		return opcion;
	}

	/**
	 * Esta clase contiene el metodo de opcion del menu principal
	 * 
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
						"\n !ERROR! Debe introducir un numero entero.\n\n Selecciona una de las siguientes opciones (1-4):\n");
				sc.nextLine();
			}
		} while (error);

		return opcion;
	}

	public static int subMenuEscribirFicheros(Scanner sc) {

		int opcion = 0;
		boolean error = true;
		do {
			try {
				System.out.println(
						"Que tipo de fichero quiere Escribir :\n 1.- Fichero CSV  \n 2.- Fichero XML\n 3.- Fichero TXT\n 4.- Volver");
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

	public static int subMenuBuscador(Scanner sc) {

		int opcion = 0;
		boolean error = true;
		do {
			try {
				System.out.println(
						"Por que quiere buscar :\n 1.- Titulo \n 2.- Editorial\n 3.- Paginas\n 4.- Altura \n 5.- Notas \n 6.- Isbn \n 7.- Materias \n 8.- Volver");
				opcion = sc.nextInt();
				System.out.println();
				// Comprobacion de que se intoduce un numero del 1 al 9
				if (opcion < 1 || opcion > 8) {
					System.out.println("\n NUMERO INEXISTENTE\n");
					System.out.println(" Debe introducir una de las siguientes opciones (1-9):\n");
				} else {
					error = false;
				}
			} catch (Exception e) {
				// Mensaje de error si el usuario introduce letras
				System.out.println(
						"\n ¡ERROR! Debe introducir un numero entero.\n\n Selecciona una de las siguientes opciones (1-8):\n");
				sc.nextLine();
			}
		} while (error);

		return opcion;
	}
	public static int subMenuTipoDeBusqueda(Scanner sc) {

		int opcion = 0;
		boolean error = true;
		do {
			try {
				System.out.println(
						"Que tipo de busqueda desea realizar? \n1.- Sencilla \n 2.-Con Codigo");
				opcion = sc.nextInt();
				System.out.println();
				// Comprobacion de que se intoduce un numero del 1 al 9
				if (opcion < 1 || opcion > 3) {
					System.out.println("\n NUMERO INEXISTENTE\n");
					System.out.println(" Debe introducir una de las siguientes opciones (1-2):\n");
				} else {
					error = false;
				}
			} catch (Exception e) {
				// Mensaje de error si el usuario introduce letras
				System.out.println(
						"\n ¡ERROR! Debe introducir un numero entero.\n\n Selecciona una de las siguientes opciones (1-2):\n");
				sc.nextLine();
			}
		} while (error);

		return opcion;
	}

	/**
	 * Metodo donde se llama al metodo de la opcion elegida en el SubMenu de
	 * LeerFichero
	 * 
	 * @param sc Entrada de teclado automatica para la realizacion de las pruebas
	 * @author jonatan,fran
	 * @return retorna un 1 para comprobar que termina correctamente
	 * 
	 */
	public static int opcionElegida(Scanner sc) {

		int opcion = 0;
		int opcionSubMenu = 0;
		String nombreFichero = "";
		Validador validador = new Validador();
		ArrayList<Libro> libros = new ArrayList<Libro>();

		do {
			opcion = controladorMenus.menu(sc);
			// Comprobacion de que el usuario no haya elegido la opcion 4.- Salir
			if (opcion != 4) {
				switch (opcion) {
				case 1:
					opcionSubMenu = controladorMenus.subMenuLeerFicheros(sc);
					// Comprobacion de que el usuario no haya elegido la opcion 4.- Salir
					if (opcionSubMenu != 4) {

						switch (opcionSubMenu) {
						case 1:

							System.out.println("Introduzca el nombre del CSV :");
							nombreFichero = sc.next();
							LeerFicheroCsv.LeerCSV(nombreFichero, libros, sc);
							EscribirPantalla.escribirLibro(libros, sc);

							System.out.println();
							break;// final de la accion elegida del submenu
						case 2:
							System.out.println("Introduzca el nombre del XML :");
							nombreFichero = sc.next();
							LeerFicheroXml.leerXml(nombreFichero, libros, sc);
							EscribirPantalla.escribirLibro(libros, sc);
							System.out.println();
							break;
						case 3:
							System.out.println("Introduzca el nombre del TXT :");
							nombreFichero = sc.next();
							LeerFicheroTxt.LeerTxt(nombreFichero, libros, sc);// Le pasamos el nombre del fichero que
																				// queremos leer
							EscribirPantalla.escribirLibro(libros, sc);
							System.out.println();
							break;// final de la accion elegida del submenu
						}

					}
					break;
				case 2:
					opcionSubMenu = controladorMenus.subMenuEscribirFicheros(sc);
					// Comprobacion de que el usuario no haya elegido la opcion 4.- Salir
					if (opcionSubMenu != 4) {
						switch (opcionSubMenu) {
						case 1:
							System.out.println("Introduzca el nombre del CSV :");
							nombreFichero = sc.next();
							EscribirCsv.EscribeFichero(nombreFichero, sc);
							System.out.println();
							break;// final de la accion elegida del submenu
						case 2:
							System.out.println("Introduzca el nombre del XML :");
							nombreFichero = sc.next();
							EscribirXml xml = new EscribirXml();
							xml.generarXml(nombreFichero, sc);
							System.out.println();
							// Aqui ira las demas acciones del submenu*/
							break;
						case 3:
							System.out.println("Introduzca el nombre del TXT :");
							nombreFichero = sc.next();
							escribirFicheros.EscribirTxt.añadirTxt(nombreFichero, sc);// Le pasamos el nombre del
																						// fichero que queremos leer
							System.out.println();
							break;// final de la accion elegida del submenu
						}

					}
					break;
				case 3:
					int busqueda;
					int tipoDeBusqueda=1;
					opcionSubMenu = controladorMenus.subMenuBuscador(sc);
					if (opcionSubMenu !=3 && opcionSubMenu!=4) {
					tipoDeBusqueda= controladorMenus.subMenuTipoDeBusqueda(sc);
					}
					final String simbolo = "\\*";
					String dato;
					String text;
					ArrayList<Libro> librosEncontrados;
					// Comprobacion de que el usuario no haya elegido la opcion 4.- Salir

					if (opcionSubMenu < 8) {

						switch (opcionSubMenu) {

						case 1:
							if (tipoDeBusqueda== 1) {
							dato = subMenuBuscarPorPalabra(sc);
							validador.validador(dato, "");

							busqueda = validador.getLugarDeTexto();
							
							if (busqueda == 2) {
								text = dato.split(simbolo)[1];
							}
							else {
								text = dato.split(simbolo)[0];
							}
							}
							else {
								System.out.println("Introduzca el patron");
								dato=sc.next();
								validador.comprobarPatron(dato);
								busqueda=validador.getLugarDeTexto();
								text=validador.getTextoSinParentesis();
							}
							librosEncontrados = metodosComunes.BuscarLibro.buscar(libros, "titulo", text, busqueda);
							EscribirPantalla.escribirLibro(librosEncontrados, sc);
							break;
						case 2:
							if (tipoDeBusqueda== 1) {
							dato = subMenuBuscarPorPalabra(sc);
							validador.validador(dato, "");

							busqueda = validador.getLugarDeTexto();
							if (busqueda == 2) {
								text = dato.split(simbolo)[1];
							}
							else {
								text = dato.split(simbolo)[0];
							}
							}else {
								System.out.println("Introduzca el patron");
								dato=sc.next();
								validador.comprobarPatron(dato);
								busqueda=validador.getLugarDeTexto();
								text=validador.getTextoSinParentesis();
							}
							librosEncontrados = metodosComunes.BuscarLibro.buscar(libros, "editorial", text, busqueda);
							EscribirPantalla.escribirLibro(librosEncontrados, sc);
							break;
						case 3:

							do {
								System.out.println(
										"Que quiere buscar :\n 1.-Numero Concreto \n 2.- Hasta numero X \n 3.- Mas de X numero \n");
								busqueda = sc.nextInt();
							} while (busqueda > 4);
							do {
								System.out.println("Que numero de paginas");

								dato = sc.next();

							} while (validador.validador("(1-9)[3]", dato));

							librosEncontrados = metodosComunes.BuscarLibro.buscar(libros, "paginas", dato, busqueda);
							EscribirPantalla.escribirLibro(librosEncontrados, sc);
							break;
						case 4:
							do {
								System.out.println(
										"Que quiere buscar :\n 1.- Numero Concreto \n 2.- Hasta numero X \n 3.- Mas de X numero \n");
								busqueda = sc.nextInt();
							} while (busqueda > 4);
							do {
								System.out.println("Que tamaño");

								dato = sc.next();

							} while (!validador.validador("(1-9)[6]", dato));
							librosEncontrados = metodosComunes.BuscarLibro.buscar(libros, "altura", dato, busqueda);
							break;
						case 5:
							if (tipoDeBusqueda== 1) {
							dato = subMenuBuscarPorPalabra(sc);
							validador.validador(dato, "");

							busqueda = validador.getLugarDeTexto();
							
							if (busqueda == 2) {
								text = dato.split(simbolo)[1];
							}
							else {
								text = dato.split(simbolo)[0];
							}
							}else {
								System.out.println("Introduzca el patron");
								dato=sc.next();
								validador.comprobarPatron(dato);
								busqueda=validador.getLugarDeTexto();
								text=validador.getTextoSinParentesis();
							}
							
							librosEncontrados = metodosComunes.BuscarLibro.buscar(libros, "notas", text, busqueda);
							EscribirPantalla.escribirLibro(librosEncontrados, sc);
							break;
						case 6:
							if (tipoDeBusqueda== 1) {
							dato = subMenuBuscarPorPalabra(sc);
							validador.validador(dato, "");

							busqueda = validador.getLugarDeTexto();
							if (busqueda == 2) {
								text = dato.split(simbolo)[1];
							}
							else {
								text = dato.split(simbolo)[0];
							}
						}else {
							System.out.println("Introduzca el patron");
							dato=sc.next();
							validador.comprobarPatron(dato);
							busqueda=validador.getLugarDeTexto();
							text=validador.getTextoSinParentesis();
						}
							librosEncontrados = metodosComunes.BuscarLibro.buscar(libros, "isbn", text, busqueda);
							EscribirPantalla.escribirLibro(librosEncontrados, sc);
							break;
						case 7:
							if (tipoDeBusqueda== 1) {
							dato = subMenuBuscarPorPalabra(sc);
							validador.validador(dato, "");

							busqueda = validador.getLugarDeTexto();
							if (busqueda == 2) {
								text = dato.split(simbolo)[1];
							}
							else {
								text = dato.split(simbolo)[0];
							}
					}else {
						System.out.println("Introduzca el patron");
						dato=sc.next();
						validador.comprobarPatron(dato);
						busqueda=validador.getLugarDeTexto();
						text=validador.getTextoSinParentesis();
					}
							librosEncontrados = metodosComunes.BuscarLibro.buscar(libros, "materias", text, busqueda);
							EscribirPantalla.escribirLibro(librosEncontrados, sc);
							break;

						}
					}
				}
			}
		} while (opcion != 4);
		return 1;

	}



	public static String subMenuBuscarPorPalabra(Scanner sc) {

		String patron = null;
		String empieza = null;
		String termina = null;
		int opcion = 0;
		boolean error = true;
		do {

			try {
				System.out
						.println("Por que quiere buscar :\n 1.- Empieza \n 2.- Termina\n 3.- Contiene \n 4.- Volver ");
				
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Introduce por que quiere empezar a buscar");
					empieza = sc.next();
					patron = empieza + "*";
					break;
				case 2:
					System.out.println("Introduce por que quiere terminar a buscar");
					termina = sc.next();
					patron = "*" + termina;
					break;
				case 3:
					System.out.println("Introduce que contiene lo que quiere  buscar");
					empieza = sc.next();
					patron = "*" + empieza + "*";
					break;
				}
				System.out.println();
				if (opcion < 1 || opcion > 4) {
					System.out.println("\n NUMERO INEXISTENTE\n");
					System.out.println(" Debe introducir una de las siguientes opciones (1-5):\n");
				} else {
					error = false;
				}
			} catch (Exception e) {
			}
		} while (error);

		return patron;
	}

}
