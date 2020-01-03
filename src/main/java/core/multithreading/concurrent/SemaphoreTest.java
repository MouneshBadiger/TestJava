package core.multithreading.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	
	public static void main(String[] args) throws InterruptedException {
		Semaphore semaphore=new Semaphore(3);//only 3 threads are allowed to run simultaneously 
		Callable task=()->{
			semaphore.acquire();
		
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			semaphore.release();
			return "completed";
			
		};
		
		
		
		ExecutorService exS=Executors.newFixedThreadPool(50);
		for(int i=0;i<100;i++) {
			Future future=exS.submit(task);
		}
		
		
		
	}	

}
