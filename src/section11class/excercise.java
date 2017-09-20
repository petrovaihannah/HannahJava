package section11class;

import java.util.Random;
import java.util.Scanner;

public class excercise {
    public static void main(String[] args) {
        Random rand = new Random();
        int randnumber = rand.nextInt(10) + 1;

        System.out.println("Ghive a number for gues");
        int count = 0;
        boolean stop = false;

        do {
            count++;
            Scanner scanner = new Scanner(System.in);
            int myNumber = scanner.nextInt();
            try {
                if (randnumber == myNumber) {
                    System.out.println("You gues");
                } else if (randnumber > myNumber) {
                    System.out.println("the number is bigger");
                } else if (randnumber < myNumber) {
                    System.out.println("the number is smaller");
                }
                System.out.println("You try for " + count + " times");
            } catch (ArithmeticException e){
                System.out.println("is not a number");
            }
        }while (!stop) ;

    }
}

