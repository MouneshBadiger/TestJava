package programs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iterative Factorial is "+findFactorialIterative(5));
		System.out.println("Recursive Factorial is "+findFactorialRecursive(5));
		System.out.println("Java 8 Factorial is "+findFactorialUsingJava8(5));
		
		
		
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
		
		if(n==1) {
			return 1;
		}else
			return n*findFactorialRecursive(n-1);
		
	}
	static int findFactorialUsingJava8(int number) {
		IntStream ints=IntStream.range(1, number+1);
		//ints.forEach(System.out::println);
		int fact=ints.reduce(1, (a,i)->(a*i));
		return fact;
	}

}
