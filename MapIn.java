package com.vikki.pgm;


import java.util.*;
public class MapIn {
	
	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(100, "Aravind");
	map.put(101, "Raja");
	map.put(102,"Praveen");
	map.put(103, "Kavin");
	
	map.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
	.forEach(System.out::println);
	}

}
