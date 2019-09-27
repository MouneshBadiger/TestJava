package core.inheritance;
interface MyInterface{
	 void method1();
	void method2();
	void method3();
}

abstract class MyClass implements MyInterface{
	
	@Override
	public void method1() {
		System.out.println("abstract class implementation");
	}
	
}
public class InterfaceTest extends MyClass implements MyInterface{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	
}
