package section5homework;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("give me a number");
        int numer = value.nextInt();

        for (int i = 1; i <= numer; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
