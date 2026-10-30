import java.util.LinkedList;
import java.util.Scanner;
import employee.utils.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Exception;

public class EmployeeApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        LinkedList<Employee> employeeList = new LinkedList<>();
        
      //employeeList.
        int currentEmployeeIndex = -1;

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. ADD");
            System.out.println("2. DISPLAY");
            System.out.println("3. FILTER BY ROLE");
            System.out.println("4. Save");
            System.out.println("5. Load");
            System.out.println("6. EXIT");

            
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {

            // ==================== ADD EMPLOYEES ====================
            case 1: {
                int subChoice = 0;
                
                do {
                    System.out.println("\n--- ADD EMPLOYEE ---");
                    System.out.println("1. ADD MANAGER");
                    System.out.println("2. ADD ENGINEER");
                    System.out.println("3. ADD SALESMAN");
                    System.out.println("4. EXIT TO MAIN MENU");
                    System.out.print("Enter your choice: ");
                    
                    try {
                        subChoice = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number.");
                        continue;
                    }

                    if (subChoice >= 1 && subChoice <= 3) {
                        try {
                            System.out.print("Enter the name: ");
                            String name = input.nextLine();

                            System.out.print("Enter the address: ");
                            String address = input.nextLine();

                            System.out.print("Enter the age: ");
                            int age = Integer.parseInt(input.nextLine());

                            System.out.print("Enter the gender (Male/Female/Transgender): ");
                            String gender = input.nextLine();

                            System.out.print("Enter the basic salary: ");
                            float salary = Float.parseFloat(input.nextLine());

                            switch (subChoice) {
                            case 1: {
                                System.out.print("Enter the house rent allowance (HRA): ");
                                float houseRentAllowance = Float.parseFloat(input.nextLine());
                               employeeList.add(new Manager(name, address, age, gender, salary, houseRentAllowance));
                                System.out.println("Manager successfully added.");
                                break;
                            }
                            case 2: {
                                System.out.print("Enter the Overtime amount: ");
                                float overTimeAmount = Float.parseFloat(input.nextLine());
                                employeeList.add(new Engineer(name, address, age, gender, salary, overTimeAmount));
                                System.out.println("Engineer successfully added.");
                                break;
                            }
                            case 3: {
                                System.out.print("Enter the Commission: ");
                                float commissionAmount = Float.parseFloat(input.nextLine());
                                employeeList.add(new Salesman(name, address, age, gender, salary, commissionAmount));
                                System.out.println("Salesman successfully added.");
                                break;
                            }
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error adding employee: " + e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Invalid input format. Entry cancelled.");
                        }
                    } else if (subChoice == 4) {
                        System.out.println("Returning to main menu...");
                    } else {
                        System.out.println("Invalid sub-choice! Please try again.");
                    }

                } while (subChoice != 4);
                break;
            }

            // ==================== DISPLAY EMPLOYEES ====================
            case 2: {
                if (employeeList.isEmpty()) {
                    System.out.println("No employees in the system to display.");
                    break;
                }

                int subChoice = 0;
                
                final int DisplayAllEmployees = 1;
                final int DisplayFirstEmployees = 2;
                final int DisplayNextEmployees = 3;
                final int DisplayPreviousEmployees = 4;
                final int DisplayLastEmployees = 5;
                final int ExitToMainMenu = 6;

                do {
                    System.out.println("\n1. All Employees\n2. First Employee\n3. Next Employee\n4. Previous Employee\n5. Last Employee\n6. Exit to Main Menu");
                    System.out.print("Enter your SubChoice: ");

                    try {
                        subChoice = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number.");
                        continue;
                    }

                    switch (subChoice) {
                    case DisplayAllEmployees: {
                    	//employeeList.
                    	DisplayEmployee.displayAll(employeeList);
                        break;
                    }
                    case DisplayFirstEmployees: {
                        currentEmployeeIndex = 0;
                       System.out.println("\n=== FIRST EMPLOYEE ===");
                    	Employee tempEmployee=employeeList.getFirst();
                    	DisplayEmployee.display(tempEmployee);
                    	
                    	
//                        try {
//                            System.out.println("\n=== FIRST EMPLOYEE ===");
//                            Employee tempEmployee = InterfaceCRUD.getFirst(employeeList);
//                            DisplayEmployee.display(tempEmployee);
//                        } catch (LinkedListException e) {
//                            System.out.println(e.getMessage());
//                        }
                        currentEmployeeIndex++;
                        break;
                    }
                    case DisplayNextEmployees: {
                    	
                    	 System.out.println("\n=== NEXT EMPLOYEE ===");
                    	Employee tempEmployee=employeeList.get(currentEmployeeIndex);
                    	DisplayEmployee.display(tempEmployee);
                    	
//                    	try {
//                            System.out.println("\n=== NEXT EMPLOYEE ===");
//                            Employee tempEmployee = InterfaceCRUD.getNext(employeeList);
//                            DisplayEmployee.display(tempEmployee);
//                        } catch (LinkedListException e) {
//                            System.out.println("You are already at the last employee.");
//                        }
                        break;
                    }
                    case DisplayPreviousEmployees: {
                    	
                    	System.out.println("\n=== PREVIOUS EMPLOYEE ===");
                    	Employee tempEmployee=employeeList.get(--currentEmployeeIndex);
                    	DisplayEmployee.display(tempEmployee);
//                    	try {
//                            System.out.println("\n=== PREVIOUS EMPLOYEE ===");
//                            Employee tempEmployee = InterfaceCRUD.getPrevious(employeeList);
//                            DisplayEmployee.display(tempEmployee);
//                        } catch (LinkedListException e) {
//                            System.out.println("You are already at the first employee.");
//                        }
                        break;
                        
                    }
                    case DisplayLastEmployees: {
                    	
                    	System.out.println("\n=== LAST EMPLOYEE ===");
                    	Employee tempEmployee=employeeList.getLast();
                    	DisplayEmployee.display(tempEmployee);
                  //  	try {
//                            System.out.println("\n=== LAST EMPLOYEE ===");
//                            Employee tempEmployee = InterfaceCRUD.getLast(employeeList);
//                            DisplayEmployee.display(tempEmployee);
//                        } catch (LinkedListException e) {
//                            System.out.println(e.getMessage());
//                        }
                        break;
                    }
                    case ExitToMainMenu: {
                        System.out.println("Returning to main menu...");
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice! Please try again.");
                    }
                    }

                } while (subChoice != ExitToMainMenu);

                break;
            }

            // ==================== FILTER MENU ====================
            case 3: {
                if (employeeList.isEmpty()) {
                    System.out.println("No employees available to filter.");
                    break;
                }

                int filterSubChoice = 0;

                final int AllManagers = 1;
                final int AllEngineers = 2;
                final int AllSalespersons = 3;
                final int ExitFilterMenu = 4;

                do {
                    System.out.println("\n--- FILTER MENU ---");
                    System.out.println("1. All Managers");
                    System.out.println("2. All Engineers");
                    System.out.println("3. All Salespersons");
                    System.out.println("4. Exit to Main Menu");
                    System.out.print("Enter your SubChoice: ");

                    try {
                        filterSubChoice = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input!");
                        continue;
                    }

                    switch (filterSubChoice) {
                    case AllManagers: {
                        System.out.println("\n=== ALL MANAGERS ===");
                        for (int employeeIndex = 0; employeeIndex < employeeList.size(); employeeIndex++) {
                            Employee tempEmployee = employeeList.get(employeeIndex);
                            if (tempEmployee instanceof Manager) {
                                DisplayEmployee.display(tempEmployee);
                                System.out.println("-----------------------------------");
                            }
                        }
                        break;
                    }
                    case AllEngineers: {
                        System.out.println("\n=== ALL ENGINEERS ===");
                        for (int employeeIndex = 0; employeeIndex < employeeList.size(); employeeIndex++) {
                            Employee tempEmployee = employeeList.get(employeeIndex);
                            if (tempEmployee instanceof Engineer) {
                                DisplayEmployee.display(tempEmployee);
                                System.out.println("-----------------------------------");
                            }
                        }
                        break;
                    }
                    case AllSalespersons: {
                        System.out.println("\n=== ALL SALESPERSONS ===");
                        for (int employeeIndex = 0; employeeIndex < employeeList.size(); employeeIndex++) {
                            Employee tempEmployee = employeeList.get(employeeIndex);
                            if (tempEmployee instanceof Salesman) {
                                DisplayEmployee.display(tempEmployee);
                                System.out.println("-----------------------------------");
                            }
                        }
                        break;
                    }
                    case ExitFilterMenu: {
                        System.out.println("Returning to main menu...");
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice! Please try again.");
                    }
                    }

                } while (filterSubChoice != ExitFilterMenu);

                break;
            }
            
         // ======================== Save Data ==============================
            case 4: {
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("EmployeeData.txt"))) {
                    out.writeObject(employeeList);
                    System.out.println("Employee data saved successfully.");
                } catch (IOException e) {
                    System.out.println("Error saving data: " + e.getMessage());
                }
                break;
            }

            // ======================== Load Data ==============================
            case 5: {
                String filename = "EmployeeData.txt";
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
                    @SuppressWarnings("unchecked")
                    LinkedList<Employee> loadedList = (LinkedList<Employee>) in.readObject();
                    employeeList = loadedList;
                    System.out.println("Employee data loaded successfully.");
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Error loading data: " + e.getMessage());
                }
                break;
            }

            // ==================== EXIT PROGRAM ====================
            case 6: {
                System.out.println("Exiting program. Goodbye!");
                input.close();
                return;
            }

            default: {
                System.out.println("Invalid choice! Please try again.");
            }
            }

        } while (choice != 6);
    }
}