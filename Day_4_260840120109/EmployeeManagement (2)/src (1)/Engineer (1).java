
public class Engineer extends Employee {

	float overTimeAmount;
	Engineer(String name, String address, int age, String gender, float salary,float OT) {
		super(name, address, age, gender, salary);
		overTimeAmount=OT;
	}
  
	
public void setOtAmount(float otAmount) {
		
		if(otAmount<0) {
			System.out.println("Enter valid HRA amount!");
			return;
		}
		this.overTimeAmount=otAmount;
	}
	
	public float getOtAmount() {
		return overTimeAmount;
	}
	
	
}
