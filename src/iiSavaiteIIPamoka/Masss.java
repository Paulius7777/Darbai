package iiSavaiteIIPamoka;

import java.util.Random;

public class Masss {
	
	

	public static void main(String[] args) {

		int [] a = new int[30]; 
		
		for(int i = 0; i <a.length; i++){
			Random ran = new Random();
			a[i] = ran.nextInt(100);
		}
		
		Thread th1 = new Thread(new A(a));
		th1.start();
	}

}
