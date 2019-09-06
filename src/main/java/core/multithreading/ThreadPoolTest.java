package core.multithreading;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	
	public static void main(String[] args) {
		
		 Runnable worker =()->{
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName()+" TIme:"+new Date());
			 
		 };
		 	ExecutorService exService=Executors.newFixedThreadPool(5);
		 	for (int i = 0; i < 10; i++) {  //10 jobs using 5 threads
		 		exService.execute(worker);//calling execute method of ExecutorService  
	        }  
		 	exService.shutdown();  
	        while (!exService.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");
	}

}
