package Day1.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
//	public static void main(String[] args) {
//		
//		LinkedHashSet <String> tasks = new LinkedHashSet<String>();
//		
//		// maintains insertion order..
//		
//		tasks.add("Wake Up");
//		tasks.add("Brush teeth");
//		tasks.add("Drink coffee");
//		tasks.add("Start work");
//		
//		System.out.println("Tasks to do : " + tasks);
//		
//		System.out.println("Is tasks contains 'Drink coffee' : " + tasks.contains("Drink coffee"));
//	}
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> tasks = new LinkedHashSet	<String>();
		
		tasks.add("Java Collections");
		tasks.add("How to use LinkedHashSet");
		tasks.add("Best coding practices");
		tasks.add("Java Collections");
		
		// Duplicates will not be added .
		
		System.out.println("Recent searches : " + tasks);
	}

}


