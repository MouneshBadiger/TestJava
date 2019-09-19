package datastructures.sorting;


//Max no of nodes of complete binary tree: 2^(h+1) -1
//height of any tree: log(n) //floor n=no of nodes 
//no of non leaf nodes in a binary tree: |n/2|-1
//heafify alowys build heap from bottom to top 
//heafify has O(nlogn)
//removing large element from heap takes O(nlogn)
//O(nlogn)+O(nlogn)= O(nlogn)
public class S06HeapSort {
	public void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Build heap (rearrange array) 
        for (int i = n/2-1; i >= 0; i--) {
        	heapify(arr, i, n); 
        }
  
        // Extract largest element from arr[0] and place it at last index
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // call max heapify on the reduced heap //heapify function calls recursivly downwords on its children nodes
            heapify(arr, 0,i); //its start from 0 because all other branch of tree are already heafied// only we need to place oth index in correct position
        } 
    } 
  
    // To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    void heapify(int arr[], int i, int n) 
    { 
        int swapedIndex = i; // Initialize largest as root assume
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[swapedIndex]) //check left node exists and compare
        	swapedIndex = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[swapedIndex]) //check right node exists and compare
        	swapedIndex = r; 
  
        // If largest is not root 
        if (swapedIndex != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[swapedIndex]; 
            arr[swapedIndex] = swap; 
  
            // Recursively heapify the affected sub-tree from node where where large Element was found i,e index where Large element was present i,e swapped inde
            heapify(arr,swapedIndex, n ); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        //int arr[] = {12, 11, 13, 5, 6, 7}; 
        int arr[] = {4,10,3,5,1}; 
        int n = arr.length; 
  
        S06HeapSort ob = new S06HeapSort(); 
        ob.sort(arr); 
  
        System.out.println("Sorted array is"); 
        printArray(arr); 
    } 

}
