package employee.utils;


public class Salesman extends Employee {

	float commision;

	public Salesman(String name, String address, int age, String gender, float salary, float comm) {
		super(name, address, age, gender, salary);
		setCommision(comm);
	}

	@Override
	public float calculateSalary() {
		return basicSalary + commision; // Total Salary = Basic Salary + Commission
	}

	public void setCommision(float comm) {
		if (comm < 0) {
			throw new IllegalArgumentException("Enter valid commission amount!");
		}
		this.commision = comm;
	}
	
	public float getCommision() {
		return commision;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Commission: " + commision);
	}
}

