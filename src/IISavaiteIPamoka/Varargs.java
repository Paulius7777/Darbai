package IISavaiteIPamoka;

import java.io.PrintWriter;
import java.util.Date;

import javax.xml.crypto.Data;

public class Varargs {

	public static void main(String[] args) {
		
		Date a = new Date();
		ManoTipas b = new ManoTipas();
		b.setD("Viso gero");
		String c = "Labas";
//		print(a, b, c, "las", "all");
//		print1("a", "b", "c");
		String format = String.format("Savaites diena %tA", a);
		System.out.println("Savaites dienos: " + format);
		System.out.println(String.format("Menesio diena: %td", a));
		System.out.println(String.format("Doublas 7 kaitmenys %.2f\n",1.1234567895 ));
		System.out.printf("%.2f\n",0.2563658);
		System.out.printf("%tT", a);
		

		
	}
	private static void print1(String ...string){
		for (String string2 : string) {
			System.out.println(string2);
		}
	}

	private static void print(Date a, ManoTipas b, String ...c) {
		System.out.println(a.toString() + " " + b.toString() + " " + c.toString());
		
	}



}
