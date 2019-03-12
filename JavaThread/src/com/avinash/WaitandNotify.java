package com.avinash;


class Calculator extends Thread{
	long sum ;
	
	public void run() {
		synchronized (this) {
			for(int i =0 ;i<100000;i++) {
				sum+=i;
			}
			notify();
		}
	}	
}

public class WaitandNotify extends Thread{	
	public static void main(String[] args) {
		Calculator thread = new Calculator();
		thread.start();
		synchronized (thread) {
			try {
				thread.wait();
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(thread.sum);
	}

}
