package core.multithreading;

/**
 * @author MOUNESHBADIGERBadige
 *Demonstrates that 
 *1.static synchronization locks at Class levels hence all static methods will be locked, 
 *  thats why m1 and m2 execute one after other
 *  (TOTAL EXECUTION TIME:16 SEC)
 *2.if static synchronized used on any methods, non static methods are unaffected.
 *	thats why if static keyword is removed from m2 then both thread execute together
 * (TOTAL EXECUTION TIME:8 SEC)
 */
public class StaticSyncTest {
	
	static synchronized void m1() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--m1---"+Thread.currentThread().getName());
	}
	
	static  synchronized void m2() {//if static keyword is removed from m2 then both thread execute together
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--instance m2 ---"+Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		
		Thread t1=new Thread() {
			public void run() {
				StaticSyncTest.m1();
			};
		};
		
													Thread t2=new Thread() {
														public void run() {
															//StaticSyncTest.m1();
															StaticSyncTest t=new StaticSyncTest();
															t.m2();
														};
													};
		
		t1.start();
		t2.start();
	}

}
