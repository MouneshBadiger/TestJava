package datastructures.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[]= {23,5,0,10,12,2,6,44,6,1,7,11,6,2,61,9,1,0};
		sort(arr,0,arr.length-1);
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	public static void sort(int arr[],int low, int high) {
		
		if(low<high) {
			int pi=partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
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
	     int PI = (low); // index of smaller element 
	     for (int i=low; i<high; i++) 
	     { 
	         // If current element is smaller than or 
	         // equal to pivot 
	         if (arr[i] <= pivot) 
	         { 
	             // swap arr[i] and arr[PI] 
	             int temp = arr[PI]; 
	             arr[PI] = arr[i]; 
	             arr[i] = temp; 
	        	 PI++; 
	         } 
	     } 
	
	     // swap arr[i+1] and arr[high] (or pivot) 
	     int temp = arr[PI]; 
	     arr[PI] = arr[high]; 
	     arr[high] = temp; 
	
	     return PI; 
	 } 
}
