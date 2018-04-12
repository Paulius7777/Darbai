package iiSavaiteIIPamoka;

public class RunnableThread extends Thread {
	
	public RunnableThread(String string) {
		super(string);
	}

	public void run(){

		Thread a = new Thread(()->{
			for(int i=0;i<1000;i++){
				System.out.println("Pirmas" + Thread.currentThread().getName()+i);
			}
		});
				a.start();
				
				
		try {
			a.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread b = new Thread(()->{
			for(int i=0;i<1000;i++){
				System.out.println("Antras" + Thread.currentThread().getName()+i);
			}
		});
				b.start();
				System.out.println("kk");
	}
	
}
