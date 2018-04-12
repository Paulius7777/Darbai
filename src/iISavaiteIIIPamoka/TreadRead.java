package iISavaiteIIIPamoka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TreadRead {

	public static void main(String[] args) throws FileNotFoundException {
		

		
		skaitom a = new skaitom("File1.txt.txt");
		a.start();
		skaitom b = new skaitom("File2.txt.txt");
		b.start();
		skaitom c = new skaitom("File3.txt.txt");
		b.start();
		skaitom d = new skaitom("File4.txt.txt");
		b.start();
		

		
		

	}
	
	
	static class skaitom extends Thread{
		
		private String text;
		
		public skaitom(String text) {
			this.text = text;
		}
		
		public void run(){
			try {
				BufferedReader read = new BufferedReader(new FileReader(text));
				String line ;
				try {
					while((line = read.readLine()) != null)
						System.out.println(line);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
