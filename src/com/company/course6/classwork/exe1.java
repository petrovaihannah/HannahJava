package com.company.course6.classwork;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class exe1 {
    public static void main(String[] args) {
        System.out.println("Give a number");
        Scanner readfromkeyboard = new Scanner(System.in);
        int value = readfromkeyboard.nextInt();
        if ( value >= 1 ){
            System.out.println("is pozitive.");
        }else if( value <= -1){
            System.out.println("is negative");
        }else {
            System.out.println("number is zero");
        }
    }

}
