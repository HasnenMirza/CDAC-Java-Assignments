
public class Manager extends Employee {
	
	protected float hra;

	Manager(String name, String address, int age, String gender, float salary,float hra) {
		super(name, address, age, gender, salary);
		this.hra=hra;
	}

	
	public void setHra(float hra) {
		
		if(hra<0) {
			System.out.println("Enter valid HRA amount!");
			return;
		}
		this.hra=hra;
	}
	
	public float getHra() {
		return hra;
	}
	
}
