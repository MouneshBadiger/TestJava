package core.multithreading;

import java.util.concurrent.*;

/**
 * @author MOUNESHBADIGERBadige
 *CountDownLatch is like join method which helps while using ThreadPools
 */
public class CountDownLatchTest {
	static CountDownLatch latch=new CountDownLatch(3);
	public static void main(String[] args) {
		
		
		ExecutorService exService=Executors.newFixedThreadPool(1);
		
		exService.submit(CountDownLatchTest::task);
		exService.submit(CountDownLatchTest::task);
		exService.submit(CountDownLatchTest::task);
		exService.submit(CountDownLatchTest::task);
		exService.submit(CountDownLatchTest::task);
		exService.submit(CountDownLatchTest::task);
		exService.submit(CountDownLatchTest::task);
		exService.submit(CountDownLatchTest::task);
		
		
		
		try {
			latch.await();
			System.out.println("completed:3 threads");
			System.out.println("--main thread--");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void task() {
		System.out.print("executing-"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println("  latch count-"+latch.getCount());
	}

}
