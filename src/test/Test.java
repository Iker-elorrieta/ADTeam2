package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import controlador.controladorMenus;
import leerFicheros.LeerFicheroCsv;
import leerFicheros.LeerFicheroTxt;
import leerFicheros.LeerFicheroXml;

class Test {

	Scanner reader = new Scanner(System.in);
	@org.junit.jupiter.api.Test
	public void testLeerCsv() throws IOException{
		
		String input = "fichero.csv";
		
		Boolean opcion = LeerFicheroCsv.LeerCSV(input);

		assertEquals(true, opcion);
	}
	

	@org.junit.jupiter.api.Test
	public void testLeerCsvError() throws IOException{
		
		String input = "aaa.txt";
		
		Boolean opcion = LeerFicheroCsv.LeerCSV(input);

		assertEquals(false, opcion);
	}
	
	
	@org.junit.jupiter.api.Test
	public void testLeerTxt() throws IOException{
		
		String input = "fichero.txt";
		
		Boolean opcion = LeerFicheroTxt.LeerTxt(input);

		assertEquals(true, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testLeerTxtError() throws IOException{
		
		String input = "aaa.txt";
		
		Boolean opcion = LeerFicheroTxt.LeerTxt(input);

		assertEquals(false, opcion);
	}
	
	// HAY QUE ADAPTAR LOS CAMBIOS 
//	@org.junit.jupiter.api.Test
//	public void testLeerXml() throws IOException{
//		
//		String input = "fichero.xml";
//		
//		Boolean opcion = LeerFicheroXml.leerXml(input);
//
//		assertEquals(true, opcion);
//	}
//	
//	@org.junit.jupiter.api.Test
//	public void testLeerXmlError() throws IOException{
//		
//		String input = "aaa.xml";
//		
//		Boolean opcion = LeerFicheroXml.leerXml(input);
//
//		assertEquals(false, opcion);
//	}

	
	@org.junit.jupiter.api.Test
	public void testControladorMenu() throws IOException{
		
		String input = "r \n 5 \n 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		int opcion = controladorMenus.menu(reader);
		
		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorSubMenus() throws IOException{
		
		String input = "r \n 5 \n 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		int opcion = controladorMenus.subMenuLeerFicheros(reader);
		
		assertEquals(1, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegida() throws IOException{
		
		String input = "1 \n 1 \n 4 \n  2\n 2\n 4\n 3\n 3\n 4\n 4\n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		int opcion = controladorMenus.opcionElegida(reader);
		
		assertEquals(1, opcion);
	}

}