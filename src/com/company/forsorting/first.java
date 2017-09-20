package com.company.forsorting;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 7/12/2017.
 */
public class first {
    public static void main(String[] args) {
        System.out.println("first number");
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        System.out.println("second number");
        int nr2 = scanner.nextInt();
        System.out.println("third number");
        int nr3 = scanner.nextInt();
        System.out.println(nr1+nr2+nr3);
        String someting = scanner.next();
        System.out.println(someting);
    }
}
