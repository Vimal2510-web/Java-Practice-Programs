package Exception;

public class FinalTask {
	
	final int MAX_VALUE = 231;
	final float a = 3.14f;
	final double b = 23.34;
	final char c = 'A';
	
	public final void display() {
		System.out.println("This is final method..");
	}
	
	public static void main(String[] args) {
		
		FinalTask ob = new FinalTask();
		
		System.out.println("The max value : " + ob.MAX_VALUE);
		System.out.println("The float value : " + ob.a);
		System.out.println("The double value : "+ ob.b);
		System.out.println("The char : " + ob.c);
		
		// Trying to change the final value
		
		// ob.MAX_VALUE =200;  // gives compile error
		
		ob.display();
	}

}

