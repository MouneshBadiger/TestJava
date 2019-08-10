package datastructures.sorting;

import java.util.Arrays;

public class HeapSortMine {
	
	public static void main(String[] args) {
		//int arr[] = {12, 11, 13, 5, 6, 7}; 
		int arr[] = {4,10,3,5,1}; 
		int i=arr.length/2 -1;
		while(i>=0) {
			heapify(arr,i);
			i--;
		}
		
		Arrays.stream(arr).forEach(System.out::println);
	}
	public static void heapify(int arr[],int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		int n=arr.length;
		if(l<n && arr[l]>arr[largest]) {
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]) {
			largest=r;
		}
		if(i!=largest) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,largest);
		}
		
		
	}

}
