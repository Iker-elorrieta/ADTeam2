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

		final String opcion = "w";

		String escritura = "$ chmod " + opcion + " " + file.getName();

		return false;

	}

}
