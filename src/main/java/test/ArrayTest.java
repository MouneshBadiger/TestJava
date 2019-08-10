package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {

/*	public static void main(String[] args) {
		int myDArr[][]=new int[2][];
		int myDArr1[][]= {{1,2},{1,5,4}};
		//myDArr1[1]=new int[5];
		System.out.println(myDArr1[1][1]);
	}*/
	/*ArrayCoppy*/
	/*public static void main(String[] args) {
		char ch[]= {'m','o','u','n','e','s','h'};
		
		char to[]=new char[7];
		
		 System.arraycopy(ch, 3, to, 2, 3);
		 System.out.println(to);
	}*/
	
	/*ArryMultiplication*/
	/*public static void main(String[] args) {
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				for(int k=0; k<3;k++) {
					
					c[i][j]=c[i][j]+a[i][j]*b[i][k];
					
					
				}
			}
		}
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}*/
	
	//ArrySorting
	public static void main(String[] args) {
		int a[]= {2,4,5,6,2,1};
		int b[]= {4,2,1,5,6,2};
		Integer c[]= {4,2,1,5,6,2};
		Arrays.sort(a);
		Arrays.sort(b);
		Collections.sort(Arrays.asList(c));
		System.out.println(Arrays.equals(a, b));
		
	}
}
