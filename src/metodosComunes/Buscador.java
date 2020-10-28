package metodosComunes;

import java.util.Scanner;

public class Buscador {

	public static void buscarLibro(int tipoDeArchivo,String Fichero,Scanner sc) {
		
		boolean error=true;
		int opcion = 0;
	
		do {
			try {	
				System.out.println("Que Deseas buscar? \n 1.- Titulo \n 2.- Editorial \n 3.-paginas \n 4.-Altura \n 5.-Notas \n 6.-Isbn \n 7.- Materias");
				opcion = sc.nextInt();
				System.out.println();
				// Comprobacion de que se intoduce un numero del 1 al 2
				if (opcion < 1 || opcion > 3) {
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
		
		
		
	}
	
}
