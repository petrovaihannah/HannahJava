package com.company.forsorting;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 7/5/2017.
 */
public class NewProjects {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Hello World");
        System.out.println("----------------------");
        int first = 55;
        int second = 5;
        System.out.println("First Number is: " + first);
        System.out.println("Second Number is: "+ second);
        System.out.println("the sum is " + first + second);
        System.out.println(first - second);
        System.out.println("the multiplication is" + first*second);
        System.out.println("the divedend is " + first/second);
        System.out.println("--------------------------------------");
        String someText = "Hanna";
        System.out.println("Hello "+someText+", ho sre you");
        System.out.println("++++++++++++++++++++++++++");
        String name = "Razvan";
        int age = 23;
        String adress = "CLuj";
        System.out.println("Hello "+ name + ", how ond are you ? "+ age+ ", and where are you leaving ? " + adress);
        System.out.println("-------------------------------------------------------------");
readInt();
readString();

    }
    public static void readString(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name");
        String myint = keyboard.next();
        System.out.println(myint);

    }
    public static void readInt(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Number");
        int myint = keyboard.nextInt();
        System.out.println(myint);

    }
}
