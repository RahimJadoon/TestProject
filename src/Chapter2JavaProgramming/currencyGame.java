package Chapter2JavaProgramming;

import java.util.Scanner;

public class currencyGame {
    /*
    objective of the game is to enter enough change to equal exactly $1!

    Create a program that asks a user to enter the quantities for the following coins:
pennies, nickels, dimes, and quarters. Your program should count up the value of
all the change. If it's exactly $1, they win! If it's more than $1, tell them by how
much they went over. If it's less than $1, tell them by how much they went under.
Feel free to change the game for your country's currency!
     */

    public static void main (String args[]){

        // initilize what we have


        // get what we don't have
        System.out.println("How much pennies, do you have: ");
        Scanner scanner= new Scanner(System.in);
        double pennies= scanner.nextDouble();
        System.out.println("How much Nickle, do you have: ");
        double nikckle= scanner.nextDouble();

        System.out.println("How much dimes, do you have: ");
        double dimes= scanner.nextDouble();

        System.out.println("How much quarter, do you have: ");
        double quarter= scanner.nextDouble();

        double total= pennies+ (nikckle*5) + (dimes*10) + (quarter*25);

        if (total==100){
            System.out.println("Congrats! You won");
        }
        else if (total> 100){
            total= total- 100;
            System.out.println("Oh, you have"+ total+ " Cents more than a dollor!");
        }
        else {
            total= 100- total;
            System.out.println("You have "+ total+ " cents less than a dollor.");
        }


    }
}

/*
* double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
* */
