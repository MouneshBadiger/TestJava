package datastructures.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author MOUNESHBADIGERBadige
 *
 */
/**
 * @author MOUNESHBADIGERBadige
 *
 */
public class S02InsertionSort {
	/**
	 Step1:=Pick first element and keep which is sorted by default
    Step2:=Pick second element element and store in temp variable
    Step3:= Compare the picked element in sorted elements i,e leftside elements 
    step4:=if compared element is more than picked element shift element right(a[k]=a[k-1]))
			Note that in this a[k] is overridded but no problem since we have stored it in temp
	Step5: Decrement k and Repeat for all elements in sorted Set. If More than picked element shift right 
	step6: while loop will terminate 
			case1: when picked element finds its place i,e a[k-1] becomes less than picked elment. (No need to compare with rest of elements as its a sorted set)
			case2: when it compares with all elments and its preset place is the actual place
	 */
	public static void insertingSort() {
		int[] a = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23 ,1,1};
		
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int k=i;
			while(k>0 && a[k-1]>temp) {//Step3 step6
				a[k]=a[k-1];//step4
				k=k-1;
			}
			a[k]=temp;
		}
		System.out.println("printing sorted elements ..." + Arrays.toString(a));
	}
	
}
