package datastructures.linear.aray;

public class ArrayMultiplication {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				for(int k=0; k<3;k++) {
					
					c[i][j]=c[i][j]+a[i][k]*b[k][j];//in 'a' we are incrementing column, in rows in b, K is just extra pinter
					
					
				}
			}
		}
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
