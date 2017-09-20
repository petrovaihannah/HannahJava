package com.company.Exercise;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class Exercise2weeks {
    public static void main(String[] args) {
        System.out.println("Scrieti o zi din saptamana");
        Scanner scanner = new Scanner(System.in);
        String zi = scanner.next();
        switch (zi)
        {
            case "luni":
                System.out.println("Inceput de saptamana");
                break;
            case "Marti":
            case "Miercuri":
            case "Joi":
                System.out.println("Mijlocul saptamani");
                break;
            case "Sambata":
            case "Dominica":
                System.out.println("Weekend!!!!");
                break;
                default:
                    System.out.println("Nu iti introduce valabila");
        }

    }
}
