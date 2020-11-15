package test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.File;
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
import metodosComunes.BuscarLibro;
import metodosComunes.EscribirPantalla;
import metodosComunes.FileChooser;
import metodosComunes.RellenarLibro;
import metodosComunes.Validador;
import metodosComunes.Visualizacion;
import objetos.Libro;
import reto_01.Aplicacion;

class Test {
	/**
	 * Esta clase contiene los metodos de TEST de la aplicacion.
	 * 
	 * @author Fran
	 */
	Validador validador = new Validador();
	
	BuscarLibro busvarlibro = new BuscarLibro();
	Visualizacion visualizacion = new Visualizacion();
	controladorMenus controladormenu = new controladorMenus();
	EscribirCsv escribirCsv = new EscribirCsv();
	EscribirTxt escribirTxt = new EscribirTxt();
	EscribirXml escribirXml = new EscribirXml();
	LeerFicheroCsv leerCsv = new LeerFicheroCsv();
	LeerFicheroXml leerXml = new LeerFicheroXml();
	LeerFicheroTxt leerTxt = new LeerFicheroTxt();
	EscribirPantalla escribirPantalla = new EscribirPantalla();
	RellenarLibro rellenarLibro = new RellenarLibro();	
	Libro libro = new Libro();
	Aplicacion aplicacion=new Aplicacion();
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
	public void testControladorOpcionElegidaLeercsv() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	
	public void testControladorOpcionElegidaLeerxml() {
		FileChooser.comprobadorDeTeses=2;
		String input = " 1 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	public void testControladorOpcionElegidaLeertxt() {
		FileChooser.comprobadorDeTeses=3;
		String input = " 1 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarTitulo() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 1 \n 1 \n 1 \n Cs \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarTituloComplicado() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 1 \n 2 \n Cs* \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarEditorialComplicado() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 2 \n 2 \n Al* \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarNotasComplicado() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 5 \n 5 \n dfshdf \n 2 \n Bu* \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarIsbnComplicado() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 6 \n 2 \n 97* \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarMateriassComplicado() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 7 \n 2 \n Fan* \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarTitulo2() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 1 \n 1 \n 2 \n Cs \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarTitulo3() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1  \n 3 \n 1 \n 1 \n 3 \n sv \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarTamaño() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1  \n 3 \n 4 \n 1 \n 3 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarMaterias() {
		FileChooser.comprobadorDeTeses=3;
		String input = " 1  \n 3 \n 7 \n 1 \n 1 \n Fan \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarMaterias2() {
		FileChooser.comprobadorDeTeses=3;
		String input = " 1 \n 3 \n 7 \n 1 \n 8 \n 2 \n Fan \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarMaterias3() {

		FileChooser.comprobadorDeTeses=3;
		String input = " 1 \n 3 \n 7 \n 1 \n 3 \n sia \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarISBN() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1  \n 3 \n 6 \n 1 \n 1 \n 97 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarISBN2() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n10\n affd \n 6 \n 1 \n 2 \n 97 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarISBN3() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 6 \n 1 \n 3 \n 2 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarNotas() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 5 \n 1 \n 1 \n Buen \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarNotas2() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 5 \n 1 \n 2 \n Buen \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarNotas3() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 5 \n 1 \n 3 \n bro \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarTamaño2() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 4 \n 2 \n 3 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarTamaño3() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 4 \n 3 \n 3 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarPaginas() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 3 \n 1 \n 100 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarPaginas2() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1  \n 3 \n 3 \n 2 \n 100 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarPaginas3() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1 \n 3 \n 3 \n 3 \n 100 \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarEditorial() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1  \n 3 \n 2 \n 1 \n 1 \n Al \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarEditorial2() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1  \n 3 \n 2 \n1  \n 2 \n Al \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testControladorOpcionBuscarEditorial3() {
		FileChooser.comprobadorDeTeses=1;
		String input = " 1  \n 3 \n 2 \n1 \n 3 \n ba \n 4\n";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testLeerCsv() {
		ArrayList<Libro> libros = new ArrayList<>();
		reader = new Scanner(System.in);
		File input = new File( "fichero1.csv");
		Boolean opcion = LeerFicheroCsv.LeerCSV(input, libros,reader);
		assertEquals(true, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerCsvError() {
		
		ArrayList<Libro> libros = new ArrayList<>();
		reader = new Scanner(System.in);
		File input = new File( "aaa.txt");
		LeerFicheroCsv ficheroCsv = new LeerFicheroCsv();

		Boolean opcion = ficheroCsv.LeerCSV(input,libros,reader);
		assertEquals(false, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerTxt() {
		ArrayList<Libro> libros = new ArrayList<>();
		
		reader = new Scanner(System.in);
		File input = new File( "fichero3.txt");
		LeerFicheroTxt ficheroTxt = new LeerFicheroTxt();
		Boolean opcion = ficheroTxt.LeerTxt(input,libros,reader);

		assertEquals(true, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerTxtError() {
		ArrayList<Libro> libros = new ArrayList<>();
		
		reader = new Scanner(System.in);
		File input = new File( "aaa.txt");
		Boolean opcion = LeerFicheroTxt.LeerTxt(input,libros,reader);
		assertEquals(false, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testLeerXml() {
		ArrayList<Libro> libros = new ArrayList<>();
		File input = new File( "fichero2.xml");
		reader = new Scanner(System.in);
		LeerFicheroXml ficheroXml = new LeerFicheroXml();
		ficheroXml.leerXml(input,libros,reader);
		ArrayList<Libro> pruebaLibros = new ArrayList<>();
		assertEquals(pruebaLibros.getClass(), libros.getClass());
	}

	@org.junit.jupiter.api.Test
	public void testLeerXmlError() {
		ArrayList<Libro> libros = new ArrayList<>();
		File input = new File( "aaa.xml");
		reader = new Scanner(System.in);

		LeerFicheroXml.leerXml(input,libros,reader);
		assertEquals(0, libros.size());
	}

	@org.junit.jupiter.api.Test
	public void testEscribirCsvNoExiste() {
		
		File input = new File("fichero5.csv");
		String input2 = "Csv \n Csv \n 1 \n 1 \n 1 \n 1 \n Csv";

		InputStream in = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		boolean correcto = EscribirCsv.EscribeFichero(input, sc);
		assertEquals(true, correcto);

	}

	@org.junit.jupiter.api.Test
	public void testEscribirCsv() {
		File input = new File("fichero1.csv");;
		String input2 = "Csv \n Csv \n 1 \n 1 \n 1 \n 1 \n Csv";
		InputStream in = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in);

		reader = new Scanner(System.in);
		boolean correcto = EscribirCsv.EscribeFichero(input, reader);

		assertEquals(true, correcto);

	}

	@org.junit.jupiter.api.Test
	public void testEscribirXml() {

		File input = new File("fichero2.xml");
		String input2 = "Xml \n Xml \n 2 \n 2 \n 2 \n 2 \n Xml";
		InputStream in = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		EscribirXml xml = new EscribirXml();
		ArrayList<Libro> libros = xml.generarXml(input, reader);
		ArrayList<Libro> pruebaLibros = new ArrayList<>();
		assertEquals(pruebaLibros.getClass(), libros.getClass());

	}

	@org.junit.jupiter.api.Test
	public void testEscribirTxt() {
		File input = new File("fichero7.txt");

		String input2 = "txt \n txt \n 3 \n 3 \n 3 \n 3 \n txt";
		InputStream in = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		boolean correcto = EscribirTxt.añadirTxt(input, reader);
		assertEquals(true, correcto);

	}

	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegidaEscribirCSV() {
		FileChooser.comprobadorDeTeses=1;
		String input = "2\nCsv\nCsv\n1\n1\n1\n1\nCsv\n4 ";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegidaEscribirXML() {
		FileChooser.comprobadorDeTeses=2;
		String input = "2\nXml\nXml\n 2\n2\n2\n2\nXml\n4";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}

	@org.junit.jupiter.api.Test
	public void testControladorOpcionElegidaEscribirTXT() {
		FileChooser.comprobadorDeTeses=3;
		String input = "2\ntxt\ntxt\n3\n 3\n 3\n 3\ntxt\n4";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		reader = new Scanner(System.in);
		int opcion = controladorMenus.opcionElegida(reader);
		assertEquals(1, opcion);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorPrimeraZona() {

		
		boolean opcion = validador.validador("*dfsgsd*{a-z}(1-2)[0-50]", "acjbdskh1234");
		int numero= validador.getLugarDeTexto();
		assertEquals(true, opcion);
		assertEquals(2, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorPrimeraZona0() {

		
		boolean opcion = validador.validador("*dfsgsd*{a-z}(1-2)[0]", "acjbdskh1234");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		assertEquals(2, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorSegundaZona() {

		
		boolean opcion = validador.validador("(1-9)[50]", "12345");
		int numero= validador.getLugarDeTexto();
		assertEquals(true, opcion);
		assertEquals(0, numero);
	}
	@org.junit.jupiter.api.Test
public void testValidadorSegundaZona0() {

		
		boolean opcion = validador.validador("(1-9)[0]", "12345");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		assertEquals(0, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorPrimeraZona2() {

		
		boolean opcion = validador.validador("*dfsgsd*{a-z}(1-2)[50]", "acjbdskh1234");
		int numero= validador.getLugarDeTexto();
		assertEquals(true, opcion);
		assertEquals(2, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorSegundaZona2() {

		
		boolean opcion = validador.validador("(1-9)[1-50]", "12345");
		int numero= validador.getLugarDeTexto();
		assertEquals(true, opcion);
		assertEquals(0, numero);
	}

	@org.junit.jupiter.api.Test
	public void testValidadorTerceraZona() {

		
		boolean opcion = validador.validador("sdfsdf*{a-z}[50]", "233fg56");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		assertEquals(1, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorTerceraZona0() {

		
		boolean opcion = validador.validador("sdfsdf*{a-z}[0]", "233fg56");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		assertEquals(1, numero);
	}
	
	
	@org.junit.jupiter.api.Test
public void testValidadorTerceraZona2() {

		
		boolean opcion = validador.validador("sdfsdf*{a-z}[1-50]", "233fg56");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		assertEquals(1, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorCuartaZona() {

			
			boolean opcion = validador.validador("*sdfsdf{a-z}[50]", "sdfafsdfds");
			int numero= validador.getLugarDeTexto();
			assertEquals(true, opcion);
			assertEquals(3, numero);
		}
	@org.junit.jupiter.api.Test
	public void testValidadorCuartaZona2() {

		
		boolean opcion = validador.validador("*sdfsdf{a-z}[0-50]", "sdfafsdfds");
		int numero= validador.getLugarDeTexto();
		assertEquals(true, opcion);
		assertEquals(3, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorCuartaZona0() {

		
		boolean opcion = validador.validador("*sdfsdf{a-z}[0]", "sdfafsdfds");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		assertEquals(3, numero);
	}

	
	
	@org.junit.jupiter.api.Test
	public void testValidadorQuintaZona() {
		boolean opcion = validador.validador("*sdfsdf(1-9)[0]", "sdfafsdfds");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		assertEquals(3, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorultimaZona() {

		
		boolean opcion = validador.validador("", "sdfafsdfds");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		assertEquals(0, numero);
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorsextaZona() {

		
		boolean opcion = validador.validador("[50]", "sdfafsdfds");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		
	}
	
	@org.junit.jupiter.api.Test
	public void testValidadorsextaZona2() {

		
		boolean opcion = validador.validador("[0-50]", "sdfafsdfds");
		int numero= validador.getLugarDeTexto();
		assertEquals(false, opcion);
		
	}
	
	
	
// \n  \n

// NO TENGO CLARO QUE TENGAMOS AUE COMPROBAR ERROR AL ESCRIBIR YA QUE SIEMPRE NOS CREARA UN NUEVO DOCUMENTO //

// @org.junit.jupiter.api.Test
// public void testEscribirXmlError() {
//
// String input = "aaa.xml";
//
// ArrayList<Libro> libros = LeerFicheroXml.leerXml(input);
// assertEquals(0, libros.size());
// }

}