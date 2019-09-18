package programs;

import java.util.Scanner;

public class TestFibonacci {
	//print fibbonacci series
	//req- count
	public static void printFibonacciWitoutRecursion() {
		//0 1 1 2 3 5 8 13 21
		System.out.println("how many numbers you need?");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		
		System.out.print("0,1");
		int a=0;
		int b=1;
		for(int i=0;i<count;i++) {
			int c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}
	}
	
	//Using recursion
	static int n1=0,n2=1,n3=0;
	public static void  printFibonacci(int count) {
		System.out.println("--printing--");
		if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     } 
		
	}
	static void fibbonacci(int n1,int n2,int count){
		
		int sum=n1+n2;
		System.out.print(" "+sum);
		count--;
		if(count>0)
			fibbonacci(n2,sum,count);
	
}
	public static void main(String[] args) {
		int count=10;    
		  System.out.print(n1+" "+n2);//printing 0 and 1    
		  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	}

}
