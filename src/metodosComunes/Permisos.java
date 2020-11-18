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
		//Para Control Total pulse 1, para Lectura y Ejecuci�n pulse 2, para Lectura pulse 3, para Escritura pulse 4);
			Process proceso;
			boolean control=false;
			final String msgError="ERROR al cambiar permisos";
			final String comando = "chmod ";
			final String opcionEscritura = "w";
			final String opcionLectura = "r";
			final String opcionEjecucion = "x";
			final String opcionUsuario = "u";
			final String opcionGrupos = "g";
			final String opcionOtros = "o";
			String masOmenos="";
			String comandoEscritura = null;
			String comandoLectura=null;
			String comandoEjecucion=null;
			
			//Editamos a�adir o quitar permisos en el comando
			if(darOquitar==1) {
				masOmenos="+";
			}else {
				masOmenos="-";
			}
			
			//A�adimos a quien se le cambian los permisos en el comando
			switch (aQueUsuario) {
			case opcionUsuario:
				comandoEscritura = comando+opcionUsuario;
				comandoLectura = comando+opcionUsuario;
				comandoEjecucion = comando+opcionUsuario;
				break;
			case opcionGrupos:
				comandoEscritura = comando+opcionGrupos;
				comandoLectura = comando+opcionGrupos;
				comandoEjecucion = comando+opcionGrupos;	
				break;
			case opcionOtros:
				comandoEscritura = comando+opcionOtros;
				comandoLectura = comando+opcionOtros;
				comandoEjecucion = comando+opcionOtros;
				break;
			}
			
			//A�adimos el resto del comando
			comandoEscritura = comandoEscritura+masOmenos+opcionEscritura+" "+file.getAbsolutePath();
			comandoLectura= comandoLectura+masOmenos+opcionLectura+" "+file.getAbsolutePath();
			comandoEjecucion = comandoEjecucion+masOmenos+opcionEjecucion+" "+file.getAbsolutePath();
			
			//Ejecutamos los comandos en consola segun los permisos elegidos
			switch (permiso) {
			case 1:
				try {
				proceso=Runtime.getRuntime().exec(comandoEscritura);
				proceso=Runtime.getRuntime().exec(comandoLectura);
				proceso=Runtime.getRuntime().exec(comandoEjecucion);
				}catch(IOException e){
					e.printStackTrace();
				}
				control=true;
				break;
			case 2:
				try {
				proceso=Runtime.getRuntime().exec(comandoLectura);
				proceso=Runtime.getRuntime().exec(comandoEjecucion);
				}catch(IOException e){
					e.printStackTrace();
				}
				break;
			case 3:
				try {
				proceso=Runtime.getRuntime().exec(comandoLectura);
				}catch(IOException e){
					e.printStackTrace();
				}
				break;
			case 4:
				try {
				proceso=Runtime.getRuntime().exec(comandoEjecucion);
				}catch(IOException e){
					e.printStackTrace();
				}
				break;
			}
			
			//Devuelve un true si se han cambiado los permisos correctamente
			return control;

		}
	
	
}
