package metodosComunes;

import java.io.File;

import controlador.controladorMenus;

public class MoverFichero {
	FileChooser file = new FileChooser();
	String pathFichero,PathGuardado;
	String[] splitsFichero;
	String simboloWindows;
	public boolean moverFicheroWindows(){
		if(controladorMenus.EsWindows) {
		simboloWindows=("/");
		}else {
		simboloWindows=("\\");
		}
		File fichero =file.getFile();
		pathFichero=file.getPath();
		splitsFichero=pathFichero.split(simboloWindows);
		PathGuardado=file.getSavePath(splitsFichero[splitsFichero.length-1].toString());
        File fichero2 = new File(PathGuardado );

        boolean success = fichero.renameTo(fichero2);
        if (!success) {
            System.out.println("Error intentando cambiar el nombre de fichero");
        }
		return false;
			
	}
}
