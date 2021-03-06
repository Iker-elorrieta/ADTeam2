package metodosComunes;

public class Validador {
	
	/**
	 * Esta clase contiene el metodo de validador
	 * @param patron String con el patron a validar en el texto
	 * @param texto String con el texto a verificar que cumple con el patron
	 * @author Ibai, Jonatan
	 * @return Retorna un booleano true si el texto cumple con el patron y false en caso contrario
	 * 
	 */
	
	private boolean contieneLetras = false;
	private boolean contieneNumeros = false;
	private int numeroMinimo;
	private int numeroMaximo;
	private String[] spliteado;
	private String[] largo;
	private int lugarDeTexto = 0;
	private String textoSinParentesis;
	private final String parentesis="(";
	private final String guion="-";
	private final String Corchete="[";
	private final String Corchete2="]";
	private final String llave="{";
	private final String rallas="\\";
	final String simbolo = "\\*";
	public Validador() {

	}

	public boolean validador(String patron, String texto) {
		lugarDeTexto = 0;
		contieneLetras=false;
		contieneNumeros=false;;
		comprobarPatron(patron);
		if (contieneLetras && contieneNumeros) {
			if (texto.length() < numeroMaximo && texto.length() > numeroMinimo) {
				return true;
			} else {
				return false;
			}
		} else if (contieneLetras) {
			for (int x = 0; x < texto.length(); x++) {
				if (java.lang.Character.isDigit(texto.charAt(x))) {
					return false;
				}
			}
			
					if (texto.length() < numeroMaximo && texto.length() > numeroMinimo) {
						return true;
					} else {
						return false;
					}
				
		} else if (contieneNumeros) {
			for (int x = 0; x < texto.length(); x++) {
				if (java.lang.Character.isDigit(texto.charAt(x))) {
					if (texto.length() < numeroMaximo && texto.length() > numeroMinimo) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;

				}
			}
		}

		return false;
	}

	public int verificarComienzo(String patron) {
		int lugar = 0;
		if (patron.startsWith("*") && patron.endsWith("*")) {
			lugar = 2;
		} else if (patron.startsWith("*")) {
			lugar = 3;
		} else if (patron.endsWith("*")) {
			lugar = 1;
		} else {
			lugar = 0;
		}
		if (lugar == 2) {
			textoSinParentesis = patron.split(simbolo)[1];
		}
		else {
			textoSinParentesis = patron.split(simbolo)[0];
		}

		return lugar;

	}

	public void comprobarPatron(String patron) {
		if (patron.contains(llave)) {
			contieneLetras = true;
			spliteado = patron.split(rallas+llave);
			lugarDeTexto = verificarComienzo(spliteado[0]);

			if (spliteado[1].contains(parentesis)) {
				spliteado = spliteado[1].split(rallas+parentesis);
				contieneNumeros = true;
				if (spliteado[1].contains(Corchete)) {
					spliteado = spliteado[1].split(rallas+Corchete);

					if (spliteado[1].contains(guion)) {
						largo = spliteado[1].split(rallas+guion);
						numeroMinimo = Integer.parseInt(largo[0]);

						numeroMaximo = Integer.parseInt(largo[1].split(rallas+Corchete2)[0]);
					}

					else {
						numeroMinimo = 0;
						numeroMaximo = Integer.parseInt(spliteado[1].split(rallas+Corchete2)[0]);
					}
				}
			} else if (spliteado[1].contains(Corchete)) {
				spliteado = spliteado[1].split(rallas+Corchete);

				if (spliteado[1].contains(guion)) {
					largo = spliteado[1].split(rallas+guion);
					numeroMinimo = Integer.parseInt(largo[0]);

					numeroMaximo = Integer.parseInt(largo[1].split(rallas+Corchete2)[0]);
				}

				else {
					numeroMinimo = 0;
					numeroMaximo = Integer.parseInt(spliteado[1].split(rallas+Corchete2)[0]);
				}

			}
		} 

		else if (patron.contains(parentesis)) {
			contieneNumeros = true;
			spliteado = patron.split(rallas+parentesis);
			lugarDeTexto = verificarComienzo(spliteado[0]);
			if (spliteado[1].contains(Corchete)) {
				spliteado = spliteado[1].split(rallas+Corchete);

				if (spliteado[1].contains(guion)) {
					largo = spliteado[1].split(rallas+guion);
					numeroMinimo = Integer.parseInt(largo[0]);

					numeroMaximo = Integer.parseInt(largo[1].split(rallas+Corchete2)[0]);
				}

				else {
					numeroMinimo = 0;
					numeroMaximo = Integer.parseInt(spliteado[1].split(rallas+Corchete2)[0]);
				}
			}
		
	

		} else if (patron.contains(Corchete)) {
			spliteado = patron.split(rallas+Corchete);
			lugarDeTexto = verificarComienzo(spliteado[0]);
			contieneNumeros = true;
			if (spliteado[1].contains(guion)) {
				largo = spliteado[1].split(rallas+guion);
				numeroMinimo = Integer.parseInt(largo[0]);

				numeroMaximo = Integer.parseInt(largo[1].split(rallas+Corchete2)[0]);
			}

			else {
				numeroMinimo = 0;
				numeroMaximo = Integer.parseInt(spliteado[1].split(rallas+Corchete2)[0]);
			}
		} else {
			lugarDeTexto = verificarComienzo(patron);
		}

	}

	public int getLugarDeTexto() {
		return lugarDeTexto;
	}

	public String getTextoSinParentesis() {
		return textoSinParentesis;
	}

	

	
}