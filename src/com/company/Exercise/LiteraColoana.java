package com.company.Exercise;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class LiteraColoana {
    public static void main(String[] args){
    String text = "Hello World";
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < text.length(); i++)
        {
        char litera = text.charAt(i);
        System.out.print(litera + "---");
    }
}
}