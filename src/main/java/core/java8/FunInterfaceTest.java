package core.java8;

public class FunInterfaceTest {
	
	public static void main(String[] args) {
		
		MyFuncInterface i=()->System.out.println("my method");
		i.myFunction();
		
		i.myDefaultMethod1();//calling default method
		MyFuncInterface.myStatic1();//calling static method
	}

}
//Functiona Inteface are the interfaces having only one obstract method and  any number of default and static methods.
@FunctionalInterface
interface MyFuncInterface{
	
	void myFunction();
	
	default void myDefaultMethod1() {
		
	}
	default void myDefaultMethod2() {
		
	}
	
	static void myStatic1() {
		
	}
	static void myStatic2() {
		
	}
	
}