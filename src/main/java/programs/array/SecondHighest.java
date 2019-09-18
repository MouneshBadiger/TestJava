package programs.array;

public class SecondHighest {

	public static void main(String[] args) {
		int a[]= {1,5,6,2,7,2,7,11,6,12};
		int high=Integer.MIN_VALUE;
		int secHigh=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>high) {
				secHigh=high;
				high=a[i];
			}
			if(a[i]>secHigh && a[i]<high) {
				secHigh=a[i];
			}
		}
		System.out.println("Second Highest="+secHigh);
	}
}
