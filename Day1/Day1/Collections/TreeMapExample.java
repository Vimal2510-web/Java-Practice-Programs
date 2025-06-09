package Day1.Collections;

import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		TreeMap <String,Integer> scoreMap = new TreeMap<String,Integer>();
		
		scoreMap.put("Toretto",99);
		scoreMap.put("Shaun",65);
		scoreMap.put("Hobbs",90);
		scoreMap.put("Shaw",92);
		
		System.out.println("The Sorted list : " + scoreMap);
		
		System.out.println("The first entry : " + scoreMap.firstEntry());
		System.out.println("The Last Entry : " + scoreMap.lastEntry());
	}

}
