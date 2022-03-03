package controller;

public class RedesControllerJava {
	
	public RedesControllerJava () {
		super ();
    }

	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}
}
