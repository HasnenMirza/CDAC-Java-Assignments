
public class food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		int Total_Amount=0,qty,price;
		int choice;
		String items[]=new String[100];
		int items_price[]=new int[100];
		int quantity[]=new int[100];
		do {
			System.out.println("===================MENU================");
			System.out.println("1. Samosa:");
			System.out.println("2. Poha (per plate):");
			System.out.println("3. Jalebi (250 gm):");
			System.out.println("4. Idli:");
			System.out.println("5. Dosa:");
			System.out.println("6. Butter Chicken : ");
			System.out.println("7. Aalo Paratha :");
			System.out.println("8. Mutton Korma :");
			System.out.println("9. Butter Paneer Masala :");
			System.out.println("10.Total Bill & Exit :");
			System.out.println("=======================================");

		
			
			System.out.println("Enter your choice");
			 choice=getNum.getchoice();
			
			switch(choice) {
			
			//addition of integers
			case 1:
				
				System.out.println("Enter quantity: ");
				 qty=getNum.getchoice();
				 price=20;
				 Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Samosa";
				items_price[i]=price;
				quantity[i]=qty;
				i++;
				break;
			
			//additon of two float
				
			case 2:
					
				System.out.println("Enter quantity: ");
				 qty=getNum.getchoice();
				 price=35;
				Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Poha (per plate)";
				items_price[i]=price;
				quantity[i]=qty;
				i++;
				
				break;
					
			//addition of two double			
			case 3:
				System.out.println("Enter quantity: ");
				 qty=getNum.getchoice();
				 price=80;
				Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Jalebi (250 gm)";
				items_price[i]=price;
				quantity[i]=qty;
				i++;

			    break;
				
			//substraction of integers    
			case 4:
				
				System.out.println("Enter quantity: ");
				 qty=getNum.getchoice();
				 price=50;
				Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Idli";
				items_price[i]=price;
				quantity[i]=qty;
				i++;
				break;
					
			//substraction of float		
			case 5:
				
				System.out.println("Enter quantity: ");
				 qty=getNum.getchoice();
				 price=40;
				Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Dosa";
				items_price[i]=price;
				quantity[i]=qty;
				i++;
					break;
					
			//substraction of Double		
			case 6:
				
				System.out.println("Enter quantity 1. Full 2. Half : ");
				 qty=getNum.getchoice();
				 if(qty==1) {
					 price=550;
						Total_Amount+=calcAmount.Amount(qty, price);
						items[i]="Butter Chicken";
						items_price[i]=price;
						quantity[i]=qty;
						i++;
				 }
				 else {
				 price=300;
				Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Butter Chicken";
				items_price[i]=price;
				quantity[i]=qty;
				i++;
				}
				 
					break;
					
			//Multiplication of integers    
			case 7:
					
				System.out.println("Enter quantity: ");
				 qty=getNum.getchoice();
				 price=60;
				Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Aalo Paratha";
				items_price[i]=price;
				quantity[i]=qty;
				i++;
					break;
					
		    //Multiplication of float    
			case 8:
					
				System.out.println("Enter quantity 1. Full 2. Half : ");
				 qty=getNum.getchoice();
				 if(qty==1) {
					 price=850;
						Total_Amount+=calcAmount.Amount(qty, price);
						items[i]="Mutton Korma";
						items_price[i]=price;
						quantity[i]=qty;
						i++; 
					 
				 }
				 else 
				 {
				 price=450;
				Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Mutton Korma";
				items_price[i]=price;
				quantity[i]=qty;
				i++;
				 }
					break;
					
		   //Multiplication of doubles    
		    case 9:
					
		    	System.out.println("Enter quantity: ");
				 qty=getNum.getchoice();
				 price=180;
				Total_Amount+=calcAmount.Amount(qty, price);
				items[i]="Butter Paneer Masala";
				items_price[i]=price;
				quantity[i]=qty;
				i++;
					break;
					
//				
			case 10:
				
				System.out.println("<=================Generating the bills===============>");
				System.out.println("Items Name "+"             Price"+"             Quantity");
				for(int j=0;j<i;j++) { 
					System.out.println(items[j]+"                  "+ items_price[j]+"                   "+ quantity[j]);
				}
				
				System.out.println("Total amount to be paid: "+ Total_Amount);

			         return;
			
			default:
				
				    System.out.println("Enter the valid choice");
			}
			
		}while(choice!=10);
		
	}
		
		
		
		
	}


