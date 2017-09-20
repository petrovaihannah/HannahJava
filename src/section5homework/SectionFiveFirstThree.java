package section5homework;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 15-Jul-17.
 */
public class SectionFiveFirstThree {
    public static void main(String[] args) {
        System.out.println("first number");
        Scanner keyboard = new Scanner(System.in);
        int nr1 = keyboard.nextInt();
        System.out.println("second number");
        int nr2 = keyboard.nextInt();
        System.out.println("Equals " + nr1*nr2);
    }
}
