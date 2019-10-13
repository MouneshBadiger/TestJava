package datastructures.sorting;

import java.util.Arrays;

public class S03BubbleSort {

	 public static void main(String[] args) {
		  int[] a = {10, 9, 7, 101, 23, 44, 1,12, 78, 34, 23,3,2,1};  
		  
			 for(int i=0;i<a.length-1;i++) {
				 
				 for(int j=0;j<a.length-1-i;j++) {//loop to compare two elements and swap//in each itration largest element reach last index
					  if(a[j]>a[j+1]) {
						  int temp=a[j];
						  a[j]=a[j+1];
						  a[j+1]=temp;
					  }
				  }
			 }
		    System.out.println("Printing Sorted List ..."+Arrays.toString(a));  
		   
	}
}
