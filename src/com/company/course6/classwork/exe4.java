package com.company.course6.classwork;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class exe4 {
    public static void main(String[] args) {
        System.out.println("what's your first name?");
        Scanner givename = new Scanner(System.in);
        String firstname = givename.next();
        System.out.println("what's your last name?");
        String lastname = givename.next();
        System.out.println("Good evening " + firstname +" " +lastname);

    }
}

