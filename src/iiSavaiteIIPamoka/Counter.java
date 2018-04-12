package iiSavaiteIIPamoka;

public class Counter {
	
	static int counter=0;

	public static void main(String[] args) {
		IncrementT a = new IncrementT();
		IncrementT b = new IncrementT();
		a.start();
		b.start();

		while(a.isAlive() || b.isAlive()){
			
		}
	
		System.out.println("Skaitliukas " + counter);
		
	}
	
	static class IncrementT extends Thread{
		
	public void run(){
		for(int i = 0; i<10000 ; i++){
			inc();
		}
	}
	static synchronized void inc(){    //synchronize metoda thread
		counter++;
	}
	}

}
