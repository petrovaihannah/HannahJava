package com.company.forsorting;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class classone extends slave{
    public static void main(String[] args) {
        System.out.println("Give someting number");
        Scanner givekeyboard = new Scanner(System.in);
        int numberafter = slave.someting(givekeyboard.nextInt());
        System.out.println(numberafter);
    }
}
