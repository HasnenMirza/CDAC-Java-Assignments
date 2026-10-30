
public class calculator {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			System.out.println("===================MENU================");
			System.out.println("1. Add two integers:");
			System.out.println("2. Add two float:");
			System.out.println("3. Add two double:");
			System.out.println("4. Substract two integers:");
			System.out.println("5. Substract two float:");
			System.out.println("6. Substract two double:");
			System.out.println("7. Multiply two integers:");
			System.out.println("8. Multiply two float:");
			System.out.println("9. Multiply two double:");
			System.out.println("10. Divide two integers:");
			System.out.println("11. Divide two float:");
			System.out.println("12. Divide two double:");
			System.out.println("13. Exit: ");
			System.out.println("=======================================");

			
			System.out.println("Enter your choice");
			 choice=getNum.getchoice();
			
			switch(choice) {
			
			//addition of integers
			case 1:
				
				System.out.println("Addition of two integers are: "+ Calc.addInt());
				break;
			
			//additon of two float
				
			case 2:
					
				System.out.println("Addition of two floats are: "+ Calc.addFloat());
				break;
					
			//addition of two double			
			case 3:
				
			    System.out.println("Addition of two doubles are: "+ Calc.addDouble());
			    break;
				
			//substraction of integers    
			case 4:
				
				System.out.println("Substraction of two integer numbers are: "+ Calc.subInt());
				break;
					
			//substraction of float		
			case 5:
				
				    System.out.println("Substraction of two float numbers are: "+ Calc.subFloat());
					break;
					
			//substraction of Double		
			case 6:
				
				    System.out.println("Substraction of two double numbers are: "+ Calc.subDouble());
					break;
					
			//Multiplication of integers    
			case 7:
					
					System.out.println("Multipilication of two integer numbers are: "+ Calc.mulInt());
					break;
					
		    //Multiplication of float    
			case 8:
					
					System.out.println("Multipilication of two float numbers are: "+ Calc.mulFloat());				
					break;
					
		   //Multiplication of doubles    
		    case 9:
					
					System.out.println("Multipilication of two double numbers are: "+ Calc.mulDouble());
					break;
					
			//Division of integers    		
			case 10:
					
					System.out.println("Division of two integer number are: "+ Calc.DivInt());
					break;
			
			//Division of floats    				
			case 11:
					
					System.out.println("Division of two float number are: "+ Calc.DivFloat());
					break;
			
			//Division of doubles    		
	        case 12:
	            	
					System.out.println("Division of two double number are: "+ Calc.DivDouble());
					break;
				
			case 13:
				
			         return;
			
			default:
				
				    System.out.println("Enter the valid choice");
			}
			
		}while(choice!=13);
		
	}

}
