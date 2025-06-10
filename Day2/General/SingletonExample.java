package General;

class DatabaseConnection{
	
	private static DatabaseConnection instance;
	
	private DatabaseConnection() {
		System.out.println("Establishing the connection ");
	}
	
	public static DatabaseConnection getInstance() {
		if(instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
	
}

public class SingletonExample {
	
	public static void main(String[] args) {
		
		DatabaseConnection db1 = DatabaseConnection.getInstance();
		DatabaseConnection db2 = DatabaseConnection.getInstance();
		
		System.out.println("Are both instances are same ? : " + (db1 == db2));
	}
	

}
