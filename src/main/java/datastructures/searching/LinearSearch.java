package datastructures.searching;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		while(true) {
			int arr[]= {1,5,6,7,11,64,63,62,85,16,73};
			
			System.out.println("Enter the the value to be searched:");
			Scanner sc=new Scanner(System.in);
			int no=sc.nextInt();
			boolean isFound=false;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==no) {
					isFound=true;
					break;
				}
			}
			if(isFound)
				System.out.println("Element found");
			else
				System.out.println("Element not found");
		}
	}
	

}
