package com.company.Exercise;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class LiteraHello {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println("Scrieti o Litera");
        Scanner readfromkeyboard = new Scanner(System.in);
        char caracter = readfromkeyboard.next().charAt(0);
        int counter = 0;
        for (int i = 0; i < text.length(); i++)
        {
            char litera = text.charAt(i);
            if (caracter == litera)
                counter ++;
        }
        System.out.println("Litera " + caracter + " a aparut de " + counter + " ori");
    }
}