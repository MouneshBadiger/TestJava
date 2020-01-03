package core.multithreading.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionTest {

	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	
	public void method1() {
		lock.lock();
		try {
			System.out.println("executing method1");
			condition.await();//same as wait
			System.out.println("method1 Resumed");//will resume from here when signeled.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		lock.unlock();
	}
	public void method2() {
		lock.lock();
		System.out.println("executing method2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		condition.signal();
		
		lock.unlock();
	}
	
	
	
	public static void main(String[] args) {
		LockConditionTest resource=new LockConditionTest();
		Runnable r1=()->{
			resource.method1();
		};
		Runnable r2=()->{
			resource.method2();
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}

}
