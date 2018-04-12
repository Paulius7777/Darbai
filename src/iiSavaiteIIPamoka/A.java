package iiSavaiteIIPamoka;

public class A extends B implements Runnable {
	
	private int [] a ;

	public A(int[] a) {
		this.a = a;
	}

	@Override
	public void run() {
		printSum(a);
		
	}

}
