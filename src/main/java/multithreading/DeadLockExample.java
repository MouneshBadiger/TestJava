package multithreading;

public class DeadLockExample {
	  
	public static void main(String[] args) {
		final String resource1 = "resource1 mouneh";  
	    final String resource2 = "resource2 badiger";
	    
		Thread t1=new Thread() {
			public void run() {
				
				synchronized(resource1){
					
					System.out.println("executed 1st block from "+Thread.currentThread().getName());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(resource2){
						System.out.println("executed 2st block from "+Thread.currentThread().getName());
					}
				}
				
			}; 
		};
		
		Thread t2=new Thread() {
			public void run() {
				synchronized(resource2){
					System.out.println("executed 1st block from "+Thread.currentThread().getName());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(resource1){
						System.out.println("executed 2st block from "+Thread.currentThread().getName());
					}
				}
				
			}; 
		};
		
		t1.start();//when t1 started at line 12 it get lock on resouce1 and executes 1 block successfully 
					//when moves to 2nd block tries to get lock on resouce2 to execute 2nd block. But since this lock has been taken by other thread it waits 
		
		t2.start();//when t1 started at line 23 it get lock on resouce2 and executes 1 block successfully 
		//when moves to 2nd block tries to get lock on resouce1 to execute 2nd block. But since this lock has been taken by other thread it waits
	
		//The first thread waiting for lock of resounce2 and Second thread waiting for lock of resounce1
		//Since Lock will be release only when thread completes its syncronized block, Both threads are waiting for each other on different locks hence the dead lock
	}
	
}
