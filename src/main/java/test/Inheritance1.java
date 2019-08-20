package test;

public class Inheritance1 {
	
	public static void main(String[] args) {
		A a=new B();
		a.method(10);
		
		B b=new B();
		b.method(10);
		//Compiler always checks for the presense of method based on the Parent type reference being used, even though its overrided later
		//it alays checks for type int first, if not found then looks for Wrapper Class Integer
		//Note: methods are not overrided with parameter type int and Integer.
	}

}
class A{
	void method(Integer i) {
		System.out.println("-- A Integer--");
	}
	
}

class B extends A{
	
	void method(int i) {
		System.out.println("-- B int--");
	}
}