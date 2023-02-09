package Chapter2JavaProgramming;


import java.util.Scanner;

public class switchStatement {
    public static void main (String args[]){
        System.out.println("Enter your grade: ");
        Scanner scanner= new Scanner(System.in);
        String grade= scanner.next();

        switch (grade) {
            case "A":
                System.out.println("Excellent Job");
                break;
            case "B":
                System.out.println("Great Job");
                break;
            case "C":
                System.out.println("Good Job");
                break;
            case  "F":
                System.out.println("Better luck next time!");
                break;
            default:
                System.out.println("Not a valid grade");
                break;
        }

    }
}
