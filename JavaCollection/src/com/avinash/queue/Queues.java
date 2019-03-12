package com.avinash.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthCompatator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o2.length(), o1.length());
		
	}
	
}

public class Queues {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> name = new PriorityQueue<String>();
		Queue<String> name1 = new LinkedList<String>();
		Queue<String> name2 = new PriorityQueue<String>(new StringLengthCompatator());
		name.add("Avinash");
		name.add("Suraj");
		name.add("Bikash");
		name.add("Susmita");
		name.add("Avinash");
		System.out.println("Name "+name);
		System.out.println("Peek "+name.peek());
		System.out.println("Name after peek "+name);
		System.out.println("poll "+name.poll());
		System.out.println("Name after poll "+name);
		System.out.println("Remove "+name.remove("Avinash"));
		System.out.println("Name after remove "+name);
		name1.add("Avinash");
		name1.add("Suraj");
		name1.add("Bikash");
		name1.add("Susmita");
		name1.add("Avinash");
		name1.add(null);
		System.out.println("Name1 "+name1);
		name2.add("Avinash");
		name2.add("Suraj");
		name2.add("Bikash");
		name2.add("Susmita");
		name2.add("to");
		name2.add("none");
		System.out.println("Name2 with comparator "+name2);
	}

}
