package metodosComunes;

public class ValidadorSO {

	private String OS = System.getProperty("os.name").toLowerCase();
    
	public ValidadorSO() {
		
	}
	
    public boolean isWindows() {

        return (OS.indexOf("win") >= 0);

    }


    public boolean isUnix() {

        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
        
    }
	
}
