package section5homework;

import java.util.Scanner;

public class oyramid {
    public static void main(String[] args) {
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("How Many Rows You Want In Your Pyramid?");
            int noOfRows = keyboard.nextInt();
            int rowCount = 1;
            System.out.println("Here Is Your Pyramid");
            for (int i = noOfRows; i > 0; i--)
            {
                //Printing i spaces at the beginning of each row

                for (int j = 1; j <= i; j++)
                {
                    System.out.print(" ");
                }

                //Printing 'j' value at the end of each row

                for (int j = 1; j <= rowCount; j++)
                {
                    System.out.print(j+" ");
                }

                System.out.println();

                //Incrementing the rowCount

                rowCount++;
            }
        }
    }

}
