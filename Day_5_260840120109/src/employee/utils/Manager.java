package employee.utils;

public class Manager extends Employee {
	
	protected float hra;

	public Manager(String name, String address, int age, String gender, float salary, float hra) {
		super(name, address, age, gender, salary);
		setHra(hra);
	}

	@Override
	public float calculateSalary() {
		return basicSalary + hra; // Total Salary = Basic Salary + HRA
	}

	public void setHra(float hra) {
		if (hra < 0) {
			throw new IllegalArgumentException("Enter valid HRA amount!");
		}
		this.hra = hra;
	}
	
	public float getHra() {
		return hra;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("HRA: " + hra);
	}
}