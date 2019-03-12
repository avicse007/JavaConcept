package com.avinash;

public class ThreadSynchronization {

	
	public static void main(String[] args) {
		ThreadSynchronization obj = new ThreadSynchronization();
		Thread t1 = new Thread(obj.r);
		Thread t2 = new Thread(obj.r);
		t1.start();
		t2.start();
	}

	private void counterBlast() {
		for(int i=10;i>0;i--)
			System.out.println("-----"+i);
		System.out.println("----Blast");
	}
	
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			synchronized (r) {
				counterBlast();
			}
			
		}


	};
}