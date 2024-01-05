package java_streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {

	//Filtering Employees:
	//Suppose you have a list of employees and 
	//you want to filter out only the employees who are developers.
	
	public static void main(String... args) {
		
		// used to convert an array into a List. Arrays.asList(pass an array here)
		List<Employee> employees =Arrays.asList(
				new Employee("Jenith","Developer",60),
				new Employee("Alice","Manager",35),
				new Employee("Bob","Developer",30),
				new Employee("Eve","Analyst",25)
				);
		//made a list of object employee with name, designation and age and gave an array of object and converted to a list using Arrays.asList(array)
	
		System.out.println(employees);
		
		//Using streams to filer developers
		List<Employee> developers =employees.stream().filter(employee->"Developer".equals(employee.getDesignation())).toList();
		//The filter operation is used to exclude elements from the stream based on a specified condition.
		System.out.println("Developers: "+developers);
		
		
		
		
		//Mapping Employee Names:
		//You might need a list of employee names from the filtered developers.
		
		List<String> developerNames= developers.stream().map(Employee::getFirstName).toList();
		//The map operation is used to transform each element of the stream using a provided function.
		
		//The :: symbol in Java is known as the method 
		//reference operator. It's a shorthand notation
		//for lambda expressions, specifically for referring 
		//to methods or constructors. The :: operator is used to
		//call a method by referring to it with the help of its class 
		//directly. It's a way to make your code more concise.
		System.out.println("Developer Names: "+developerNames);
		
		
		
		//Sorting Employees by Age:
		//Now, let's sort the developers by their age.
		List<Employee> sortedDevelopers =developers.stream().sorted((e1,e2)->Integer.compare(e1.getAge(), e2.getAge())).toList();
	
		//displaying the sorted list of developers
		System.out.println("Sorted Developers: "+ sortedDevelopers);
		
		
		
		//Calculating Average Age
		double averageAge= developers.stream().mapToInt(Employee::getAge).average().orElse(0);
		System.out.println("Average Age of Developers: "+averageAge);
		
		
		
		
		//------------------------------------------------------------------
		//CHAINING OPERATIONS
		//--------------------------------------------------------------------
		List<String> result =employees.stream().filter(e->e.getAge()>55).map(Employee::getFirstName).toList();
		System.out.println("Result: "+result);
		
		
		//------------------------------------------------------------------
		//Grouping and Collecting
		//-------------------------------------------------------------------
		Map<String,List<Employee>> employeesByRole =employees.stream().collect(Collectors.groupingBy(Employee::getDesignation));
		System.out.println("Employees by role: " +employeesByRole);
	}
	
	
	
	
}
