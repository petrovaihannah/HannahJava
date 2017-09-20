package section11class;

import java.util.Scanner;

public class Exceptii {
    public static void main(String[] args) {
        System.out.println("write a number");
        boolean stop = false;
        try {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            System.out.println("number is " + i);
        }
        // catch(InputMismatchException e)
        catch (Exception e) {
            System.out.println("nu ati introdus un numar");
        }
        while (!stop);
    }
}