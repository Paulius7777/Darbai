package AntraPamoka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uzduotys {

	public static void main(String[] args) {
		List<Integer> sk = new ArrayList<>();
		sk.add(1);
		sk.add(2);
		sk.add(3);
		sk.add(4);
		sk.add(5);
		List<Integer> sk2 = new ArrayList<>();
		sk2.add(6);
		sk2.add(7);

		print(sk);
		Collections.reverse(sk);
		print(sk);
		palindrome("abccba");
//----------------------------------
		
		
		int skai = 123456;
		List<Integer> skaiciu = new ArrayList<>();
		while (skai > 0) {
			int s = skai%10;
			skaiciu.add(s);
			skai = skai/10;
		}
		System.out.println("//--------LISTAS------------//");
		Collections.sort(skaiciu);
		print(skaiciu);
		
	
//-----------------------------------//
		
		
		int arYraSk = 2;
		boolean arYra = false;
		for (Integer skaicius : sk) {
			if (skaicius == arYraSk) {
				arYra = true;
			}
		}
		if(arYra){
			System.out.println("Yra");
		}else{
			System.out.println("nera");
		}
//--------------------------------------------		
		for (Integer integer : sk) {
			if (!(sk.indexOf(integer) % 2 == 0)) {
				System.out.println(integer);
			}
		}
//-------------------------------------------		
		System.out.println();
		Collections.sort(sk);
		sujungti(sk, sk2);
		print(sk);
	}
//-------------------------------
	

	private static List<Integer> sujungti(List<Integer> sk, List<Integer> sk2) {
		for (Integer integer : sk2) {
			sk.add(integer);
		}
		return sk;
		
	}
	
	private static void palindrome(String Zodis) {
		int len = Zodis.length();
		String atbulai = "";
		for (int i = len - 1; i >= 0; i--) {
			atbulai = atbulai + Zodis.charAt(i);
		}
		System.out.println(atbulai);
		if (Zodis.equals(atbulai)) {
			System.out.println("fraze - zodis polindromas");
		} else {
			System.out.println("Zodis - fraze nepolindromas");
		}
	}
	
	

	private static void print(List<Integer> sk) {
		for (Integer integer : sk) {
			System.out.println(integer);
		}
		System.out.println();
	}

}
