package datastructures.linear.aray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {
	 
	/*ArrayCoppy*/
	public static void main1(String[] args) {
		char ch[]= {'m','o','u','n','e','s','h'};
		
		char to[]=new char[7];
		
		 System.arraycopy(ch, 3, to, 2, 3);
		 System.out.println(to);
	}
	
	
	//ArrySorting

	public static void main2(String[] args) {
		int a[] = { 2, 4, 5, 6, 2, 1 };
		int b[] = { 4, 2, 1, 5, 6, 2 };
		Integer c[] = { 4, 2, 1, 5, 6, 2 };
		Arrays.sort(a);
		Arrays.sort(b);
		Collections.sort(Arrays.asList(c));
		System.out.println(Arrays.equals(a, b));

	}
	 
}
