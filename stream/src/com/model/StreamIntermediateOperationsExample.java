package com.model;

import java.util.*;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {
	public static void main(String[]args) {
		//List of list of names
		List<List<String>>listOfLists = Arrays.asList(
				Arrays.asList("Refelect" ,"Collection", "Stream"),
				Arrays.asList("Structure", "State", "Flow"),
				Arrays.asList("Sorting", "Mapping", "Reducing", "Stream")
				);
		//Create a set to hold intermediate results
		Set<String> intermediateResults = new HashSet<>();
		
		//Stream pipleline demostrating various intermediate operations
		List<String> result= listOfLists.stream()
				.flatMap(List::stream)                   //flatten the list of lists into a single stream
				.filter(s -> s.startsWith("S"))          //Filter elements starting with "S"
				.map(String::toUpperCase)                //transform each element to uppercase
				.distinct()                              //Remove duplicate elements
				.sorted()                                //Sort elements
				.peek(s -> intermediateResults.add(s))   //Perform an action(add to set)on each element
				.collect(Collectors.toList());           //Collect the final result into a list 
		         
		//Print the intermediate results
		System.out.println("Intermediate Result:");
		intermediateResults.forEach(System.out::println);
		
		//Print the find result
		System.out.println("Final Result:");
		result.forEach(System.out::println);
		
		
		
	}

}
