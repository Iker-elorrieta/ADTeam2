package metodosComunes;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooser {
	//private File Archivo;
	
	       private JFrame frame;
	       public FileChooser() {
	           frame = new JFrame();

	           frame.setVisible(true);
	           BringToFront();
	       }
	       public File getFile() {
	           JFileChooser fc = new JFileChooser();
	           if(JFileChooser.APPROVE_OPTION == fc.showOpenDialog(null)){
	               frame.setVisible(false);
	               return fc.getSelectedFile();
	           }else {
	               System.out.println("Next time select a file.");
	               System.exit(1);
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