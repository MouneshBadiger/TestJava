package core.multithreading;

public class ThreadCreationWays {
	public static void main(String[] args) {
		//1st way extend Thread class and override run method
		Thread t1=new Thread() {
			public void run() {
				System.out.println("--run method--");
			};
		};
		t1.start();
		//2nd way providing runnable implmentation
		Thread t2=new Thread(
				()->{
					System.out.println("--run method--");
				}
				);
		t2.start();
		
	}

}
