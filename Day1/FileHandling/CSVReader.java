package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\2329038\\Downloads\\JavaPractice (1)\\JavaPractice\\src\\main\\resources\\Car.java";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			
			String line;
			
			while((line = reader.readLine())!= null) {
				
				System.out.println("Data : " + line);
			}
		}
			catch(IOException e) {
				System.out.println("Error in file reading : " + e);
			}
		}
}


