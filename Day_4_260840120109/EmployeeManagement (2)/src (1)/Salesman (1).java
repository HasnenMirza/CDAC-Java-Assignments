
public class Salesman extends Employee {
	float commision;
	Salesman(String name, String address, int age, String gender, float salary, float comm) {
		super(name, address, age, gender, salary);
		commision=comm;
	}
  
	
public void setCommision(float comm) {
		
		if(comm<0) {
			System.out.println("Enter valid commision amount!");
			return;
		}
		commision = comm;
	}
	
	public float getCommision() {
		return commision;
	}
	
}
