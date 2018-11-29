package application.rest.model;

public class Employee {

	private long id;
	private String name;
	private String designation;
	private int salary;
	
	public Employee() {
	}
	
	public Employee(String name, String designation, int salary, long id) {
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.salary = salary;
	}	
	
	public long getId() {
	return id;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	
	
}
