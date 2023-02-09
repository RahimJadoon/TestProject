package Arrays;

import java.util.Scanner;

/*
Make an array that holds its actual values of the days of the week,
 and then have the user input a number corresponding to some day of the week. And assume that the week starts on Monday.

Your program should output the String that represents the day of the week that corresponds to the number that the user input.
For example, if the user inputs the number 1, your program should print “Monday”
 */
public class Assigment {
    private static String[] daysOfWeek={"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static int day;
    public static void main(String args[]){

       day = getDayofWeek();
       displayWeekDay(day);

    }
    public static int getDayofWeek(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the day of the week, you want to print: ");
        day= scanner.nextInt();
        return day;
    }
    public static void  displayWeekDay(int day){
        for(int i=0; i< daysOfWeek.length; i++){
            if (i+1==day){
                System.out.print("Day of the week against your input is: "+ daysOfWeek[i]);
            }
        }
    }
}
