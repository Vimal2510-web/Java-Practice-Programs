package Week2Day3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

// Seperating Odd and Even numbers in a given list of numbers

public class OddEvenNumbers {
	
	public static void main(String[] args) {
	
	List<Integer> listOfIntegers = Arrays.asList(41,33,24,54,65,78,23,45,65,88,90,200,13,44);
	
	Map<Boolean, List<Integer>> oddEvenNumbersMap = listOfIntegers.stream()
			.collect(Collectors.partitioningBy(i -> i%2 ==0));
	
	Set<Entry<Boolean,List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
	
	for(Entry<Boolean,List<Integer>> entry : entrySet) {
		
		if(entry.getKey()) {
			
			System.out.println("Even Numbers");
		}else {
			System.out.println("Odd Numbers");
		}
		
		List<Integer> list = entry.getValue();
		
		for(int i : list) {
			System.out.println(i);
		}
	}
	
	}

}
