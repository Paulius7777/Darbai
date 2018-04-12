package thrdserver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadServer implements Runnable {
	Socket client;
	PrintWriter pw;
	BufferedReader br;
	public ThreadServer(Socket sock){
		this.client = sock;
	}
	@Override
	public void run() {
		try {
			pw = new PrintWriter(client.getOutputStream(), true);
			pw.println("Prisijungta prie serverio prie threado: "+Thread.currentThread().getId());
			pw.close();
		//	br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String clientResponse = br.readLine();
			System.out.println(clientResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
