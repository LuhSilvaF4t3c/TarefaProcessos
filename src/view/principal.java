package view;

import controller.RedesControllerJava;

public class principal {

	public static void main(String[] args) {
		
		RedesControllerJava controllerJava = new RedesControllerJava();
		String os = controllerJava.os();
		
		System.out.println(os);
		
		String ip = "ipconfig";
		controllerJava.readProcess(ip);
		
		String ping = "PING -4 -n 10 www.google.com.br";
		controllerJava.readProcess(ping);
		}
}
