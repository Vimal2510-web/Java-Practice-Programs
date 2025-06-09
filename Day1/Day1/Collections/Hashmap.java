package Day1.Collections;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("bob",null);
		map.put("virat",null);
		
		System.out.println("Bob's age : " + map.get("bob"));
	}

}
