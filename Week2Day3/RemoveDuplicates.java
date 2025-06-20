package Week2Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Java","Python","Spring","Cloud","Apigee","Java");
		
		List<String> uniqueString = listOfStrings.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueString);
	}

}
