public abstract class Employee {

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

	// Setter function
	public void setName(String name) {
		if (name.length() < 4) {
			System.out.println("Enter a Valid name!");
			return;
		}
		this.name = name;
	}

	public void setAddress(String address) {
		if (address.length() < 5) {
			System.out.println("Enter Full Address");
			return;
		}
		this.address = address;
	}

	public void setAge(int age) {
		if (age < 17 && age > 61) {
			System.out.println("Enter the valid age!!");
			return;
		}
		this.age = age;
	}

	public void setGender(String gender) {
		  if (!gender.equalsIgnoreCase("MALE") && 
			        !gender.equalsIgnoreCase("FEMALE") && 
			        !gender.equalsIgnoreCase("TRANSGENDER"))  {
			System.out.println("Enter the valid gender (Male/Female/Transgender)");
			return;
		}
		this.gender = gender;
	}

	public void setSalary(float basicSalary) {
		if (basicSalary < 0.0) {
			System.out.println("Enter valid salary");
			return;
		}
		this.basicSalary = basicSalary;
	}

	// getter Function
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
