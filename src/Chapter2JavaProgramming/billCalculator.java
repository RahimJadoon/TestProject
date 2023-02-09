package Chapter2JavaProgramming;

import java.util.Scanner;

public class billCalculator {
/*
Calculate the final total of someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage minutes.
Charge the user 0.25 for every minute they were over their plan, and 15% tax on
the subtotal.
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill.
 */
    static Scanner scanner= new Scanner(System.in);
   static double overChargeRate= 0.25;
    static double taxrate= 0.15;
    public static void main(String arg[]){


        System.out.println("Enter base cost of Plan: ");
        double planFee= scanner.nextDouble();

        System.out.println("Enter the overgage minutes: ");
        double overageMinutes= scanner.nextDouble();

        double overagefee= calculateOverageFee( overageMinutes,  overChargeRate);

        double subtotal= calulateSubTotal(planFee, overagefee);

        double totaltax= calculateTax(subtotal, taxrate);

        calculateTotalAmount(planFee,overagefee, subtotal, totaltax);



    }

    public static void calculateTotalAmount(double planFee,double overagefee, double subtotal, double totaltax){
        double totalAmount= subtotal + totaltax;
        System.out.println("Your Phone Bill Statemenet:\n" +
                "Plan: "+ planFee+"\n"+
                "Overage: "+ overagefee+"\n"+
                "Tax:  "+ totaltax+"\n"+
                "Total: "+totalAmount+"");
    }
    public static double calulateSubTotal(double planFee, double overagefee){
        double subtotal= planFee + overagefee;
        return subtotal;
    }
    public static double calculateOverageFee(double overageMinutes, double overChargeRate){
        double overageFee= overageMinutes* overChargeRate;
        return overageFee;
    }
    public static double calculateTax(double subtotal, double taxrate){

        double tax= subtotal*taxrate;
        return tax;
    }
}
