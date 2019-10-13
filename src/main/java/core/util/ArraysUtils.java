package core.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysUtils {
	
	public static void main(String[] args) {
		//Printing the elements of an Array
		String str[]= {"mouneh","badiger","kenganur"};
		char ch[]="mounesh".toCharArray();
		System.out.println(Arrays.toString(str));
		
		//Sort an Array of Objects
		Arrays.sort(str);//uses Quick Sort
		//Arrays.parallelSort(str); uses Merge Sort
		System.out.println("Sorted:"+Arrays.toString(str));
		
		//Custom Sorting
		Comparator<String> cmp=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		Arrays.sort(str, cmp);
		System.out.printf("Cusotom rev Sorted:"+Arrays.toString(str)+"%n%n");	
		
		
		//creating stream
		Arrays.stream(str).forEach(System.out::println);
		
		
	}

}
