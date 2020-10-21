package test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import Objetos.Libro;
import controlador.controladorMenus;
import leerFicheros.LeerFicheroCsv;
import leerFicheros.LeerFicheroTxt;
import leerFicheros.LeerFicheroXml;
import metodosComunes.Visualizacion;


class Test {
	
	Scanner reader = new Scanner(System.in);
	
	@org.junit.jupiter.api.Test
	public void tesVisualicacion() {
		String[] args = null;
		int longuitud = 10;
		String miString = "hola";
		
		String opcion = Visualizacion.textoEspacios(longuitud, miString);
		assertEquals("hola     ", opcion);

	}

	@org.junit.jupiter.api.Test
	public void testControladorMenu() {

		String input = "r \n 5 \n 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		
		
		int opcion = controladorMenus.menu(reader);

		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorSubMenus() {

		String input = "r \n 5 \n 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		int opcion = controladorMenus.subMenuLeerFicheros(reader);

		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegida() {

		String input = "1 \n 1 \n 2 \n  1\n 2\n 4\n 1\n 3\n 4\n 2\n ";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	
		int opcion = controladorMenus.opcionElegida(reader);

		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerCsv(){

		String input = "fichero1";
		

		ArrayList<Libro> opcion = LeerFicheroCsv.LeerCSV(input);

		assertEquals(true, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerCsvError(){

		String input = "aaa.txt";

		ArrayList<Libro> opcion = LeerFicheroCsv.LeerCSV(input);

		assertEquals(false, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerTxt() {

		String input = "fichero3";

		

		Boolean opcion = LeerFicheroTxt.LeerTxt(input);

		assertEquals(true, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerTxtError(){

		String input = "aaa.txt";

		Boolean opcion = LeerFicheroTxt.LeerTxt(input);

		assertEquals(false, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerXml(){

		String input = "fichero2";
		
		Boolean opcion = LeerFicheroXml.leerXml(input);
		assertEquals(true, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerXmlError() {

		String input = "aaa.xml";

		Boolean opcion = LeerFicheroXml.leerXml(input);

		assertEquals(false, opcion);
	}

}