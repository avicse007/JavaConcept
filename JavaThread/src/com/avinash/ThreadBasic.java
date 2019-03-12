package com.avinash;

class Task1 extends Thread{
	public void run() {
		System.out.println("Task 1 Started");
		for(int i=100;i<150;i++)
			System.out.print(i);
		System.out.println("\nTask 1 Completed");
	}
}
	
	class Task2 implements Runnable{

		@Override
		public void run() {
			System.out.println("Task2 started");
			for(int i=200;i<250;i++)
				System.out.print(i);
			System.out.println("\nTask2 completed");	
		}
	}
	
	class Task3 implements Runnable{
		@Override
		public void run() {
			System.out.println("Task3 started");
			for(int i=300;i<350;i++)
				System.out.print(i);
			System.out.println("\nTask3 completed");	
		}
		
	}

public class ThreadBasic {
	
	public static void main(String[] args) throws InterruptedException {
		
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();
		Thread task2Thread = new Thread(task2);
		Thread task3Thread = new Thread(task3);
		task1.setPriority(10);
		task2Thread.setPriority(5);
		task3Thread.setPriority(1);
		task1.start();
		task1.join();
		task2Thread.start();
		task2Thread.join();
		task3Thread.start();
	}

}
