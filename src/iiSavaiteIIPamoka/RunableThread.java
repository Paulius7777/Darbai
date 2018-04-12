package iiSavaiteIIPamoka;

public class RunableThread implements Runnable {
	
	String name;

	public RunableThread(String string) {
		this.name = string;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

	public String getName() {
		return name;
	}

}
