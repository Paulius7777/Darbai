package TreciaPamoka;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 5, 4, 8, 7, 8);
		List<String> listB = Arrays.asList("sdf", "df", "dfbgx", "xdg","a","A");
		
		list.stream()
		.forEach(x -> System.out.print(x + ", "));
		
		List<Integer> nelyg = list.stream()
				.filter(value -> value%2 != 0)
				.collect(Collectors.toList());
//				.forEach(System.out::println);
		
		System.out.println();
		
		nelyg.forEach(x -> System.out.print(x + ", "));
		
		List<String> words = listB.stream()
				.filter(value ->value.length() < 4)
				.collect(Collectors.toList());
		
		List<String> wordsA = listB.stream()
				.filter(word -> word.toUpperCase().startsWith("A"))
				.collect(Collectors.toList());
		System.out.println();

		wordsA.stream()
		.forEach(value -> System.out.print(value + ", "));
		
	}

}
