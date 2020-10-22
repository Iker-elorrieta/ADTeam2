package metodosComunes;

public class Visualizacion {

	/**
	 * Este metodo formatea el texto que le pases como string 
	 * @param longuitud La distancia que hay entre los campos que se le pase
	 * @param miString Strin que se le pasa al metodo para formatear
	 * @author fran 
	 * @return retorna un String formateado para que se vea bien por pantalla
	 */
	public static String textoEspacios(int longuitud, String miString) {
		
		// Comprobamos cuantos espacios en blanco vamos a tener segun el String de los parametros
		int numespacios = longuitud - miString.length();

		StringBuilder textoConEspacios = new StringBuilder();
		// Creamos un StringBuilder al que le a�adimos el String anterior
		textoConEspacios.append(miString);
		
		int i = 0;
		// A�adimos espacios que sean necesarios
		for (i = 1; i < numespacios; i++) {
			textoConEspacios.append(" ");

		}
		// devolvemos el texto del String original, solo que con los espacios a�adidos
		return textoConEspacios.toString();
	}
	

	
}
