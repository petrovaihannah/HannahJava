package section11class;

import java.util.Scanner;

public class Exceptii4 {
    public static void main(String[] args) {
        try {

            System.out.println("Dati un numar intre 2 si 5");
            Scanner scanner = new Scanner(System.in);
            int numar = scanner.nextInt();
            if (numar < 2 || numar > 5) throw new ArithmeticException("Numarul nu este intre 2 si 5");
            else
                System.out.println("Numarul nu este intre 2 si 5");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
