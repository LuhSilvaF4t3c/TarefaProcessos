package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesControllerJava {
	
	public RedesControllerJava () {
		super ();
    }

	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void ip() {
		String ip = System.getProperty("ipconfig");
		System.out.println(ip);
		
	}
	
	public void ping() {
		String ping = System.getProperty("PING -4 -n 10 www.google.com.br");
		System.out.println(ping);
	}
	
	
	public void readProcess(String process) {
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
