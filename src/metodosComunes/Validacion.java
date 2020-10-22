package metodosComunes;

import Objetos.Libro;

public class Validacion {
	
	public boolean validarTitulo(String nombre) {
		boolean control = true;
		
			if(nombre.length()>40) {
				
				control = false;
			}	
		
		return control;
		
	}
	
	public boolean validarEditorial(String editorial) {
		boolean control = true;
		
			if(editorial.length()>30) {
				
				control = false;
				
			}
		
		return control;
		
	}
	
	public boolean validarPaginas(String pags) {
		boolean control = true;
		
			if(!isNumeric(pags)||Integer.parseInt(pags)>10000) {
				
				control = false;
			}
		
		return control;
		
	}
	
	public boolean validarAltura(String altura) {
		boolean control = true;
		
		if(!isNumeric(altura)||Integer.parseInt(altura)>800) {
			
			control = false;
		}	
		
		return control;
		
	}
	
	public boolean validarNotas(String notas) {
		boolean control = true;
		
			if(notas.length()>200) {
				
				control = false;
			}	
		
		return control;
		
	}
	
	public boolean validarIsbn(String isbn) {
		boolean control = true;
		final String isbnSplitBy = "-";
		
		String[] datos = isbn.split(isbnSplitBy);
		
		for (int i = 0; i < datos.length-1; i++) {
			control=isNumeric(datos[i]);
		}
		if(control = true) {
			if(datos[0]!="978"||datos[0]!="979") {
			control = false;
			}else if (datos[1].length()<1&&datos[1].length()>5) {
				control = false;
			}else if (datos[2].length()<1&&datos[2].length()>7) {
				control = false;
			}else if (datos[3].length()<1&&datos[3].length()>6) {
				control = false;
			}else if (datos[4].length()!=1) {
				control = false;
			}
		}
		
		return control;
		
	}
	
	public boolean validarMaterias(String materias) {
		boolean control = true;
		
			if(materias.length()>100) {
				
				control = false;
			}	
		
		return control;
		
	}
	
	public boolean validarLibro(Libro libro) {
		boolean control = true;
		
			 if(!validarTitulo(libro.getTitulo())||
				!validarEditorial(libro.getEditorial())||
				!validarPaginas(libro.getPaginas())||
				!validarAltura(libro.getAltura())||
				!validarNotas(libro.getNotas())||
				!validarIsbn(libro.getIsbn())||
				!validarMaterias(libro.getMaterias())) {
				
				control = false;
			}	
		
		return control;
		
	}
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
