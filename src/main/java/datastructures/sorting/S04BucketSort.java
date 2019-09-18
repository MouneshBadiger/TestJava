package datastructures.sorting;

import java.util.Arrays;

public class S04BucketSort {
	

	   public static void sort(int[] a, int maxVal) {
	      int [] bucket=new int[maxVal+1];//create bucket array of length 
	 
	      for (int i=0; i<bucket.length; i++) {
	         bucket[i]=0;//initialise all elements of bucket to 0
	      }
	 
	      for (int i=0; i<a.length; i++) {
	         bucket[a[i]]++;//in case duplicates increment the bucket value
	         //Ex. i=0 a[i]=5 i,e bucket[5]
	      }
	 
	      int outPos=0;
	      for (int i=0; i<bucket.length; i++) {
	         for (int j=0; j<bucket[i]; j++) {//j<(more than 1 if duplicates)
	            a[outPos++]=i;
	         }
	      }
	   }
	 
	 
	   public static void main(String[] args) {
	      int maxVal=5;
	      int [] data= {5,3,0,2,4,1,0,5,2,3,1,4}; 
	 
	      System.out.println("Before: " + Arrays.toString(data));
	      sort(data,maxVal);
	      System.out.println("After:  " + Arrays.toString(data));
	   }

}
