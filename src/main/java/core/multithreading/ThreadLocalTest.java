package core.multithreading;

public class ThreadLocalTest {
	ThreadLocal<String> myThreadLocal=new ThreadLocal<String>() {
		protected String initialValue() {
			return "firstNmae";
		};
	};
	
	public static void main(String[] args) {
		ThreadLocalTest tl=new ThreadLocalTest();
		String name=tl.myThreadLocal.get();
		System.out.println(name);
		tl.myThreadLocal.set("mounesh");
		 name=tl.myThreadLocal.get();
		System.out.println(name);
	}

}
