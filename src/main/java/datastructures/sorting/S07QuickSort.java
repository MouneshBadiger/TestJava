package datastructures.sorting;

import java.util.Arrays;

public class S07QuickSort {
	public static void main(String[] args) {
		int arr[]= {23,5,0,10,12,2,6,44,6,1,7,11,6,2,61,9,1,10};
		sort(arr,0,arr.length-1);
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	public static void sort(int arr[],int lowIndex, int highIndex) {
		
		if(lowIndex<highIndex) {
			int pi=partition(arr,lowIndex,highIndex);
			sort(arr,lowIndex,pi-1);
			sort(arr,pi+1,highIndex);
		}
		
	}
	  /* This function takes last element as pivot, 
    places the pivot element at its correct 
    position in sorted array, and places all 
    smaller (smaller than pivot) to left of 
    pivot and all greater elements to right 
    of pivot */
	 static int partition(int arr[], int low, int high) 
	 { 
	     int pivot = arr[high];  
	     int PI = (low); // Piovt index (PI is like i,i is like j from https://www.youtube.com/watch?v=3DV8GO9g7B4)
	     for (int i=low; i<high; i++) 
	     { 
	         // If current element is smaller than or 
	         // equal to pivot 
	         if (arr[i] < pivot) 
	         { 
	             // swap arr[i] and arr[PI] 
	             int temp = arr[PI]; 
	             arr[PI] = arr[i]; 
	             arr[i] = temp; 
	        	 PI++; 
	         } 
	     } 
	
	     // swap arr[PI] and arr[high] (or pivot) 
	     int temp = arr[PI]; 
	     arr[PI] = arr[high]; 
	     arr[high] = temp; 
	
	     return PI; 
	 } 
}
