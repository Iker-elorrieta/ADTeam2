package metodosComunes;

import java.io.File;
import java.io.IOException;

public class Permisos {

	public boolean cambiarPermisoWindows(File file, int cambio) {

//		String comando = "";
//
//		ProcessBuilder pb = new ProcessBuilder("cmd", "/C", comando);
//		pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		// Process p = pb.start();

		file.setReadable(true, false);

		file.setExecutable(true, false);

		file.setWritable(true, false);

		return false;

	}

	public static void permisos777(final String pathname) {

		Process theProcess = null;

		// intentamos cambiar los permisos del fichero recien creado
		System.out.println("Cambiamos permisos 777 a " + pathname);
		try {
			theProcess = Runtime.getRuntime().exec("chmod 777 " + pathname);
		} catch (IOException e) {
			System.out.println("Error en el método exec()");
		}
		// fin de cambio de permisos

	}

	public boolean cambiarPermisoLinux(File file, int cambio) {
		
		final String opcion = "w";
		
		String escritura = "$ chmod "+ opcion +" "+file.getName();






		return false;

	}

}
