package employee.utils;

import java.io.Serializable;

public abstract class Employee implements Serializable {

	protected String name;
	protected String address;
	protected int age;
	protected String gender;
	protected float basicSalary;
	
	Employee(String name, String address, int age, String gender, float salary) {
		setName(name);
		setAddress(address);
		setAge(age);
		setGender(gender);
		setSalary(salary);
	}
	
	// Abstract method to be overridden in child classes
	public abstract float calculateSalary();

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Total Calculated Salary: " + calculateSalary());
	}

	// Setter functions
	public void setName(String name) {
		if (name == null || name.trim().length() < 4) {
			throw new IllegalArgumentException("Invalid name! Name must be at least 4 characters long.");
		}
		this.name = name;
	}

	public void setAddress(String address) {
		if (address == null || address.trim().length() < 5) {
			throw new IllegalArgumentException("Invalid address! Full address must be at least 5 characters long.");
		}
		this.address = address;
	}

	public void setAge(int age) {
		if (age < 17 || age > 61) {
			throw new IllegalArgumentException("Invalid age! Age must be between 17 and 61.");
		}
		this.age = age;
	}

	public void setGender(String gender) {
		if (gender == null || (!gender.equalsIgnoreCase("MALE") && 
		                       !gender.equalsIgnoreCase("FEMALE") && 
		                       !gender.equalsIgnoreCase("TRANSGENDER"))) {
			throw new IllegalArgumentException("Invalid gender! Valid options: Male, Female, Transgender.");
		}
		this.gender = gender;
	}

	public void setSalary(float basicSalary) {
		if (basicSalary < 0.0f) {
			throw new IllegalArgumentException("Invalid salary! Salary cannot be negative.");
		}
		this.basicSalary = basicSalary;
	}

	// Getter functions
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public float getSalary() {
		return basicSalary;
	}
}