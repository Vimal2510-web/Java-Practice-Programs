package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class Employee {
	
	String name;
	int age;
	double salary;
	public Employee(String string, int i, int j) {
		
	}
 }
public class EmployeeManagement {
	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("John",24,32000),
				new Employee("Kamal",27,40000),
				new Employee("Kumar",23,26500),
				new Employee("Rajesh",25,29000)); 
		
		
		List<Employee> filteredEmployees = employees.stream()
				.filter(emp -> emp.salary > 30000)
				.collect(Collectors.toList());
		
		System.out.println(filteredEmployees);
		
		
	}
}
 
