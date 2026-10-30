public class Date {

	public static void main(String[] args) {
		
		setDate d = new setDate();
		int choice;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Set Date");
			System.out.println("2. Add Days");
			System.out.println("3. Add Months");
			System.out.println("4. Add Year");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			choice = getNum.getchoice();

			switch(choice) {
			
			// set date
			case 1:
				System.out.println("Enter the number of day:");
				int day = getNum.getchoice();
				System.out.println("Enter the number of month:");
				int month = getNum.getchoice();
				System.out.println("Enter the year:");
				int year = getNum.getchoice();
				
				d.setDateFormat(day, month, year);
				d.display();
				break;

			// add days
			case 2:
				System.out.println("Enter number of days to add:");
				int daysToAdd = getNum.getchoice();
				d.addDays(daysToAdd);
				d.display();
				break;
			
			// add months
			case 3:
				System.out.println("Enter number of months to add:");
				int monthsToAdd = getNum.getchoice();
				d.addMonths(monthsToAdd);
				d.display();
				break;
			
			// add year
			case 4:
				System.out.println("Enter number of years to add:");
				int yearsToAdd = getNum.getchoice();
				d.addYears(yearsToAdd);
				d.display();
				break;
			
			// Display
			case 5:
				d.display();
				break;
				
			// Exit
			case 6:
				System.out.println("Exiting...");
				break;
				
			default:
				System.out.println("Enter the valid choice!!!!");
				break;
			}
					
		} while(choice != 6);
		
	}

}
