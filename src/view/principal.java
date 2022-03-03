package view;

import controller.RedesControllerJava;

public class principal {

	public static void main(String[] args) {
		
		RedesControllerJava controllerJava = new RedesControllerJava();
		String os = controllerJava.os();
		
		System.out.println(os);
		}

}
