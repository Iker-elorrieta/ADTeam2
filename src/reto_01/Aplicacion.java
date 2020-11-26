package reto_01;

import java.util.Scanner;

import controlador.controladorMenus;
import leerFicheros.LeerFicheroXml;
import metodosComunes.FileChooser;

public class Aplicacion {
	/**
	 * Esta clase contiene el metodo Principal o Main.
	 * 
	 * @param args Array de Strings que se le pasa al metodo como parametro
	 */
	


	public static void main(String[] args) {
		// LLamada al menu
		Scanner sc = new Scanner(System.in);
		FileChooser.comprobadorDeTeses=0;
		controladorMenus cm = new controladorMenus();
		cm.opcionElegida(sc);

	}
}
