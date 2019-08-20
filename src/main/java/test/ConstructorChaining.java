package test;

public class ConstructorChaining {
	
	int instantVar=10;
	
	{
		System.out.println("--instance block 2-- instantVar="+instantVar);
	}
	{
		System.out.println("--instance block 1-- instantVar="+instantVar);
	}
	
	static{
		System.out.println("--static block 2-- ");
	}
	static {
		System.out.println("--static block 1--");
	}
	
	public void instanceMethod() {
		System.out.println("--instance method-- instantVar="+instantVar);
	}
	public static void staticMethod() {
		System.out.println("--static method--");
	}
	
	
	public ConstructorChaining() {
		System.out.println("--no arg constructor--");
	}
	
	public ConstructorChaining(int instanceV) {
		System.out.println("--parameter constructor--");
		this.instantVar=instanceV;
	}
	
	public static void main(String[] args) {
		ConstructorChaining bo=new ConstructorChaining();
	}

}
