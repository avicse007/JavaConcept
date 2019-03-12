package com.avinash.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Lists {

	
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		arrayList.add("Avinash");
		arrayList.add("Avinash");
		arrayList.add("Avinash3");
		arrayList.add("Avinash2");
		arrayList.add("Avinash1");
		System.out.println("Get 0 "+arrayList.get(0));
		System.out.println("remove 0 "+arrayList.remove(0));
		System.out.println("Remove Avinash3 "+arrayList.remove("Avinash3"));
		System.out.println("Remove All "+arrayList.removeAll(linkedList));
		System.out.println("size "+(arrayList.size()));
		System.out.println("Contains "+arrayList.contains("Avinash"));
		Iterator<String> listIterator =  arrayList.iterator();
		List<String> vector = new Vector<String>();
		/*
		 * Collection of Primitive type is not allowed
		 * Only class type is allowed
		List<int> premitivelist = new ArrayList<int>();
		*/
		List<Integer> listNumbers = new LinkedList<Integer>();
		listNumbers.add(101);
		listNumbers.add(201);
		listNumbers.add(301);
		listNumbers.add(401);
		listNumbers.add(1);
		System.out.println(listNumbers.get(1));
		System.out.println("Removed "+listNumbers.remove(Integer.valueOf(101)));
		/* Gives error out of bound 
		listNumbers.remove(101);
		*/
		listNumbers.sort(null);
		System.out.println(listNumbers);
	}
}
