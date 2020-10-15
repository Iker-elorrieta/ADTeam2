package reto_01;

import java.io.IOException;
import java.util.Scanner;

import controlador.controladorMenus;

public class Aplicacion {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// LLamada al menu
		controladorMenus.opcionElegida(sc);
		

	}
}
