package test;

public class MThreadingJoinTest {
	
	
	
	
	
	public static void main(String[] args) {
		
		Runnable r1=()->{
			for(int i=0;i<1000000;i++) {
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
		
		Thread t2=new Thread(r1);
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t3=new Thread(r1);
		t3.start();
		
		
	}
}
