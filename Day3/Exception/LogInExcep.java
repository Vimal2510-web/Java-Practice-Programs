package Exception;

class LogIn extends Exception{
	
	LogIn(String message){
	super(message);
	}
}
public class LogInExcep {
	
	public static void main(String[] args) {
		
		String upassword = "123678";
		try {
			if(upassword.length()<7) {
				LogIn log = new LogIn("Enter the valid password");
				throw log;
			}else {
				System.out.println("The password is : " + upassword);
			}
		}catch(Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}

}
