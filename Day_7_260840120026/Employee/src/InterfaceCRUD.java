
import linkedlist.util.WriteInList;
import linkedlist.util.LinkedList;
import linkedlist.util.LinkedListException;
import linkedlist.util.ReadInList;
import employee.utils.*;

public class InterfaceCRUD {

	LinkedList<Employee> employeeList = new LinkedList<>();

	public static void addManager(WriteInList<Employee> list,String name,String address, int age , String gender, float basicSalary,float hra) {

		list.add(new Manager(name,address,age,gender,basicSalary,hra));

	}
	
	public static void addEngineer(WriteInList<Employee> list,String name,String address, int age , String gender, float basicSalary,float overTime) {

		list.add(new Engineer(name,address,age,gender,basicSalary,overTime));

	}
	
	public static void addSalesman(WriteInList<Employee> list,String name,String address, int age , String gender, float basicSalary,float comm) {

		list.add(new Salesman(name,address,age,gender,basicSalary,comm));

	}
	
	



	public static void deleteEmployee(WriteInList<Employee> Writelist, int idx) throws LinkedListException {

		Writelist.delete(idx);

	}

	

	public static Employee getFirst(ReadInList<Employee> traverseList) throws LinkedListException {
	    return traverseList.getFirst();
	}

	public static Employee getLast(ReadInList<Employee> traverseList) throws LinkedListException {
	    return traverseList.getLast();
	}

	public static Employee getNext(ReadInList<Employee> traverseList) throws LinkedListException {
	    return traverseList.getNext();
	}

	public static Employee getPrevious(ReadInList<Employee> traverseList) throws LinkedListException {
	    return traverseList.getPrevious();
	}

	}


