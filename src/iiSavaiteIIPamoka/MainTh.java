package iiSavaiteIIPamoka;

public class MainTh {

	public static void main(String[] args) {
		
		ExtendThread at = new ExtendThread("t");
		at.run();
		at.start();
		
		System.out.println();
		
		RunableThread rt = new RunableThread("RunubleThread");
		Thread th1 = new Thread(rt, "tredas");
		th1.start();
		
		Thread nw = new Thread(()->System.out.println("hi"));
		nw.start();
	}

}
