package datastructures.sorting;

import java.util.Arrays;

public class S03BubbleSort {

	 public static void main(String[] args) {
		  int[] a = {10, 9, 7, 101, 23, 44, 1,12, 78, 34, 23,3,2,1};  
		  
		  
			 for(int j=0;j<a.length-1;j++) {
				 for(int i=0;i<a.length-1-j;i++) {
					  if(a[i]>a[i+1]) {
						  int temp=a[i];
						  a[i]=a[i+1];
						  a[i+1]=temp;
					  }
				  }
			 }
		    System.out.println("Printing Sorted List ..."+Arrays.toString(a));  
		   
	}
}
