package KetvirtaPamoka;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generic4Uzduotis {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,5,8);
		List<String> listS = Arrays.asList("a","b","c");
		List<Float> listF = Arrays.asList(1f,8f,9f);
		System.out.println(getElement(listS,2));
		
		System.out.println(sumElement(list.get(2), listF.get(1)));
		

	}
//------------------------------------------------
	private static <T extends Number> double sumElement(T integer, T float1) {
		return integer.doubleValue() + float1.doubleValue();
	}
//-------------------------------------------------
	private static  <T> T getElement(List<T> list, int a) {
		return list.get(a);
	}
//----------------------------------------------------	

}
