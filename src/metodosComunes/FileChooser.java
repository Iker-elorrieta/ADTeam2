package metodosComunes;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooser {
	//private File Archivo;
			public static int comprobadorDeTeses;
	       private JFrame frame;
	       private String path;
	       JFileChooser fc;
	       public FileChooser() {
	           frame = new JFrame();

	           frame.setVisible(true);
	           BringToFront();
	       }
	      
	       public File getFile() {
	    	   switch (comprobadorDeTeses) {
			case 0:
				fc = new JFileChooser();
		           if(JFileChooser.APPROVE_OPTION == fc.showOpenDialog(null)){
		               frame.setVisible(false);
		               path=fc.getSelectedFile().getAbsolutePath();
		               
		               return fc.getSelectedFile();
		           }else {
		               System.out.println("La proxima vez seleccione un archivo.");
		           }
		           break;
				
			case 1:
				File fichero1 = new File("fichero1.csv");
				return fichero1;
			case 2:
				File fichero2 = new File("fichero2.xml");
				return fichero2;
			case 3:
				File fichero3 = new File("fichero3.txt");
				return fichero3;
			}
	    	   
	           return null;
	       }
	       
	       public String getAbsolutePath() {
	           fc = new JFileChooser();
	           if(JFileChooser.APPROVE_OPTION == fc.showOpenDialog(null)){
	               frame.setVisible(false);
	               
	               return fc.getSelectedFile().getAbsolutePath();
	           }else {
	               System.out.println("La proxima vez seleccione un archivo.");
	           }
	           return null;
	       }
	       
	       
	      
	       public String getSavePath(String nombre) {
	    	   fc = new JFileChooser();
	           fc.setSelectedFile(new File(nombre));
	           if(JFileChooser.APPROVE_OPTION == fc.showSaveDialog(null)){
	               frame.setVisible(false);
	               return fc.getSelectedFile().getAbsolutePath();
	           }else {
	               System.out.println("La proxima vez seleccione un archivo.");
	           }
	           return null;
	       }

	       private void BringToFront() {                  
	                       frame.setExtendedState(JFrame.ICONIFIED);
	               frame.setExtendedState(JFrame.NORMAL);

	       }
	       
	       public String getPath() {
	    	   return this.path;
	       }
	       
	       public void dispose() {
	    	   frame.setVisible(false);
	       }
	       
		
	       
	}