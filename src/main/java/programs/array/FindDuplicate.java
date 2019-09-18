package programs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	
	public static void main(String[] args) {
		int a[]= {9,2,5,1,6,3,2,1,1,8,3};
		int b[]= {1,2,3,3,4,5,6,7};
		System.out.println("Duplicate Elements using collections:"+Arrays.toString(duplicatesBySet(a)));
		System.out.println("Duplicate Elements using bruteforce:"+Arrays.toString(bruteforce(a)));
		System.out.println("single Duplicate in series:"+findSingleDuplicate(b));
		
	}
	public static Integer[] duplicatesBySet(int[] input) {
		Set<Integer> mySet=new HashSet<Integer>();
		Set<Integer> list=new HashSet<Integer>();
		for(int i=0;i<input.length;i++) {
			if(!mySet.add(input[i])) {
				list.add(input[i]);
			}
		}
		Integer ret[]= {};
		return list.toArray(ret);
	}
	/*
     * brute force way of checking if array contains duplicates in Java
     * comparing each element to all other elements of array
     * complexity on order of O(n^2) not advised in production
     */
    public static Integer[] bruteforce(int[] input) {
    	Set<Integer> list=new HashSet<Integer>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i]==input[j] && i != j) {
                	list.add(input[i]);
                }
            }
        }
    	Integer ret[]= {};
		return list.toArray(ret);
    }
    public static int findSingleDuplicate(int[] a) {
    	//Since there is one extra element lets assume expected sum for n-1 elements
		int n=a.length-1;
		int expSum=n*(n+1)/2;//Expected Sum
		int actualSum=0;//actual sum
		for(int i=0;i<a.length;i++) {
			actualSum+=a[i];
		}
		int missingNumber=actualSum-expSum;
		return missingNumber;
		
	}



}
