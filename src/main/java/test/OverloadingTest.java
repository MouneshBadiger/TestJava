package test;

public class OverloadingTest {
	final String ss;
	static final String sss;
	static {
		sss = "";
	}

	public OverloadingTest() {
		ss = "mounesh";
	}

	public static void main(String[] args) {
		//add(1l, 1);
		OverloadingTest a = new OverloadingTest();
		a.method(10);
		a.method1(null);
	}

	void method(Integer i) {
		System.out.println("-- A Integer--");
	}

	/*
	 * void method(int i) { System.out.println("-- A int--"); }
	 */

	static void add(int a, long b) {
		System.out.println("method1");
	}

	static void add(long a, int b) {
		System.out.println("method2");
	}

	static void add(long a, long b) {
		System.out.println("method3");
	}
	 void method1(String s) {
		System.out.println("String method called");
	}
	 void method1(Object s) {
		System.out.println("Object method called");
	}
	

}
interface MyI{
  int kk=0;
	
}