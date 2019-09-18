package programs.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author MOUNESHBADIGERBadige
 *Solution to Find Pair Of Integers in Array whose Sum is Given Number
 */
public class FindPairForGivenSum {
	

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 }; 
		int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		printPairs(numbers,6);
		System.out.println("---------------------");
		printPairsUsingHashtable(numbers,6);
		System.out.println("-----------------------");
		printPairsUsingTwoPointers(numbers,6);

	}
	public static void printPairs(int[] a, int sum) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if((a[i]+a[j])==sum && i!=j) {
					System.out.println(a[i]+"&"+a[j]);
				}
			}
		}
	}
	public static void printPairsUsingHashtable(int[] a, int sum) {
		Set set=new HashSet();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			if(set.contains(sum-a[i]) && a[i]!=sum-a[i])//check if its complement preset
			System.out.println(a[i]+" & "+(sum-a[i]));
		}
	}
	/** * Given a number finds two numbers from an array so that the sum is equal to that number k. * @param numbers * @param k */ 
	public static void printPairsUsingTwoPointers(int[] numbers, int k) {

		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				System.out.printf("Numbers (%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < k) {
				left = left + 1;//shift rightwards
			} else if (sum > k) {
				right = right - 1;//shift leftwards
			}
		}

	}


}
