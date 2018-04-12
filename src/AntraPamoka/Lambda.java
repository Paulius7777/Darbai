package AntraPamoka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


	
public class Lambda {
	
	@FunctionalInterface
	interface MathOper{
		int operation(int a, int b);
	}
	


	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3,6,5,4,7,8,9,8,7);

		
		ints.forEach(x ->{
			if((x*x*x)%2 == 0){
				System.out.println("Jei dalinasi: " + x);
			}
			System.out.print(x+" ");
		});
		


	}

}
