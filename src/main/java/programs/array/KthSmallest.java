package programs.array;
// Java code for kth smallest element 
// in an array 
import java.util.Arrays; 
import java.util.Collections; 

class KthSmallest 
{ 
	// Function to return k'th smallest 
	// element in a given array 
	public static int kthSmallest(Integer [] arr,int k) 
	{ 
		// Sort the given array 
		Arrays.sort(arr); 

		// Return k'th element in 
		// the sorted array 
		return arr[k-1]; 
	} 
	
	//  program 
	/* program does not work if duplicates are present */
	//this can be solved using MinHeap and Quick Sort as well
	public static void main(String[] args) 
	{ 
		Integer arr[] = new Integer[]{12, 3, 5, 7, 19}; 
		int k = 2; 
		System.out.print( "K'th smallest element is "+kthSmallest(arr, k) );	 
	} 
} 

// This code is contributed by Chhavi 
