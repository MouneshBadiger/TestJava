package core.multithreading.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;

public class CallableAndFutureTest {

	public static void main(String[] args) throws InterruptedException {
		Callable task=()->{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "completed";
		};
		
		
		Semaphore semaphore=new Semaphore(3);
		ExecutorService exS=Executors.newFixedThreadPool(50);
		List<Future> fList=new ArrayList<Future>();
		for(int i=0;i<100;i++) {
			Future future=exS.submit(task);
			fList.add(future);
			System.out.println(future.isDone());
		}
		Thread.sleep(2000);
		fList.forEach(p->{
			try {
				System.out.println("main-"+p.isDone()+"-"+p.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
	}

}
