
import employee.utils.*;
import linkedlist.util.*;
public class DisplayEmployee {

	
	public static void display(Employee objEmployee) {
        while (objEmployee != null) {
            objEmployee.display();
           
        } 
    }

    public static void displayAll(LinkedList<Employee> employeeList) {
        if (employeeList == null || employeeList.isEmpty()) {
            System.out.println("No employees found in the list.");
            return;
        }
        System.out.println("\n=== ALL EMPLOYEES ===");
        for (int employeeIndex = 0; employeeIndex < employeeList.size(); employeeIndex++) {
            Employee tempEmployee = employeeList.get(employeeIndex);
            System.out.println("Employee #" + (employeeIndex + 1) + ":");
            display(tempEmployee);
            System.out.println("-----------------------------------");
        }
    }
}
