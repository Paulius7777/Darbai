package KetvirtaPamoka;
import java.util.Arrays;
import java.util.List;

public class Lambda6Uzduotis {

	@FunctionalInterface
	interface Lyginama {
		boolean operation(int a, int b);
	}

	@FunctionalInterface
	interface MaxElement {
		int max(int[] z);
	}

	@FunctionalInterface
	interface Didinam {
		int up(int q);
	}
	@FunctionalInterface
	interface ZodSum{
		String sumZ(String zo, String zo1);
	}

	public static void main(String[] args) {
		List<String> listS = Arrays.asList("asdf", "gh", "tyty", "hjmj");
		List<Integer> listI = Arrays.asList(2, 5, 8);

		// ----------------------6.1---------------------
		listI.forEach(x -> System.out.println(x * 2));
		// ----------------------6.2-----------------------
		int c = 2;
		int d = 2;

		Lyginama palyginas = (x, y) -> x < y;

		System.out.println(palyginas.operation(c, d));
		// ---------------------6.3-----------------------
		int[] mas = { 10, 5, 7, 8, 9 };

		MaxElement max = x -> {
			int maxx = x[0];
			for (int integer : x) {
				if (maxx > integer) {
					maxx = integer;
				}
			}
			return maxx;
		};

		System.out.println(max.max(mas));
// -------------------6.4-------------------------
		Didinam did = x-> x+5;
		System.out.println(did.up(0));
//---------------------6.5---------------------
		int i =0;
		while(  (did.up(i)-4) <= 10  ) {
			System.out.println(i);
			i++;
		}
//--------------------6.6------------------------
		
		ZodSum sumaZodziu = (x,y)-> x += y;
		System.out.println(sumaZodziu.sumZ("Labas"," Lab"));
	}

}
