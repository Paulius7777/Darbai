package KetvirtaPamoka;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sortinimas {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,5,8,4,1,9};
		int [] arr2 = doSort(arr1);
		
		for (int i : arr2) {
			System.out.println(i);
		}

	}

	private static int[] doSort(int[] arr) {
		 for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j] < arr[index]) 
	                    index = j;
	      
	            int smallerNumber = arr[index];  
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        return arr;

	}
}
