package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	private final long serialversionID = 1L;
	
	String name ;
	int age;
	Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [ name=" + name + ", age=" + age + "]";
	}
	
}
public class Serialization {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Vimal" , 24);
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))){
			
			out.writeObject(emp);
			System.out.println("Object serialized successfully");
			
		}catch(IOException e) {
			System.out.println("Serialization error : " + e.getMessage());
		}
		
	
	
	try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))){
		
		Employee deserializationemp = (Employee)in.readObject();
		System.out.println("DeSerialized Object : " + deserializationemp);
		
	}catch(IOException | ClassNotFoundException e) {
		System.out.println("DeSerialization Error ..");
	}

}}
