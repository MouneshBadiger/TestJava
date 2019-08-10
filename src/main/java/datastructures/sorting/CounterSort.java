package datastructures.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class CounterSort {
	
	public static void main(String[] args) {
		int a[]= {2,5,12,6,3,9,0,2,1,0,77,33,22,16};
		Integer maxofA=Arrays.stream(a).max().getAsInt();
		//1.create an array for putting count its from 0 to MaxNo+1 index
		int b[]=new int[maxofA+1];//index array
		
		for(int i=0;i<a.length;i++) {
			b[a[i]]++;//2.increment the count if same number repeating
		}
		
		for(int i=0;i<b.length-1;i++)
		{
			b[i+1]=b[i]+b[i+1];//3.add previous number to current number and update 
		}
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int finalIndex=b[a[i]]-1;//4.left shift index by 1 to get correct index
			c[finalIndex]=a[i];
			b[a[i]]--;//5. decrement the counter
		}
		Arrays.stream(c).forEach(System.out::println);
		
		int d[]=Arrays.copyOf(a, a.length);
		Arrays.sort(d);
		System.out.println(Arrays.equals(c, d));
		
	}

}
