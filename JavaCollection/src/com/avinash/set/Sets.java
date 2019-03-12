package com.avinash.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		Set<String> name = new HashSet<String>();
		TreeSet<String> name1 = new TreeSet<String>();
		Set<String> name2 = new LinkedHashSet<String>();
		name.add("Avinash");
		name.add("Suraj");
		name.add("Bikash");
		name.add("Susmita");
		name.add("Avinash");
		name.add(null);
		System.out.println(name);
		name1.add("Avinash");
		name1.add("Suraj");
		name1.add("Bikash");
		name1.add("Susmita");
		name1.add("Avinash");
		System.out.println("Floor "+name1.floor("B"));
		System.out.println("Ceiling "+name1.ceiling("S"));
		System.out.println("Higher "+name1.higher("Suraj"));
		System.out.println("Lower "+name1.lower("Suraj"));
		System.out.println("Subset "+name1.subSet("Avinash", "Suraj"));
		System.out.println("HeadSet "+name1.headSet("Suraj"));
		System.out.println("TailSet "+name1.tailSet("Avinash"));
		System.out.println(name1);
		// error null is not allowed 
		//name1.add(null);
		
		Iterator<String> itName = name.iterator();
		while(itName.hasNext()) {
			System.out.println(itName.next());
		}
		
		name2.add("Avinash");
		name2.add("Suraj");
		name2.add("Bikash");
		name2.add("Susmita");
		name2.add("Avinash"); 
		name2.add(null);
		System.out.println(name2);
	}
}
