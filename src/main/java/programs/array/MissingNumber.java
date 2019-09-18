package programs.array;

/**
 * @author MOUNESHBADIGERBadige
 *Find the missing number in natural order series
 *Sum of of series =n(n+1)/2
 */
public class MissingNumber {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,8,9};
		int n=a.length+1;
		int expSum=n*(n+1)/2;//Expected Sum
		int sum=0;//actual sum
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		int missingNumber=expSum-sum;
		System.out.println("missing number is:"+missingNumber);
		
	}

}
