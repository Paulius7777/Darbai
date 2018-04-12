package iiSavaiteIIPamoka;

public class ExtendThread extends Thread {
	
	public ExtendThread(String string) {
		super(string);
	}

	public void run(){
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId());
	}
}
