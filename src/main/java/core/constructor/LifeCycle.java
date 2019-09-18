package core.constructor;

public class LifeCycle {
	
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
	
	
	public LifeCycle() {
		System.out.println("--no arg constructor--");
	}
	
	public LifeCycle(int instanceV) {
		System.out.println("--parameter constructor--");
		this.instantVar=instanceV;
	}
	
	public static void main(String[] args) {
		LifeCycle bo=new LifeCycle();
		bo=null;
		System.gc();
		System.out.println("--exiting--");
		System.exit(1);//Exits JVM
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("---finalie method=------");
	}

}
