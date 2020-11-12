package metodosComunes;

import java.io.File;

public class Permisos {

	public void saberPermisos(File file) {

	}

	public boolean cambiarPermisoWindows(File file, String aQueUsuario, int permiso, int darOquitar) {

		String command = "C:\\Users\\in2dam-b>icacls "+file+" /grant ";

		ProcessBuilder pb = new ProcessBuilder(command);

		return true;

	}

	public boolean cambiarPermisoLinux(File file, String aQueUsuario, int permiso, int darOquitar) {

		final String opcionEscritura = "w";
		final String opcionLectura = "r";
		final String opcionEjecucion = "x";
		final String dar ="+";
		final String quitar ="-";
		
		String darEscritura = "$ chmod "+dar+ opcionEscritura +" "+file.getName();
		String darLectura = "$ chmod "+dar+ opcionLectura +" "+file.getName();
		String darEjecucion = "$ chmod "+dar+ opcionEjecucion +" "+file.getName();

		String quitarEscritura = "$ chmod "+quitar+ opcionEscritura +" "+file.getName();
		String quitarLectura = "$ chmod "+quitar+ opcionLectura +" "+file.getName();
		String quitarEjecucion = "$ chmod "+quitar+ opcionEjecucion +" "+file.getName();

		return false;

	}

}
