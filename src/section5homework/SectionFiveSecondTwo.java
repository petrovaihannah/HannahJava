package section5homework;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 16-Jul-17.
 */
public class SectionFiveSecondTwo {
    public static void main(String[] args) {
        System.out.println("first number");
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        System.out.println("second number");
        int nr2 = scanner.nextInt();
        int sum = 0;
        for (int i = nr1; i <= nr2; i++) {
            sum = sum + i;
            }
            System.out.println(sum);
        }
    }
