package KetvirtaPamoka;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sarasai3Uzduotis {

	public static void main(String[] args) {
		List<String> list5 = Arrays.asList("adsfasdf","sdfad","etryert","uyiuityuk","zvczxcv");
//-----------------3.1-----------------
		for (int i = 0; i < list5.size(); i++) {
			System.out.print(list5.get(i) + " ,");
		}
		System.out.println();
//-----------------3.2-----------------
		for (String string : list5) {
			System.out.print("   " + string +" ,");
		}
		System.out.println();
//----------------3.3---------------------
		Iterator<String> itr = list5.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.print("  ----  " + string);
		}
		System.out.println();
//--------------3.4----------------------
		list5.forEach(x-> System.out.print(" +++++++  + x"));

	}

}
