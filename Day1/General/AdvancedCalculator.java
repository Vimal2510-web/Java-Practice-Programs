package General;

import java.util.Scanner;

public class AdvancedCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println(" Choose one operation : +,-,*,/,sin,cos,tan");
		
		String operation = scanner.next();
		
		System.out.println("Enter the first number : ");
		
		double num1 = scanner.nextDouble();
		
		double num2 =0;
		
		if(!operation.equals("sin") && !operation.equals("cos") && !operation.equals("tan")) {
			
			System.out.println("Enter the second number : ");
			num2 = scanner.nextDouble();
		}
		
		double result = switch(operation) {
		
		case "+" -> num1 + num2;
		case "-" -> num1-num2;
		case "*" -> num1 * num2;
		case "/" -> num1/num2;
		case "sin" -> Math.sin(Math.toRadians(num1));
		case "cos" -> Math.cos(Math.toRadians(num1));
		case "tan" -> Math.tan(Math.toRadians(num1));
		
		default -> Double.NaN;  // NaN --> Not a number
		};
		
		System.out.println("Result : " + result);
		scanner.close();
	}

}
