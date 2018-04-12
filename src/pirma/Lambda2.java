package pirma;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {

	@FunctionalInterface
	interface MathOper {
		int operation(int a, int b);
	}

	@FunctionalInterface
	interface MathCube {
		int opertaion(int a);
	}

	@FunctionalInterface
	interface SizeListo {
		int sarasas(List a);
	}

	@FunctionalInterface
	interface SizeListas<T> {
		int sarasu(List<T> a);
	}

	@FunctionalInterface
	interface First<T> {
		Object getFirst(List<T> a);
	}

	@FunctionalInterface
	interface Pirminis {
		boolean arPirminis(int a);
	}

	public static void main(String[] args) {

		// MathOper add = (c, e) -> c+e;
		// int sum = add.operation(2, 5);
		// System.out.println(sum);
		//
		// MathOper sub = (c, e) -> c-e;
		// int skirtumas = sub.operation(5, 2);
		// System.out.println(skirtumas);
		//
		// MathCube matchCube = a-> a*a*a;
		// int cube = matchCube.opertaion(5);
		// System.out.println(cube);

		List<Integer> list = Arrays.asList(1, 2, 5, 4, 8, 7, 8);
		List<String> listB = Arrays.asList("sdf", "df", "dfbgx", "xdg");
		
		list.stream()
		.forEach(x -> System.out.print(x + ", "));
		

		SizeListo listDydis = a -> list.size();
		int dydis = listDydis.sarasas(list);
		System.out.println(dydis);

		SizeListas listbetkoks = a -> listB.size();
		int dydisBetkoks = listbetkoks.sarasu(listB);
		System.out.println(dydisBetkoks);
		
//		int sum = 0;
		list.forEach(x-> {
			Integer sum = x;
			System.out.println(sum + x);
		});

		// ------------------Listo pirmas skaicius-----------------//

		First pirasEl = a -> {
			if (a.isEmpty())
				return null;
			return a.get(0);
		};
		System.out.println(pirasEl.getFirst(listB));
		// -----------------Pirminis skaicius-----------------------//

		int b = 10;
		Pirminis a = x -> {
				for (int i = 2; i < b; i++) {
				if (i % 2 == 0)
					System.out.println("p");
					return true;
		}
			return false;
		};
			

		boolean c = a.arPirminis(4);
		if (c) {
			System.out.println("Pirminis");
		} else {
			System.out.println("Nepirminis");
		}

		}
}
