package test;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MThreadingTest {
	
	public static void main(String[] args) {
		ExecutorService exService=Executors.newFixedThreadPool(5);
		 Runnable worker =()->{
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName()+" TIme:"+new Date());
			 
		 };
		 
		 	for (int i = 0; i < 10; i++) {  
		 		exService.execute(worker);//calling execute method of ExecutorService  
	        }  
		 	exService.shutdown();  
	        while (!exService.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");
	}

}
