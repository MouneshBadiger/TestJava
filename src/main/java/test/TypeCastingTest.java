package test;

public class TypeCastingTest implements MyInterface{

	/*1
	 * public static void main(String[] args) {
		double i=10.0;
		double j=10.0f;
		double k=i+j;
		//types below int and int when added result will be int
		//when you operate on float and float or below result will be float
		//when add double and double or below double result will double
	}*/
	
	 
	/*2
	 * public static void main(String[] args) {
		TestClass test=new TestClass();
		test.makeSound();
	}
	 * When A default method is overriden implementation class method is used:same as inheritance, nothing special
	 * public void makeSound() {
		System.out.print("bow  bow"); 
	}*/
	
	/*3 Type Casting
	public static void main(String[] args) {
		//downcasting
		int k=10;
		//byte b=k;//Type mismatch: cannot convert from int to byte
		byte b=(byte) k;
		
		Integer i1=10;
		b=i1.byteValue();//no error in case of Wrapper classes
		
		
		//upcasting
		byte b2=10;
		int i3=b2;//no error on upcasting
		
		Byte b1=10;
		int i2=b1.intValue();
	}*/
	
	/*
	public static void main(String[] args) {
		
		int k=10+5*2/(12-4);
		//10+10/8
		//10+1
		//11
		//it fallows java operator precedence table where *,/ comes before +,- (parenthese takes highest precedence)
		//http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
		System.out.println("Result="+k);
		int i=14;
		int j=11;
		int l=(++i)+(j++)+(++i);
		//15+11+16
		//43
		System.out.println("result1="+l);
		int h=10*10/5+3-1*4/2;
		//100/5+3-1*4/2;
		//20+3-1*4/2;
		//20+3-4/2
		//20+3-2  
		//23-2
		//21
		int o=13*6/5+3*4-1*4/2-1%2;
		//15+12-2-1
		//27-3
		//24
		System.out.println("result0="+o);
		
		//understanding difference b/w >> and >>> shifts
		int a=-2;
		System.out.println("before="+Integer.toBinaryString(a));
		System.out.println("after -2>>1="+Integer.toBinaryString(a>>1)+"="+(a>>1));
		System.out.println("after -2>>>1="+Integer.toBinaryString(a>>>1)+"="+(a>>>1));
		
	}*/
	
	/*public static void main(String[] args) {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked  
	}*/
	
	public static void main(String[] args) {
		float x=0.0f;
		long i=0l;
		//Cannot switch on a value of type Long. Only convertible int values, strings or enum variables are permitted
		/*switch(i) {
		 
		}*/
	}
	

}





















interface MyInterface{
	
	public default void makeSound() {
		System.out.print("tni tni"); 
	}
	/*
	 * A default method cannot override a method from java.lang.Object :Compiler Error
	 * public default String toString() {
		// TODO Auto-generated method stub
		return "";
	}*/
	
}