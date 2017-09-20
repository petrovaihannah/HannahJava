package com.company.forsorting;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 7/12/2017.
 */
public class second {
    public static void main(String[] args) {
        System.out.println("first number");
        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        System.out.println("second number");
        int nr2 = scanner.nextInt();
        System.out.println("third number");
        int nr3 = scanner.nextInt();
        System.out.println("fourth number");
        int nr4 = scanner.nextInt();
        if (nr1 > nr2) {
            if (nr1>nr3){
                if (nr1>nr4){
                    System.out.println(nr1);
                }
            }else if(nr3>nr4){
                System.out.println(nr3);
            }
        }else if(nr2>nr3){
            if (nr2>nr4){
                System.out.println(nr2);
            }
        }else
            System.out.println(nr4);
    }
}
