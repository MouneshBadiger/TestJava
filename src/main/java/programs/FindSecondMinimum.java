package programs;

import java.util.Arrays;

public class FindSecondMinimum {
	
	public static void main(String[] args) {
		/* Find the 2nd Minimum Element in the array */
			int[] a= {1,3,5,11,6,0,11,8,2};
			//int[] a= {1,1};//print no 2nd element in such case.
			
			int min=999;//assume  min=3
			int secMin=999;//assume 
			
			for(int i=0;i<a.length;i++) {
				if(a[i]<min) {
					secMin=min;
					min=a[i];
				}
			
			  if(a[i]>min && a[i]<secMin){ //condition for handling last number in array
				  secMin=a[i]; 
			  }
			 
				
			}
			System.out.println("2nd Minimum Element in the array is "+min+"  "+secMin);
			

	}

}