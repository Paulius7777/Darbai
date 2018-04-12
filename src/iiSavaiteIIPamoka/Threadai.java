package iiSavaiteIIPamoka;

import java.util.Scanner;

public class Threadai extends Thread implements Runnable{

	public static void main(String[] args) {
//		RunableExample obej1 = new RunableExample();
//		RunableExample obej2 = new RunableExample();
//		RunableExample obej3 = new RunableExample();
//		
//		Thread obj4 = new Thread(obej1, "");
//		
//		Thread tr1 = new Thread(obej1);
//		tr1.start();
//		obj4.start();
//		RunnableThread tr5 = new RunnableThread( "sesi");
//		
//		Runnable tr9 = ()->{for(int i = 0; i<100;i++) System.out.println(Thread.currentThread().getName()+" "+ i);
//		new RunnableThread("sesi");};
//		tr9.run();
		
		Thread s = new RunnableThread("as");
		s.start();
		
		
//		int sk = 100;
//		for(int i = 0; i < sk; i++){
//			new Thread(()->System.out.println("Sveiki" + Thread.currentThread().getName()),
//					"Thread name" +i).start();
//			
//			Thread a = new RunnableThread("I'am " +i);
//			try {
//				Thread.sleep(0, 1);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//				
//			}
//			a.start();
//		}
		
//		System.out.println("Iveskite thread'u skaiciu:");
//		Scanner s = new Scanner(System.in);
//		int threads = s.nextInt();
//		
//		for (int i = 1; i <= threads; i++)
//			new Thread(
//					() -> System.out.println("Hello, my name is " + Thread.currentThread().getName()),
//					"Thread No " + i)
//			.start();
//	}
	
	}
}
