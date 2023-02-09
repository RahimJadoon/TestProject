package Arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryNumbers {
    private static final int LENGTH=6;
    private static final int MaXnumberlength=69;

    public static void main(String args[]){

        int[] ticket= generateLotteryNumber();
        Arrays.sort(ticket);
        PrintLotteryNumber(ticket);
    }
    public static int[] generateLotteryNumber() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(MaXnumberlength) + 1;
            }
            while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }
        public static boolean search(int[] array, int numberToSearch){
            for (int value: array){
                if (value==numberToSearch){
                    return true;}
            }

                return false;
        }


    public static void PrintLotteryNumber(int ticket[]){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i]+ " || ");
        }

    }
}
