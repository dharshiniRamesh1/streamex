package com.model;

import java.util.*;

public class LambaExample {
	public static void main(String[] args) {
		List<String> li=Arrays.asList("karur", "Chennai", "Mumbai", "dharmapuri");
		//old way
		for(String s: li) {System.out.println(s);}
		//new way
		li.forEach(s -> System.out.println(s));
		//new way 2
		li.forEach(System.out::println);
		//using filter to get the place name start with C
		li.stream()
		.filter(s -> s.startsWith("C"))
		
		.forEach(System.out::println);
	}

}
