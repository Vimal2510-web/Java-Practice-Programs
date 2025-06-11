package Exception;

import java.util.Scanner;

class ExMarks extends Exception{
	ExMarks (String strEx){
		super(strEx);
	}
}
public class MyMarks {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mark : ");
		int marks =scanner.nextInt();
		
		try {
			if(marks > 100) {
				ExMarks em = new ExMarks("Marks shouls not be greater than 100");
				throw em;
			}
			else {
				System.out.println("Mark : " + marks);
			}
			}
		
			catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
			}
		}
}
