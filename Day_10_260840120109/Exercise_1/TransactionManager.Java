
import java.time.LocalDate;
import java.util.List;     // REQUIRED IMPORT
import java.util.Scanner;
class TransactionManager{

    public static void addTrans(List<Transaction> list){
        list.add(setTrans());

    }


    public static Transaction setTrans(){
          Scanner sc = new Scanner(System.in);
        System.out.println("enter txn amount");
        float txAMNT = sc.nextFloat();
        
        System.out.println("enter date (format yyyy-mm-dd)");
        String unDate = sc.next();
        LocalDate date = LocalDate.parse(unDate); 

        System.out.println("enter txn status true/false");
        boolean txSTS = sc.nextBoolean();

        System.out.println("enter txn arrears true/false");
        boolean txARR = sc.nextBoolean();

        // FIXED: Now passing txARR as the final boolean argument
        return new Transaction(date, txAMNT, txSTS, txARR); 

    }
}