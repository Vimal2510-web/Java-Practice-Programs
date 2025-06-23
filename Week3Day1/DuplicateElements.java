package Week3Day1;

import java.util.Arrays;
import java.util.List;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(1,2,3,44,22,4563,3342,233,44,2,4563,6533);
		
		myList.stream().distinct().forEach(noDuplicates -> System.out.println(noDuplicates));
	}

}
