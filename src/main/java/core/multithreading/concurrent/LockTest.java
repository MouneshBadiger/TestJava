package core.multithreading.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	
	
	public static void main(String[] args) {
		ReentrantLock lock=new ReentrantLock();
		
		new Thread(
				()->{
					lock.lock();
					System.out.println(Thread.currentThread().getName());
					try {
						if(new String().contains(Character.toString('J'))) {
							
						}
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					lock.unlock();
				}
				).start();
		
		new Thread(
				()->{
					lock.lock();
					System.out.println(Thread.currentThread().getName());
				}
				).start();
		
	}

}
//disadvantage:
//lock has to be released manually in finally block
//if developer forget prone to error
//code become more unreadable