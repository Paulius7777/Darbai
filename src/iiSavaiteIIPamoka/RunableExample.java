package iiSavaiteIIPamoka;

public class RunableExample implements Runnable{

	public RunableExample(String string) {
		
	}

	@Override
	public void run() {
		for(int  i = 0; i<100; i++){

		System.out.println(Thread.currentThread().getName() +"  " + i);
	}
	}

}
