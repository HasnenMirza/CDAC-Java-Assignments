import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        Manager man[] = new Manager[60];
        Engineer eng[] = new Engineer[100];
        Salesman sal[] = new Salesman[200];

        int indexOfManager = 0;
        int indexOfEngineer = 0;
        int indexOfSalesman = 0;

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. ADD");
            System.out.println("2. DISPLAY");
            System.out.println("3. SORT");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            
            choice = input.nextInt();
            input.nextLine(); // Clear newline buffer

            switch (choice) {

            // Add Employees
            case 1: {
                int subchoice;
                do {
                    System.out.println("\n--- ADD EMPLOYEE ---");
                    System.out.println("1. ADD MANAGER");
                    System.out.println("2. ADD ENGINEER");
                    System.out.println("3. ADD SALESMAN");
                    System.out.println("4. EXIT TO MAIN MENU");
                    System.out.print("Enter your choice: ");
                    
                    subchoice = input.nextInt();
                    input.nextLine(); // Clear newline buffer

                    switch (subchoice) {

                    case 1: {
                        if (indexOfManager >= man.length) {
                            System.out.println("Manager limit reached!");
                            break;
                        }

                        System.out.print("Enter the name: ");
                        String name = input.nextLine();

                        System.out.print("Enter the address: ");
                        String address = input.nextLine();

                        System.out.print("Enter the age: ");
                        int age = input.nextInt();
                        input.nextLine(); 

                        System.out.print("Enter the gender (Male/Female/Transgender): ");
                        String gender = input.nextLine();

                        System.out.print("Enter the basic salary: ");
                        float salary = input.nextFloat();

                        System.out.print("Enter the house rent allowance (HRA): ");
                        float hra = input.nextFloat();
                        input.nextLine(); 

                        man[indexOfManager] = new Manager(name, address, age, gender, salary, hra);
                        indexOfManager++;
                        System.out.println("Manager successfully added.");
                        break;
                    }
                    case 2: {
                        if (indexOfEngineer >= eng.length) {
                            System.out.println("Engineer limit reached!");
                            break;
                        }

                        System.out.print("Enter the name: ");
                        String name = input.nextLine();

                        System.out.print("Enter the address: ");
                        String address = input.nextLine();

                        System.out.print("Enter the age: ");
                        int age = input.nextInt();
                        input.nextLine(); 

                        System.out.print("Enter the gender (Male/Female/Transgender): ");
                        String gender = input.nextLine();

                        System.out.print("Enter the basic salary: ");
                        float salary = input.nextFloat();

                        System.out.print("Enter the Overtime amount: ");
                        float overTime = input.nextFloat();
                        input.nextLine(); 

                        eng[indexOfEngineer] = new Engineer(name, address, age, gender, salary, overTime);
                        indexOfEngineer++;
                        System.out.println("Engineer successfully added.");
                        break;
                    }
                    case 3: {
                        if (indexOfSalesman >= sal.length) {
                            System.out.println("Salesman limit reached!");
                            break;
                        }

                        System.out.print("Enter the name: ");
                        String name = input.nextLine();

                        System.out.print("Enter the address: ");
                        String address = input.nextLine();

                        System.out.print("Enter the age: ");
                        int age = input.nextInt();
                        input.nextLine(); 

                        System.out.print("Enter the gender (Male/Female/Transgender): ");
                        String gender = input.nextLine();

                        System.out.print("Enter the basic salary: ");
                        float salary = input.nextFloat();

                        System.out.print("Enter the Commission: ");
                        float commision = input.nextFloat();
                        input.nextLine(); 

                        sal[indexOfSalesman] = new Salesman(name, address, age, gender, salary, commision);
                        indexOfSalesman++;
                        System.out.println("Salesman successfully added.");
                        break;
                    }

                    case 4: {
                        System.out.println("Returning to main menu...");
                        break;
                    }

                    default: {
                        System.out.println("Invalid choice! Please try again.");
                    }
                    }

                } while (subchoice != 4);
                break;
            }

            // Display Employees
            case 2: {
                int subchoice;
                do {
                    System.out.println("\n--- DISPLAY EMPLOYEES ---");
                    System.out.println("1. Display all employees");
                    System.out.println("2. Display MANAGER");
                    System.out.println("3. Display ENGINEER");
                    System.out.println("4. Display SALESMAN");
                    System.out.println("5. EXIT TO MAIN MENU");
                    System.out.print("Enter your choice: ");

                    subchoice = input.nextInt();
                    input.nextLine(); // Clear newline buffer

                    switch (subchoice) {

                    case 1: {
                        if (indexOfManager == 0 && indexOfEngineer == 0 && indexOfSalesman == 0) {
                            System.out.println("No employees found.");
                            break;
                        }

                        if (indexOfManager > 0) {
                            System.out.println("\n--- Displaying Managers ---");
                            for (int tmp = 0; tmp < indexOfManager; tmp++) {
                                System.out.println("Name: " + man[tmp].name);
                                System.out.println("Address: " + man[tmp].address);
                                System.out.println("Gender: " + man[tmp].gender);
                                System.out.println("Age: " + man[tmp].age);
                                System.out.println("Salary: " + man[tmp].basicSalary);
                                System.out.println("HRA: " + man[tmp].hra);
                                System.out.println();
                            }
                        }

                        if (indexOfEngineer > 0) {
                            System.out.println("--- Displaying Engineers ---");
                            for (int tmp = 0; tmp < indexOfEngineer; tmp++) {
                                System.out.println("Name: " + eng[tmp].name);
                                System.out.println("Address: " + eng[tmp].address);
                                System.out.println("Gender: " + eng[tmp].gender);
                                System.out.println("Age: " + eng[tmp].age);
                                System.out.println("Salary: " + eng[tmp].basicSalary);
                                System.out.println("Overtime: " + eng[tmp].overTimeAmount);
                                System.out.println();
                            }
                        }

                        if (indexOfSalesman > 0) {
                            System.out.println("--- Displaying Salesmen ---");
                            for (int tmp = 0; tmp < indexOfSalesman; tmp++) {
                                System.out.println("Name: " + sal[tmp].name);
                                System.out.println("Address: " + sal[tmp].address);
                                System.out.println("Gender: " + sal[tmp].gender);
                                System.out.println("Age: " + sal[tmp].age);
                                System.out.println("Salary: " + sal[tmp].basicSalary);
                                System.out.println("Commission: " + sal[tmp].commision);
                                System.out.println();
                            }
                        }
                        break;
                    }
                    case 2: {
                        if (indexOfManager == 0) {
                            System.out.println("No records found for managers.");
                            break; // Fixed: replaced return with break
                        }

                        System.out.println("\n--- Displaying Managers ---");
                        for (int tmp = 0; tmp < indexOfManager; tmp++) {
                            System.out.println("Name: " + man[tmp].name);
                            System.out.println("Address: " + man[tmp].address);
                            System.out.println("Gender: " + man[tmp].gender);
                            System.out.println("Age: " + man[tmp].age);
                            System.out.println("Salary: " + man[tmp].basicSalary);
                            System.out.println("HRA: " + man[tmp].hra);
                            System.out.println();
                        }
                        break;
                    }
                    case 3: {
                        if (indexOfEngineer == 0) {
                            System.out.println("No records found for engineers.");
                            break; // Fixed: replaced return with break
                        }

                        System.out.println("\n--- Displaying Engineers ---");
                        for (int tmp = 0; tmp < indexOfEngineer; tmp++) {
                            System.out.println("Name: " + eng[tmp].name);
                            System.out.println("Address: " + eng[tmp].address);
                            System.out.println("Gender: " + eng[tmp].gender);
                            System.out.println("Age: " + eng[tmp].age);
                            System.out.println("Salary: " + eng[tmp].basicSalary);
                            System.out.println("Overtime: " + eng[tmp].overTimeAmount);
                            System.out.println();
                        }
                        break;
                    }
                    case 4: {
                        if (indexOfSalesman == 0) {
                            System.out.println("No records found for salesmen.");
                            break; // Fixed: replaced return with break
                        }

                        System.out.println("\n--- Displaying Salesmen ---");
                        for (int tmp = 0; tmp < indexOfSalesman; tmp++) {
                            System.out.println("Name: " + sal[tmp].name);
                            System.out.println("Address: " + sal[tmp].address);
                            System.out.println("Gender: " + sal[tmp].gender);
                            System.out.println("Age: " + sal[tmp].age);
                            System.out.println("Salary: " + sal[tmp].basicSalary);
                            System.out.println("Commission: " + sal[tmp].commision);
                            System.out.println();
                        }
                        break;
                    }

                    case 5: {
                        System.out.println("Returning to main menu...");
                        break;
                    }

                    default: {
                        System.out.println("Invalid choice! Please try again.");
                    }
                    }

                } while (subchoice != 5);

                break;
            }

            // Sort Employees
            case 3: {
                System.out.println("Sort functionality is not implemented yet.");
                break;
            }

            // Exit Program
            case 4: {
                System.out.println("Exiting program. Goodbye!");
                input.close();
                return;
            }

            default: {
                System.out.println("Invalid choice! Please try again.");
            }
            }

        } while (choice != 4);
    }
}