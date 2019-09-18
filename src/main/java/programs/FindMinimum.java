package programs;

public class FindMinimum {
	/* Find the Minimum Element in the array */
	public static void main(String[] args) {
		int[] a= {1,3,5,11,6,11,8,2,0,0};
		
		int min=999;//assume 
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("2nd Minimum Element in the array is "+min);
		
	}

}
