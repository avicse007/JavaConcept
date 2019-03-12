package com.avinash.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		Map<String,Integer> name = new HashMap<String,Integer>();
		Map<String,Integer> name1 = new TreeMap<String,Integer>();
		Map<String,Integer> name2 = new Hashtable<String,Integer>();
		Map<String,Integer> name3 = new LinkedHashMap<String,Integer>();
		name.put("Avinash",101);
		name.put("Bikash",102);
		name.put("Suraj",103);
		name.put("Susmita",104);
		name.put("Avinash1",105);
		
		name1.put("Avinash",101);
		name1.put("Bikash",102);
		name1.put("Suraj",103);
		name1.put("Susmita",104);
		name1.put("Avinash1",105);
		
		name2.put("Avinash",101);
		name2.put("Bikash",102);
		name2.put("Suraj",103);
		name2.put("Susmita",104);
		name2.put("Avinash1",105);
		
		name3.put("Avinash",101);
		name3.put("Bikash",102);
		name3.put("Suraj",103);
		name3.put("Susmita",104);
		name3.put("Avinash1",105);
		Set<String> keys= name.keySet();
		Collection<Integer> values = name.values();
		System.out.println("Keys "+keys);
		System.out.println("values "+values);
		System.out.println("HashMap as name "+name);
		System.out.println("TreeMAp as name1 "+name1);
		System.out.println("HashTable as name2 "+name2);
		System.out.println("LinkedHashMap as name3 "+name3);

	}

}
