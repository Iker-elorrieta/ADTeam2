package test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import controlador.controladorMenus;
import escribirFicheros.EscribirCsv;
import escribirFicheros.EscribirTxt;
import escribirFicheros.EscribirXml;
import leerFicheros.LeerFicheroCsv;
import leerFicheros.LeerFicheroTxt;
import leerFicheros.LeerFicheroXml;
import metodosComunes.Visualizacion;
import objetos.Libro;

class Test {
	/**
	 * Esta clase contiene los metodos de TEST de la aplicacion.
	 * @author Fran
	 */
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
		reader = new Scanner(System.in);

		int opcion = controladorMenus.menu(reader);
		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorSubMenusLeer() {

		String input = "r \n 5 \n 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.subMenuLeerFicheros(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorSubMenusEscribirError() {

		String input = "r \n 5 \n 1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.subMenuEscribirFicheros(reader);
		assertEquals(1, opcion);
	}


	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegidaLeer() {

		String input = " 1 \n 1 \n fichero1 \n 1 \n 2 \n fichero2 \n 1 \n 3 \n fichero3 \n 3\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida();
		assertEquals(1, opcion);
	}
	

	@org.junit.jupiter.api.Test
	public void testLeerCsv() {

		String input = "fichero1";
		Boolean opcion = LeerFicheroCsv.LeerCSV(input);
		assertEquals(true, opcion);
	}
	
	
	@org.junit.jupiter.api.Test
	public void testLeerCsvError() {

		String input = "aaa.txt";
		LeerFicheroCsv ficheroCsv = new LeerFicheroCsv();

		Boolean opcion = ficheroCsv.LeerCSV(input);
		assertEquals(false, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerTxt() {

		String input = "fichero3";
		LeerFicheroTxt ficheroTxt = new LeerFicheroTxt();
		Boolean opcion = ficheroTxt.LeerTxt(input);

		assertEquals(true, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerTxtError() {

		String input = "aaa.txt";
		Boolean opcion = LeerFicheroTxt.LeerTxt(input);
		assertEquals(false, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerXml() {

		String input = "fichero2";
		LeerFicheroXml ficheroXml = new LeerFicheroXml();
		ArrayList<Libro> libros = ficheroXml.leerXml(input);
		ArrayList<Libro> pruebaLibros = new ArrayList<>();
		assertEquals(pruebaLibros.getClass(), libros.getClass());
	}

	@org.junit.jupiter.api.Test
	public void testLeerXmlError() {

		String input = "aaa.xml";

		ArrayList<Libro> libros = LeerFicheroXml.leerXml(input);
		assertEquals(0, libros.size());
	}

	
	@org.junit.jupiter.api.Test
	public void testEscribirCsvNoExiste() {
		String input = "fichero11";
		String input2 = "Csv \n Csv \n 1 \n 1 \n 1 \n 1 \n Csv";
		
		InputStream in = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		boolean correcto = EscribirCsv.EscribeFichero(input,sc);
		assertEquals(true,correcto);

	}


	
	
	@org.junit.jupiter.api.Test
	public void testEscribirCsv() {
		String input = "fichero1";
		String input2 = "Csv \n Csv \n 1 \n 1 \n 1 \n 1 \n Csv";
		InputStream in = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in);

		reader = new Scanner(System.in);
		boolean correcto = EscribirCsv.EscribeFichero(input,reader);

	

		assertEquals(true,correcto);

	}

	
	@org.junit.jupiter.api.Test
	public void testEscribirXml() {

		String input = "fichero2";
		String input2 = "Xml \n Xml \n 2 \n 2 \n 2 \n 2 \n Xml";
		InputStream in = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		EscribirXml xml = new EscribirXml();
		ArrayList<Libro> libros = xml.generarXml(input,reader);
		ArrayList<Libro> pruebaLibros = new ArrayList<>();
		assertEquals(pruebaLibros.getClass(), libros.getClass());
		
	}

	@org.junit.jupiter.api.Test
	public void testEscribirTxt() {
		String input = "fichero7";
	
		String input2 = "txt \n txt \n 3 \n 3 \n 3 \n 3 \n txt";
		InputStream in = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		boolean correcto = EscribirTxt.añadirTxt(input,reader);
		assertEquals(true,correcto);

	}
	
	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegidaEscribirCSV() {
		System.out.println("HOLA MU HUENAS");
		String input = "2\n1\nfichero1\nCsv\nCsv\n1\n1\n1\n1\nCsv\n3 ";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida();
		assertEquals(1, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegidaEscribirXML() {

		
		String input = "2\n2\nfichero2\nXml\nXml\n 2\n2\n2\n2\nXml\n3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida();
		assertEquals(1, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegidaEscribirTXT() {

		
		String input = "2\n3\nfichero3\ntxt\ntxt\n3\n 3\n 3\n 3\ntxt\n3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida();
		assertEquals(1, opcion);
	}


// \n  \n
	
	// NO TENGO CLARO QUE TENGAMOS AUE COMPROBAR ERROR AL ESCRIBIR YA QUE SIEMPRE NOS CREARA UN NUEVO DOCUMENTO //

//	@org.junit.jupiter.api.Test
//	public void testEscribirXmlError() {
//
//		String input = "aaa.xml";
//		
//		ArrayList<Libro> libros = LeerFicheroXml.leerXml(input);
//		assertEquals(0, libros.size());
//	}

}