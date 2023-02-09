package PhoneBillCalculator;

import java.util.Scanner;

public class BillCalculator {

    public static void main(String args[]){

        PhoneBill bill= new PhoneBill(12);
        bill.setNoOfMinuteUsed(20);
        bill.printItemmizedBill();

    }
}
