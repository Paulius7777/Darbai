package iISavaiteIIIPamoka;

public class ThreadWrite {

	public static void main(String[] args) {
		Rasom ras = new Rasom("File1.txt.txt");
		ras.start();

	}
	
	static class Rasom extends Thread{
		private String name;

		public Rasom(String string) {
			this.name = string;
		}
		
		public void run(){
			
		}
		
	}

}
