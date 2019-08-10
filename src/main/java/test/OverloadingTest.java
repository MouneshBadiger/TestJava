package test;

public class OverloadingTest {
 final String ss;
 static final String sss;
 static {sss="";}
 
	public static void main(String[] args) {
		add(1l,1);
	}
	public OverloadingTest() {
		ss="mounesh";
	}
	
	static void add(int a,long b) {
		System.out.println("method1");
	}
	static void add(long a,int b) {
		System.out.println("method2");
	}
	static void add(long a,long b) {
		System.out.println("method3");
	}
}
interface MyI{
  int kk=0;
	
}