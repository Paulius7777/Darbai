package thrdserver;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
	public static void main(String[] args){
		
		final int PORT = Integer.parseInt(args[0]);
		ServerSocket serversock = null;
		
		try {
			serversock = new ServerSocket(PORT);
			while(true){
				new Thread(new ThreadServer(serversock.accept()), "Threadas").start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
