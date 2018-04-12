package AntraPamoka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colection {

	public static void main(String[] args) {
		List<String> kolekcija = new ArrayList<>();
		kolekcija.add("vienas");
		kolekcija.add("du");
		kolekcija.add("trys");
		
		int i = 0;
		
		for ( String string : kolekcija) {
			System.out.println("duomenys: " + string);
			i++;
		}
		System.out.println("kolekcijos dydis : " + kolekcija.size());
		System.out.println("istrintas vienas elementas " + kolekcija.get(2));
		System.out.println("istrintas " + kolekcija.remove(2));
		System.out.println("po istrynimo: " + kolekcija.toString());
		int indexof = kolekcija.indexOf("du");
		System.out.println("index of: " + indexof);
		
		Set<String> kolekcija2 = new HashSet<String>();
		kolekcija2.add("a");
		kolekcija2.add("b");
		kolekcija2.add("c");
		kolekcija2.add("d");
		
		Iterator <String>itr = kolekcija2.iterator();
		
		while(itr.hasNext()){
//			Object element = itr.next();
			System.out.println(itr.next());
		}
		
			System.out.println();
			
		print(kolekcija2);
		print(kolekcija);
		printReiksmes(kolekcija2);
		printReiksmeItr(kolekcija);

	}

	private static void printReiksmeItr(List<String> kolekcija) {
		Iterator<String> itr = kolekcija.iterator();
		while(itr.hasNext()){
			System.out.println("List itr: " + itr.next());
		}
		
	}

	private static void printReiksmes(Set<String> kolekcija2) {
		int i = 1;
		for (String string : kolekcija2) {
			System.out.println("Reiksme " + i);
		}
		
		
		
	}

	private static void print(List<String> kolekcija) {
		System.out.println("Listas");
		for (String string : kolekcija) {
			System.out.println(string);
		}
		
	}

	private static void print(Set<String> kolekcija2) {
		for (String string : kolekcija2) {
			System.out.print(string);
		}
	}
}
