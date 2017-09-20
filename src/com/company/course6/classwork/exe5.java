package com.company.course6.classwork;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 20-Jul-17.
 */
public class exe5 {
    public static void main(String[] args) {
        Scanner readvalue = new Scanner(System.in);
        System.out.println("Give me a number");
        int value = readvalue.nextInt();
        for (int n = 1; n <= value ; value--)
        {
            System.out.println(value);
        }
    }
}