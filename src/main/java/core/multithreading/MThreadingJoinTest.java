package core.multithreading;

public class MThreadingJoinTest {
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1=()->{
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" :"+i);
			}
		};
		
		
		Thread t1=new Thread(r1);
		t1.start();
		t1.join();//Join method says that any thread started after this join method has been called, will join this thread ie waits for this thread to be completed.
		
		Thread t2=new Thread(r1);
		t2.start();
		t2.join();
		
		Thread t3=new Thread(r1);
		t3.start();
		
		
	}
}
