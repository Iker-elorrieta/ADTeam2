package test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import controlador.controladorMenus;
import leerFicheros.LeerFicheroCsv;
import leerFicheros.LeerFicheroTxt;
import leerFicheros.LeerFicheroXml;
import metodosComunes.Visualizacion;


class Test {

	@org.junit.jupiter.api.Test
	public void tesVisualicacion() {
		String[] args = null;
		int longuitud = 10;
		String miString = "hola";
		Visualizacion visu = new Visualizacion();
		String opcion = visu.textoEspacios(longuitud, miString);
		assertEquals("hola     ", opcion);

	}

	@org.junit.jupiter.api.Test
	public void testControladorMenu() {

		String input = "r \n 5 \n 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner reader = new Scanner(System.in);
		controladorMenus controladormenu = new controladorMenus();

		int opcion = controladormenu.menu(reader);

		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorSubMenus() {

		String input = "r \n 5 \n 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner reader = new Scanner(System.in);
		int opcion = controladorMenus.subMenuLeerFicheros(reader);

		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegida() {

		String input = "1 \n 1 \n 2 \n  1\n 2\n 4\n 1\n 3\n 4\n 2\n ";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);

		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerCsv(){

		String input = "fichero1";
		LeerFicheroCsv ficherocsv = new LeerFicheroCsv();

		Boolean opcion = ficherocsv.LeerCSV(input);

		assertEquals(true, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerCsvError(){

		String input = "aaa.txt";

		Boolean opcion = LeerFicheroCsv.LeerCSV(input);

		assertEquals(false, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerTxt() {

		String input = "fichero3";

		LeerFicheroTxt ficherotxt = new LeerFicheroTxt();

		Boolean opcion = ficherotxt.LeerTxt(input);

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
		LeerFicheroXml ficheroxml = new LeerFicheroXml();
		Boolean opcion = ficheroxml.leerXml(input);
		assertEquals(true, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerXmlError() {

		String input = "aaa.xml";

		Boolean opcion = LeerFicheroXml.leerXml(input);

		assertEquals(false, opcion);
	}

}