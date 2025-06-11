package Exception;

public class ExcepDemo {
	
	public static void main(String[] args) {
		
		int val1 = 10;
		int res = 3;
		
		try {
			
			res = val1/res;
			System.out.println("The result is : " + res);
			
		}catch(Exception e) {
			System.out.println("The error is : " + e.getMessage());
		}
		
		finally {
			System.out.println("Always executes, clean up codes..");
		}
	}

}
