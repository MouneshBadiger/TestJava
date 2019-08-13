package test;

public class FindMininum {
	
	public static void main(String[] args) {
		
		System.out.println("Find the minimum element in the array and return its first ocuring index");
		int a[]= {1,5,6,1,9,3};
		
		int min=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				index=i;
			}
		}
		System.out.println("Mininum Elemnt:"+min+" at index:"+index);
	}

}
