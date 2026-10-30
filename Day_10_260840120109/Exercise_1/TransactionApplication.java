//package day10.exercise1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TransactionApplication {
    public static void main(String[] args) {
        List<Transaction> list = new ArrayList<>();

        TransactionManager.addTrans(list);

        // Let's verify it worked by printing the item count
        System.out.println("Transaction added! Total records: " + list.size());

    }
}
