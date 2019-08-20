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

}
interface MyI{
  int kk=0;
	
}