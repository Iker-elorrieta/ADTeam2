package metodosComunes;


public class Visualizacion {

	
	public static String textoEspacios(int longuitud, String miString) {

		int numespacios = longuitud - miString.length();

		StringBuilder textoConEspacios = new StringBuilder();

		textoConEspacios.append(miString);
		
		int i = 0;

		for (i = 1; i < numespacios; i++) {
			textoConEspacios.append(" ");

		}

		return textoConEspacios.toString();
	}
	
	
	public static String cabecera(int longuitud, String miString) {

		int numespacios = longuitud - miString.length();

		StringBuilder textoConEspacios = new StringBuilder();

		textoConEspacios.append(miString);
		
		int i = 0;

		for (i = 1; i < numespacios; i++) {
			textoConEspacios.append(" ");

		}

		return textoConEspacios.toString();
	}
	
	
	
	
	
	
	
}
