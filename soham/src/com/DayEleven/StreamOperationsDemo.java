package com.DayEleven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationsDemo {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("New Delhi","Mumbai","Pune", "Nashik", "", "","");
		System.out.println(strList);
		
		Stream <String> stream = strList.stream();
		
		long result = StreamOperations.countEmptyString(stream);
		System.out.println(result);
		
		
		List <Integer> numList = Arrays.asList(12,56,78,43,90,21);
		System.out.println(numList);
		
		Stream<Integer> stream1 = numList.stream();
		StreamOperations.showStatistics(stream1);
		
;	} 
}
