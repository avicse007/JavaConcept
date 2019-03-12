Threads

Class extends Thread

Class implements Runnable

In both ways you have to define your work in run method.

public void run()

thread1.setPriority(1 to 10) --> Gives hint to scheduler 
to priortize the thread. Its a request that migh not be
fulfilled by scheduler

thread1.join() ==>method make sure that next code is executed once 
				 the thread1 has completed its execution. 
thread1.yield()==> gives a hint to scheduler that thread is ready to yield
					the resource

ExecutorService 
===============
Like a thread pool 

Can create in three ways 

1. Single thread 
ExecutorService service = Executors.newSingleThreadExecutor();

2. Fixed Thread pool
ExecutorService service = Executors.newFixedThreadPool(10);

3.Thread pool with scheduler 
ExecutorService service = Executors.newScheduledThreadPool(10);

4. From a Callable Thread you can get the result of thread execution 
back .However from runnable thread you only get null if its executed 
successfully.

Future future1 = service1.submit((new Task1()));
System.out.println(future1.get());

		Future<String> future4 = service1.submit(new Callable<String>(
				) {

					@Override
					public String call() throws Exception {
						System.out.println("Executing Callable thread");
						return "SUCCESS_RESULT";
					}
		});
		System.out.println("Result from callable "+future4.get());
		
5. Thread wait() : When wait() method is called on a thread then the threads
wait untill notify method is called on this thread.



