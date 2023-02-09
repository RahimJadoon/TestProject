package Chapter2JavaProgramming;

import java.util.Scanner;

public class ifElseStatement {

    /*
    * Add 2000 as bonus in actual salary of 20000, if sales >= 10 in a month.
    * */
    public static void main (String args[]){

        // Intilize what we have
        int salary= 20000;
        int bonus= 2000;

        // Get we don't
        System.out.println("Eneter the number of sales you did in this month");
        Scanner scanner= new Scanner(System.in);
                int sales= scanner.nextInt();
                scanner.close();

        // Logic
        if (sales>=10) {
            salary= salary+ bonus;
            System.out.println("Congratulation: You earned bonus of "+ bonus + "for this month. You salary is: " + salary);
        }
        else
        {
            System.out.println("You salary for this month is : "+ salary);
        }

    }
}
