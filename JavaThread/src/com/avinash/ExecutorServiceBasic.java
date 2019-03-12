package com.avinash;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class ExecutorServiceBasic {
	
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService service1 = Executors.newSingleThreadExecutor();
		service1.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("New single Thread Executor");
				
			}
		});
		System.out.println("Main");
		
		Runnable r1 =()->System.out.println("Hello frpm thread r1 using lambda");
		Callable<String> r2 =()->{
			System.out.println("Hello frpm thread r1 using lambda"); 
			return "Success by callable";
			};
		service1.execute(r1);
		System.out.println(service1.submit(r2));
		service1.execute((new Task1()));
		service1.execute(new Thread(new Task2()));
		service1.execute(new Thread(new Task3()));
		//service1.shutdown();
		
		//Getting the execution status of the thread
		Future future1 = service1.submit((new Task1()));
		Future future2 =service1.submit(new Thread(new Task2()));
		Future future3 =service1.submit(new Thread(new Task3()));
		System.out.println(future1.get());
		System.out.println(future2.get());
		System.out.println(future3.get());
		
		//Lets use Callable interface instead of Runnable to get the result
		//from thread execution 
		
		Future<String> future4 = service1.submit(new Callable<String>(
				) {

					@Override
					public String call() throws Exception {
						System.out.println("Executing Callable thread");
						return "SUCCESS_RESULT";
					}
		});
		System.out.println("Result from callable "+future4.get());
		
		
		
		service1.shutdown();
	}

}
