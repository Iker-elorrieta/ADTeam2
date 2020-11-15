package metodosComunes;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooser {
	//private File Archivo;
			public static int comprobadorDeTeses=0;
	       private JFrame frame;
	       public FileChooser() {
	           frame = new JFrame();

	           frame.setVisible(true);
	           BringToFront();
	       }
	       public File getFile() {
	    	   switch (comprobadorDeTeses) {
			case 0:
				JFileChooser fc = new JFileChooser();
		           if(JFileChooser.APPROVE_OPTION == fc.showOpenDialog(null)){
		               frame.setVisible(false);
		               return fc.getSelectedFile();
		           }else {
		               System.out.println("Next time select a file.");
		               System.exit(1);
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
			case 4:
				File fichero4 = new File("fichero4.txt");
				return fichero4;
			case 5:
				File fichero5 = new File("fichero5.xml");
				return fichero5;
			
			}
	           
	           return null;
	       }
	       
	       public String getPath() {
	           JFileChooser fc = new JFileChooser();
	           if(JFileChooser.APPROVE_OPTION == fc.showOpenDialog(null)){
	               frame.setVisible(false);
	               return fc.getSelectedFile().getAbsolutePath();
	           }else {
	               System.out.println("Next time select a file.");
	               System.exit(1);
	           }
	           return null;
	       }
	      
	       public String getSavePath() {
	           JFileChooser fc = new JFileChooser();
	           if(JFileChooser.APPROVE_OPTION == fc.showSaveDialog(null)){
	               frame.setVisible(false);
	               return fc.getSelectedFile().getAbsolutePath();
	           }else {
	               System.out.println("Next time select a file.");
	               System.exit(1);
	           }
	           return null;
	       }

	       private void BringToFront() {                  
	                       frame.setExtendedState(JFrame.ICONIFIED);
	               frame.setExtendedState(JFrame.NORMAL);

	       }

	}