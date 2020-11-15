package metodosComunes;

import java.io.File;
import java.io.IOException;

public class Permisos {

	public void saberPermisos(File file) {

	}

	public boolean cambiarPermisoWindows(File file, String aQueUsuario, int permiso, int darOquitar) {

		String command = "C:\\Users\\in2dam-b>icacls "+file+" /grant ";

		ProcessBuilder pb = new ProcessBuilder(command);

		return true;

	}

	public boolean cambiarPermisoLinux(File file, String aQueUsuario, int permiso, int darOquitar) {
	//"Para Control Total pulse 1, para Lectura y Ejecución pulse 2, para Lectura pulse 3, para Escritura pulse 4);
		boolean control=false;
		final String msgError="ERROR al cambiar permisos";
		final String comando = "chmod";
		final String opcionEscritura = "w";
		final String opcionLectura = "r";
		final String opcionEjecucion = "x";
		final String opcionUsuario = "u";
		final String opcionGrupos = "g";
		final String opcionOtros = "o";
		String masOmenos="";
		String[] comandoEscritura = {comando,"",file.getName()};
		String[] comandoLectura = {comando,"",file.getName()};
		String[] comandoEjecucion = {comando,"",file.getName()};
		
		//Editamos añadir o quitar permisos en el comando
		if(darOquitar==1) {
			masOmenos="+";
		}else {
			masOmenos="-";
		}
		
		//Añadimos a quien se le cambian los permisos en el comando
		switch (aQueUsuario) {
		case opcionUsuario:
			comandoEscritura[1] = opcionUsuario;
			comandoLectura[1] = opcionUsuario;
			comandoEjecucion[1] = opcionUsuario;
			break;
		case opcionGrupos:
			comandoEscritura[1] = opcionGrupos;
			comandoLectura[1] = opcionGrupos;
			comandoEjecucion[1] = opcionGrupos;	
			break;
		case opcionOtros:
			comandoEscritura[1] = opcionOtros;
			comandoLectura[1] = opcionOtros;
			comandoEjecucion[1] = opcionOtros;
			break;
		}
		
		//Añadimos el resto del comando
		comandoEscritura[1] = comandoEscritura[1]+masOmenos+opcionEscritura;
		comandoLectura[1] = comandoLectura[1]+masOmenos+opcionLectura;
		comandoEjecucion[1] = comandoEjecucion[1]+masOmenos+opcionEjecucion;
		
		//Ejecutamos los comandos en consola segun los permisos elegidos
		switch (permiso) {
		case 1:
			
			try {
				Runtime.getRuntime().exec(comandoEscritura);
				Runtime.getRuntime().exec(comandoLectura);
				Runtime.getRuntime().exec(comandoEjecucion);
				control=true;
			} catch (IOException e) {
				System.out.println(msgError);
			}
			break;
		case 2:
			try {
				Runtime.getRuntime().exec(comandoLectura);
				Runtime.getRuntime().exec(comandoEjecucion);
				control=true;
			} catch (IOException e) {
				System.out.println(msgError);
			}
			break;
		case 3:
			try {
				Runtime.getRuntime().exec(comandoLectura);
				control=true;
			} catch (IOException e) {
				System.out.println(msgError);
			}
			break;
		case 4:
			try {
				Runtime.getRuntime().exec(comandoEjecucion);
				control=true;
			} catch (IOException e) {
				System.out.println(msgError);
			}
			break;
		}
		
		//Devuelve un true si se han cambiado los permisos correctamente
		return control;

	}
	
	
	
}
