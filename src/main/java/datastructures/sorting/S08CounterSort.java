package datastructures.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 *1.create an array for putting count its from 0 to MaxNo+1 index
 *2.increment the count if same number repeating
 *3.add previous number to current number and update 
 *4.left shift index by 1 to get correct index
 *5. decrement the counter
 */
public class S08CounterSort {
	
	public static void main(String[] args) {
		int a[]= {2,5,12,6,3,9,0,2,1,0,77,33,22,16};
		Integer maxofA=Arrays.stream(a).max().getAsInt();
		//1.create an array for putting count its from 0 to MaxNo+1 index
		int counArr[]=new int[maxofA+1];//index array
		
		for(int i=0;i<a.length;i++) {
			counArr[a[i]]++;//2.increment the count if same number repeating
		}
		
		for(int i=0;i<counArr.length-1;i++)
		{
			counArr[i+1]=counArr[i]+counArr[i+1];//3.add previous number to current number and update (Note first element kept as it is)
		}
		int c[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int finalIndex = counArr[a[i]];
			finalIndex = finalIndex - 1;// 4.left shift index by 1 to get correct index
			c[finalIndex] = a[i];
			counArr[a[i]]--;// 5. decrement the counter
		}
		Arrays.stream(c).forEach(System.out::println);
		
		int d[]=Arrays.copyOf(a, a.length);
		Arrays.sort(d);
		System.out.println(Arrays.equals(c, d));
		
	}

}
