package employee.utils;

public class Engineer extends Employee {

	float overTimeAmount;

	public Engineer(String name, String address, int age, String gender, float salary, float OT) {
		super(name, address, age, gender, salary);
		setOtAmount(OT);
	}

	@Override
	public float calculateSalary() {
		return basicSalary + overTimeAmount; // Total Salary = Basic Salary + Overtime
	}

	public void setOtAmount(float otAmount) {
		if (otAmount < 0) {
			throw new IllegalArgumentException("Enter valid Overtime amount!");
		}
		this.overTimeAmount = otAmount;
	}
	
	public float getOtAmount() {
		return overTimeAmount;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Overtime Amount: " + overTimeAmount);
	}
}