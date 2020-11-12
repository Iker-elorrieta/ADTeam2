package metodosComunes;

import java.io.File;

public class Permisos {

	public void saberPermisos(File file) {

	}

	public boolean quitarPermisoWindows(File file, int permiso) {

		if (permiso == 1) {
			
			file.setReadable(false, false);
			file.setWritable(false, false);
			file.setExecutable(false, false);
			
		} else if (permiso == 2) {
			

		} else if (permiso == 3) {

			file.setReadable(false, false);
			file.setExecutable(false, false);

		} else if (permiso == 4) {
			
			file.setReadable(false, false);

		} else if (permiso == 5) {
			
			file.setWritable(false, false);

		} else {

		}

		return true;

	}

//	public static void permisos777(final String pathname) {
//
//		Process theProcess = null;
//
//		// intentamos cambiar los permisos del fichero recien creado
//		System.out.println("Cambiamos permisos 777 a " + pathname);
//		try {
//			theProcess = Runtime.getRuntime().exec("chmod 777 " + pathname);
//		} catch (IOException e) {
//			System.out.println("Error en el método exec()");
//		}
//		// fin de cambio de permisos
//
//	}

	public boolean cambiarPermisoLinux(File file, int cambio) {

		final String opcion = "w";

		String escritura = "$ chmod " + opcion + " " + file.getName();

		return false;

	}

}
