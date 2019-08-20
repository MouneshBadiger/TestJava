package test;

public class ConstructorRecursion {
	
	ConstructorRecursion test=new ConstructorRecursion();
	
	public static void main(String[] args) {
		ConstructorRecursion test=new ConstructorRecursion();
		System.out.println("-constructor chaining--");
	}

}
