package Java8Features;

// Sort,filter and process data using Stream API

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice","Charles","Chris","Steave","Virat","Bryan");
		
		// Filtering the name starts with "C"
		
		List<String> filteredNames = names.stream()
				.filter(name -> name.startsWith("C"))
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Filtered Names : "+ filteredNames);
	}

}
