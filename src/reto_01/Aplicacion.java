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
		String opcion;

		do {
			opcion = Menu.menu();
			if (!opcion.equals("4")) {

				String opcionSubMenu = SubMenu.subMenu(opcion);
				if (!opcionSubMenu.equals("4")) {

					switch (Integer.parseInt(opcionSubMenu)) {
					case 1:
						LeerFicheroCsv.LeerCSV();
						System.out.println();
						break;// final de la accion elegida del submenu
					case 2:
						LeerFicheroXml.leerXml();
						System.out.println();
						// Aqui ira las demas acciones del submenu
						break;
					case 3:
						LeerFicheroTxt.LeerTxt("fichero.txt");// Le pasamos el nombre del fichero que queremos leer
						System.out.println();
						break;// final de la accion elegida del submenu
					}

				}
			}
		} while (!opcion.equals("4"));

	}
}
