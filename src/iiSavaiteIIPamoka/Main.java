package iiSavaiteIIPamoka;

public class Main extends Thread {
	
	public void run(){
		new Thread(()->{
			for(int i = 0; i<1000; i++){
				System.out.println(Thread.currentThread().getName() + "Pirmas " +i);
			}
		}).start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread(()->{
			for(int i = 0; i<100; i++){
				System.out.println(Thread.currentThread().getName() + "Antras " +i);
			}
		}).start();
		
		
	}
	
	
	public static void main(String[] args) {
		Thread a = new Main();
		a.start();
	}

}
