package Week2Day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
	
	public static void main(String[] args) {
		
		List<Integer> listOfNumbers = Arrays.asList(45,54,67,83,98,23,44,5,612,45,67,8,90);
		
		int max = listOfNumbers.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println("Maximum numbers : " + max);
		
		int min = listOfNumbers.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println("Minimum numbers : " + min);
	}

}
