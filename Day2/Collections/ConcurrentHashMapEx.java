package Collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, Integer> userScores= new ConcurrentHashMap<>();
		
		userScores.put("Alice",90);
		userScores.put("Charlie",70);
		userScores.put("Daniel",75);
		
		userScores.computeIfPresent("Alice",(key,value)-> value + 10);
		userScores.computeIfAbsent("Xavier",key -> 80);
		
		System.out.println("User Scores : " + userScores);
	}

}
