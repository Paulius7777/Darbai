package AntraPamoka;

import java.util.HashMap;
import java.util.Map;

public class Mapai {

	public static void main(String[] args) {
		Map<String, Integer> pam = new HashMap<>();
		pam.put("a", 1);
		pam.put("b", 2);
		pam.put("c", 3);
		pam.put("d", 4);
		

		printReiksmes(pam);
		
		pam.remove("b");
		System.out.println();
		pam.put("a", 5);
		
		printReiksmes(pam);
		
		System.out.println("Dydis: " + pam.size());
		System.out.println("keySet: " + pam.keySet());
		System.out.println("Values: " + pam.values());


	}

	private static void printReiksmes(Map<String, Integer> pam) {
		for (Map.Entry<String, Integer> entry : pam.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println("Raktas :"+key+ " Reiksme: "+ value);

	}
		
	}
}
