package core.multithreading;

public class InterThreadCommunication {
	
	
	
	public static void main(String[] args) {
		Customer c=new Customer();
			//withdraw thread
			Runnable r1=new Runnable() {
				@Override
				public void run() {
					try {
						c.withdraw(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			};
			//deposit thread
			Runnable r2=new Runnable() {
				@Override
				public void run() {
					c.deposit(1000);
					
				}
			};
			
			Thread t1=new Thread(r1);
			Thread t2=new Thread(r2);
			t1.start();
			t2.start();
			
			
		
	}

}

class Customer{
	private int balanceAmount=1000;
	
	synchronized void withdraw(int amount) throws InterruptedException {
		if(balanceAmount>=amount) {
			balanceAmount-=amount;
		}else {
			System.out.println("Insuffient Balance going to wait from:"+Thread.currentThread().getName());
			this.wait();
			//If you call wait and notify without syncronization it will throw RuntimeException java.lang.IllegalMonitorStateException
			//Thrown to indicate that a thread has attempted to wait on an object's monitor or to notify other threads waiting on an object's monitor without owning the specified monitor.
			System.out.println("got notification continuing withdraw");
			if(balanceAmount>=amount) {
				balanceAmount-=amount;
			}
			System.out.println("new balance="+balanceAmount);
		}
	}
	synchronized void deposit(int amount) {
		balanceAmount+=amount;
		try {
			System.out.println("Depositing money from "+Thread.currentThread().getName());
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//notify();
		this.notifyAll();// this will wakes up all the threads that are waiting for this object lock
	}
	
}