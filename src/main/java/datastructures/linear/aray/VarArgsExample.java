package datastructures.linear.aray;

public class VarArgsExample {
	
	public static void main(String[] args) {
		System.out.println(findSum(1.9,3,4,1,2));//f=1.9 a=3,4,1,2
		System.out.println(findSum(1,2,3,4,5));//f=1.9 a=3,4,1,2
	}
	public static int findSum(double f,int... a) {
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		
		return sum;
	}

}
