package com.company.Exercise;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class Excercise3Nota {
    public static void main(String[] args) {
        System.out.println("Scrieti ce nota ati luat");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        switch (nota)
        {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Mai incearca, stiu ca poti mani bine");
                break;
            case 5:
            case 6:
                System.out.println("E bine");
            case 7:
            case 8:
                System.out.println("Foarte bine");
            case 9:
                System.out.println("Se vede ca si invatat");
                break;
            case 10:
                System.out.println("Perfect! Felicitari!!");
                break;
                default:
                    System.out.println("Nu este o nota valabila");
        }
    }
}
