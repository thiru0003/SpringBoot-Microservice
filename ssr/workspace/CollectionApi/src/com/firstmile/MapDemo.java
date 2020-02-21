package com.firstmile;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {


	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "red");
		hashMap.put(2, "blue");
		
		hashMap.putIfAbsent(6, "kanna");
		hashMap.put(3, "orange");
		hashMap.put(4, "yellow");
		hashMap.put(5, "green");
		hashMap.put(6, "lalitha");
		System.out.println("foreach java8");
		hashMap.forEach((k,v) -> System.out.println());
		System.out.println(hashMap);
		
		/*
		 * Set<Map.Entry<Integer,String>> set = hashMap.entrySet();
		 * System.out.println(set); Set<Integer> keySet = hashMap.keySet();
		 * System.out.println(keySet); Collection<String> values = hashMap.values();
		 * System.out.println(values);
		 */
		
		hashMap.forEach((k,v) -> System.out.println(k +"  "+v));
		
		/*Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey()+"=="+next.getValue());
					*/
			
		hashMap.entrySet().forEach((k) -> System.out.println(k.getKey()+" "+k.getValue()));
		}
	}
	


