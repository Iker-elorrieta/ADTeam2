package metodosComunes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {

	public static boolean isNumeric(int numero) {

	        boolean resultado;

	        try {
	            Integer.valueOf(numero);
	            resultado = true;
	          
	        } catch (NumberFormatException excepcion) {
	        	System.out.println(excepcion);
	            resultado = false;
	            
	        }

	        return resultado;
	    }
	
	public static boolean esDouble(String cadena) {
		
		
		
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException excepcion) {
			System.out.println(excepcion);
			return false;
		}
	}
	
	
	public static boolean mValidar(CharSequence cadena , String patronAvalidar) {
		boolean control=false;
		
		Pattern patron = Pattern.compile(patronAvalidar);
		Matcher buscar = patron.matcher(cadena);
		if(buscar.matches()) {
			control=true;
		}
		
		return control;
	}

	

}

	

	

