package reto_01;

import java.util.Scanner;

import controlador.controladorMenus;
import metodosComunes.FileChooser;

public class Aplicacion {
	/**
	 * Esta clase contiene el metodo Principal o Main.
	 * 
	 * @param args Array de Strings que se le pasa al metodo como parametro
	 */

	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// LLamada al menu
		FileChooser.comprobadorDeTeses=1;
		controladorMenus.opcionElegida(sc);

	}
}
