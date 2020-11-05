package metodosComunes;

public class Validador {
	private boolean contieneLetras = false;
	private boolean contieneNumeros = false;
	private int numeroMinimo;
	private int numeroMaximo;
	private String[] spliteado;
	private String[] largo;
	private String textoPrincipal;
	private int lugarDeTexto = 0;
	private String texto, patron;

	public Validador() {

	}

	public boolean validador(String patron, String texto) {
		lugarDeTexto = 0;
		contieneLetras=false;
		contieneNumeros=false;;
		// *sdfjbvkn*{a-z}(0-9)[0-30] ]
		comprobarPatron(patron);
		if (contieneLetras && contieneNumeros) {
			if (texto.length() < numeroMaximo && texto.length() > numeroMinimo) {
				return true;
			} else {
				return false;
			}
		} else if (contieneLetras) {
			for (int x = 0; x < texto.length() - 1; x++) {
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
			for (int x = 0; x < texto.length() - 1; x++) {
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
		if (patron.equals("")) {
			lugar = 0;
		} else if (patron.startsWith("*") && patron.endsWith("*")) {
			lugar = 2;
		} else if (patron.startsWith("*")) {
			lugar = 3;
		} else if (patron.endsWith("*")) {
			lugar = 1;
		} else {
			lugar = 4;
		}

		return lugar;

	}

	public void comprobarPatron(String patron) {
		if (patron.contains("{")) {
			contieneLetras = true;
			spliteado = patron.split("\\{");
			lugarDeTexto = verificarComienzo(spliteado[0]);

			if (spliteado[1].contains("(")) {
				spliteado = spliteado[1].split("\\(");
				contieneNumeros = true;
				if (spliteado[1].contains("[")) {
					spliteado = spliteado[1].split("\\[");

					if (spliteado[1].contains("-")) {
						largo = spliteado[1].split("-");
						numeroMinimo = Integer.parseInt(largo[0]);

						numeroMaximo = Integer.parseInt(largo[1].split("\\]")[0]);
					}

					else {
						numeroMinimo = 0;
						numeroMaximo = Integer.parseInt(spliteado[1].split("\\]")[0]);
					}
				}
			} else if (spliteado[1].contains("[")) {
				spliteado = spliteado[1].split("\\[");

				if (spliteado[1].contains("-")) {
					largo = spliteado[1].split("-");
					numeroMinimo = Integer.parseInt(largo[0]);

					numeroMaximo = Integer.parseInt(largo[1].split("\\]")[0]);
				}

				else {
					numeroMinimo = 0;
					numeroMaximo = Integer.parseInt(spliteado[1].split("\\]")[0]);
				}

			}
		} 
		// asdfa

		else if (patron.contains("(")) {
			spliteado = patron.split("\\(");
			contieneNumeros = true;
			if (spliteado[1].contains("[")) {
				spliteado = spliteado[1].split("\\[");
				contieneNumeros = true;
				if (spliteado[1].contains("-")) {
					largo = spliteado[1].split("-");
					numeroMinimo = Integer.parseInt(largo[0]);

					numeroMaximo = Integer.parseInt(largo[1].split("\\]")[0]);
				}

				else {
					numeroMinimo = 0;
					numeroMaximo = Integer.parseInt(spliteado[1].split("\\]")[0]);
				}
			}

		} else if (patron.contains("[")) {
			spliteado = patron.split("\\[");
			contieneNumeros = true;
			if (spliteado[1].contains("-")) {
				largo = spliteado[1].split("-");
				numeroMinimo = Integer.parseInt(largo[0]);

				numeroMaximo = Integer.parseInt(largo[1].split("\\]")[0]);
			}

			else {
				numeroMinimo = 0;
				numeroMaximo = Integer.parseInt(spliteado[1].split("\\]")[0]);
			}
		} else {

		}

	}

	public int getLugarDeTexto() {
		return lugarDeTexto;
	}

	public void setLugarDeTexto(int lugarDeTexto) {
		this.lugarDeTexto = lugarDeTexto;
	}

}