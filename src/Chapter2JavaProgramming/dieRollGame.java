package Chapter2JavaProgramming;

import java.util.Random;

public class dieRollGame {
    /*
    Objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 - 6) and advance the user that number
of spaces on the game board.
After each roll, tell the user which game space they are on and how many more spaces they have to go
to win.
Repeat this 4 additional times for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - thev've won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like "You advanced to space 22" is a bug.
     */
    public static void main (String args[]){

        // Intilize variables
        int totalSpaces= 20;
        int rolls=5;
        int space=0;
        Random random = new Random();

        for (int i=0; i>= totalSpaces ||i<rolls; i++)
        {
            int die = random.nextInt(6) + 1;
            space= space+die;
            if (space<= totalSpaces)
            System.out.println("You've rolled a "+ die + " You are now on space "+space+" and have "+ (totalSpaces-space) +" more to go");

            else if (space==totalSpaces){
                System.out.println("Congrats! you won");

            }

        }
        if (space != totalSpaces){
            System.out.println("Sorry, you loose the game");
        }
    }
}
