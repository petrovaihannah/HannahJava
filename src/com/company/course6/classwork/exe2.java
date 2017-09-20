package com.company.course6.classwork;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class exe2 {
    public static void main(String[] args) {
        System.out.println("give a number");
        Scanner readfromkeyboard = new Scanner(System.in);
        int value = readfromkeyboard.nextInt();
        if ((value % 2) == 0){
            System.out.println("is even");
        }else {
            System.out.println("is odd");
        }
    }
}
