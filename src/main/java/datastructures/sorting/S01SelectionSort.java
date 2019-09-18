package datastructures.sorting;

import java.util.Arrays;

/**
 * @author MOUNESHBADIGERBadige
 * Step1 :select the minimun elemement in the array
 * step2 :swap minimum element with first index
 * step3 :move index and find 2nd minimum in sub array and swap with i
 */
public class S01SelectionSort {

	public static void main(String[] args) {
		int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
	    
	    for(int i=0;i<a.length;i++)  
	    {  
	    	int smallest=Integer.MAX_VALUE;
	    	int index=-1;
	        for(int j=i;j<a.length;j++) {
	        	if(a[j]<smallest) {
	        		smallest=a[j];
	        		index=j;
	        	}
	        }
	        //swap elements 
	        int temp=a[i];
	        a[i]=a[index];
	        a[index]=temp;
	    }  
	    System.out.println("\nprinting sorted elements..."+Arrays.toString(a));  
	 

	}


}
