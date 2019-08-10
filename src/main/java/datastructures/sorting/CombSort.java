package datastructures.sorting;

import java.util.Arrays;
import java.util.List;

public class CombSort {
	public static void main(String[] args) {
		int arr[]= {12,12,5,6,1,7,22,54,15,22};
		int gap=arr.length;
		boolean swapped=false;
		while(gap>1 || swapped==true) {
			gap=(int) (gap/1.3);
			swapped=false;
			for(int i=0;i<arr.length-gap;i++) {
				if(arr[i]>arr[i+gap]) {
					int temp=arr[i+gap];
					arr[i+gap]=arr[i];
					arr[i]=temp;
					swapped=true;
				}
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	
}
