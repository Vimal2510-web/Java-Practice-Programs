package Streams;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
	
	public static void main(String[] args) {
		
		List <Integer> numbers = IntStream.rangeClosed(1,100)
				.boxed()
				.toList();
		
		numbers.parallelStream()
		.filter(n -> n % 2 ==0)
		.forEach(n -> System.out.println("Processing : "+ n));
	}

}
