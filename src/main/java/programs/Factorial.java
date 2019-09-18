package programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iterative Factorial is "+findFactorialIterative(5));
		System.out.println("Recursive Factorial is "+findFactorialRecursive(5));
		
	}
	
	static int findFactorialIterative(int number){
		int temp=1;
		while(number>1) {
			temp=temp*number;
			number--;
		}
		return temp;
	}
	
	static int findFactorialRecursive(int n) {
		
		if(n>1) {
			return n*findFactorialRecursive(n-1);
		}else
			return 1;
		
	}

}
