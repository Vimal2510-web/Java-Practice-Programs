package OOPS;
// Dynamic employee management system

// Demonstrates encapsulation, inheritance, polymorphism, and abstraction

abstract class Employe{
	
	String name;
	int age;
	
	abstract void showRole();
}

class Developer extends Employe{

	Developer(String name, int age){
		this.name =name;
		this.age=age;
	}
	@Override
	void showRole() {
		
		System.out.println(name + age + " is a developer");
	}	
}

class Manageerr extends Employe{
	
	Manageerr(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void showRole() {
		System.out.println(name + age + " is a manager");
	}
}
public class OOPExample {
	
	public static void main(String[] args) {
		
		Employe dev = new Developer("Alice ", 32);
		Employe man = new Manageerr("Torretto ",40);
		
		dev.showRole();
		man.showRole();
		
	}

}
