package com.DayEleven;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class StreamOperations {
	
	public static long countEmptyString(Stream<String> stream) {
		long count= 0;
		count = stream.filter(x->x.isEmpty()).count();
		return count;
		
	}
	
	public static void showStatistics(Stream<Integer> stream) {
		IntSummaryStatistics stats = stream.mapToInt((x)->x).summaryStatistics();
		System.out.println("Maximum: "+ stats.getMax()); 
		System.out.println("Minimum: "+ stats.getMin()); 
		System.out.println("SUM: "+ stats.getSum()); 
		System.out.println("Average: "+ stats.getAverage()); 
		System.out.println("Count: "+ stats.getCount()); 
	}
	
}
