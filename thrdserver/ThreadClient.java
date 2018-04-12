package thrdserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ThreadClient {
	
	public void connect(){
		String HOST_NAME = "127.0.0.1";
		int PORT = 4006;
		try {
			Socket client = new Socket(HOST_NAME, PORT);
			BufferedReader br = new BufferedReader(new InputStreamReader(
		            client.getInputStream()));
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			System.out.println("Nusiuskite zinute serveriui: ");
//			Scanner scn = new Scanner(System.in);
//			String pasakymas = scn.next();
//			pw.println(pasakymas);
			String serverResponse = br.readLine();
			System.out.println(serverResponse);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		new ThreadClient().connect();
	}
}
