package OOPS;

// Employee management System (Inheritence)

class Employee{
	
	String name;
	int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void showDetails() {
		
		System.out.println("Name : "+ name + "Age : " + age);
	}
}

class Manager extends Employee{
	
	String department;
	
	public Manager (String name, int age, String department) {
		super(name,age);
		this.department=department;
	}
	
	void showManagerDetails(){
		showDetails();
		System.out.println("Department :" + department);
	}
}
public class Company{
	
	public static void main(String[] args) {
		
		Manager mgr = new Manager("Ally", 34,"Oracle" );
		
		mgr.showManagerDetails();
	}
	
	
}