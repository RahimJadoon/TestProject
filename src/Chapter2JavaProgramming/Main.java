package Chapter2JavaProgramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String adjevtive, Season;
        Integer Number;
        System.out.println("Provide an Adjective which describes season of the year :");
        Scanner scanner= new Scanner(System.in);
        adjevtive= scanner.next();

        System.out.println("Enter the season of the year you like:");
        Season= scanner.next();

        System.out.print("Enter any number which you like most:");
        Number=scanner.nextInt();

        System.out.print("On a "+ adjevtive +" "+ Season+" day, I drink minimum of " + Number+" cups of coffee.");
    }
}