package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
	
	public static void main(String[] args) {
		
		 String fileName = "data.txt";
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
			
			writer.write("Hello, Java file handling");
			
			System.out.println("File written successfully");
		}
		
		catch(IOException e) {
			
			System.out.println("Error occured : " + e.getMessage());
		}
		
		try(BufferedReader reader = new BufferedReader( new FileReader(fileName))){
			
			System.out.println("File content : " + reader.readLine());
		}
		catch(IOException e) {
			System.out.println("Can't read file : " + e.getMessage());
		}
	}

}
