package datastructures.sorting;

import java.util.Arrays;
//In merge sort two arrays sorted and merged back.. resuting array is sorted it is done recursiviely
//step 1: divide array into two parts based on m
//step 2: sort left and right array recursively.
//step 3 : Since it is recursive merge method will start when sort recursion exits(l>=r)

public class S05MergeSort {
	
	public static void main(String[] args) {
		int arr[]= {3,5,1,6,2,7,9,11,57,22};
		sort(arr, 0, arr.length-1); 
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	public static void sort(int arr[],int l, int r) {
		 if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
		
	}
	
	public static void merge(int arr[],int l,int m,int r) {
		  // Find sizes of two subarrays to be merged ex. 1 2 3 4 5 =>m=5/2=2, l=0,r=5 n1=
        int n1 = m - l + 1; //+1 bcz its 0 based index
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) //Loop will terminate if any of sub array exahasted all index variables holds the last index of operation
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
		/* Any one of the below while loop will execute */
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
	}

}
