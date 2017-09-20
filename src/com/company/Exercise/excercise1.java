package com.company.Exercise;

import java.util.Scanner;

/**
 * Created by petrovaihannah on 19-Jul-17.
 */
public class excercise1 {
    public static void main(String[] args) {
        System.out.println("Scrieti un numar intre 1 si 7");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        String ziua = "";
        switch (numar)
        {
            case 1: ziua = "Luni"; break;
            case 2: ziua = "Marti"; break;
            case 3: ziua = "Miercuri"; break;
            case 4: ziua = "Joi"; break;
            case 5: ziua = "Viner"; break;
            case 6: ziua = "Sambata"; break;
            case 7: ziua = "Dominica"; break;
            default:
                System.out.println("Numarul nu e valabil");
        }
        System.out.println(ziua);
    }
}
