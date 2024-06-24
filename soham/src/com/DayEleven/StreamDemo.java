package com.DayEleven;

import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream <Integer> stream  = Stream.of(10,20,30,40,50,60,70);
		Function<Integer,Integer> sqre =(n)->n*n;
		stream.map(sqre).forEach(System.out::println);
		
		Stream <String> stream1 = Stream.of("Esha","Soham");
		Function<String,String> join =(name) -> name + name;
		stream1.map(join).forEach(System.out::println);
	}
}
