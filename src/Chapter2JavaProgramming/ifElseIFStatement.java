package Chapter2JavaProgramming;

import java.util.Scanner;

public class ifElseIFStatement {
    public static void main (String ags[]){
        System.out.println("Enter your marks:");
        Scanner scanner=new Scanner(System.in);
        int marks= scanner.nextInt();
        scanner.close();

        char grade;
        if (marks<60) {
            grade='F';
            System.out.println("Your Grade is: " + grade);
        }
        else if (marks<70 && marks>=60) {
            grade='C';
            System.out.println("Your grade is: "+ grade);
        }
        else if (marks<80 && marks>=70) {
            grade = 'B';
            System.out.println("Your grade is: " + grade);
        }
        else{
            grade='A';
            System.out.println("Your grade is: "+ grade);
        }



    }
}
