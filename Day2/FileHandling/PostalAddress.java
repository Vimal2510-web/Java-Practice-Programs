package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PostalAddress {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your House number : ");
		String hno = sc.next();
		
		System.out.println("Enter your area : ");
		String area = sc.next();
		
		System.out.println("Enter your city : ");
		String city = sc.next();
		
		System.out.println("Enter your pincode : ");
		int pincode = sc.nextInt();		
		
		System.out.println("Enter your state : ");
		String state = sc.next();
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\2329038\\Downloads\\JavaPractice (1)\\JavaPractice\\src\\main\\resources\\PostalAddress");
			fw.write("Name : " + name + "\n");
			fw.write("House number : " + hno + "\n");
			fw.write("Area : " +area +"\n");
			fw.write("city" + city + "\n");
			fw.write("Pincode : " + pincode + "\n" );
			fw.write("State : " + state + "\n");
			fw.close();
		}catch (FileNotFoundException e){
			
			System.out.println("File not found : " + e);
		}
		
		System.out.println("Your deatils are : "+"\n"+ name +"\n"+ hno +"\n" + area +"\n" + city +"\n" + pincode +"\n"+ state );
	}

}
