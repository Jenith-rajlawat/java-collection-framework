package java_streams_api;

public class Employee {

	private String firstName;
	private String designation;
	private int age;
	public Employee(String firstName, String designation, int age) {
		super();
		this.firstName = firstName;
		this.designation = designation;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "\nEmployee [firstName=" + firstName + ", designation=" + designation + ", age=" + age + "]\n";
	}
	
}
