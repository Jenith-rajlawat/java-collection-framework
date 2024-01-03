package java_streams_api;

import java.util.Arrays;
import java.util.List;

public class EmployeeManagementSystem {

	//Filtering Employees:
	//Suppose you have a list of employees and 
	//you want to filter out only the employees who are developers.
	
	public static void main(String... args) {
		
		// used to convert an array into a List. Arrays.asList(pass an array here)
		List<Employee> employees =Arrays.asList(
				new Employee("Jenith","Developer",23),
				new Employee("Alice","Manager",35),
				new Employee("Bob","Developer",30),
				new Employee("Eve","Analyst",25)
				);
	
		System.out.println(employees);
		
		//Using streams to filer developers
		List<Employee> developers =employees.stream().filter(employee->"Developer".equals(employee.getDesignation())).toList();
		
		System.out.println("Developers: "+developers);
		
		
		
		
		//Mapping Employee Names:
		//You might need a list of employee names from the filtered developers.
		
		List<String> developerNames= developers.stream().map(Employee::getFirstName).toList();
		
		System.out.println("Developer Names: "+developerNames);
		
		
		
		//Sorting Employees by Age:
		//Now, let's sort the developers by their age.
	}
	
	
	
	
}
