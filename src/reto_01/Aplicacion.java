package reto_01;

import java.util.Scanner;

import controlador.controladorMenus;

public class Aplicacion {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// LLamada al menu
		controladorMenus.opcionElegida(sc);

	}
}
