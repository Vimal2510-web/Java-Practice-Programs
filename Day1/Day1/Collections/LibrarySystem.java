package Day1.Collections;

import java.util.HashMap;
import java.util.Map;

public class LibrarySystem {
	
	public static void main(String[] args) {
		
		HashMap<String, Boolean> library = new HashMap<>();
		
		library.put("Java Programming", true);
		library.put("Spring boot",true);
		library.put("Microservices",false);
		
		System.out.println("Available books : ");
		
		for(Map.Entry<String, Boolean> book : library.entrySet()) {
			if(book.getValue()) {
				System.out.println(book.getKey());
			}
		}
	}

}
