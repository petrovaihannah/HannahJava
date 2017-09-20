package section11class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptii2 {
    public static void main(String[] args) {
        System.out.println("Introduceti primul numar");
        try {
            Scanner scanner = new Scanner(System.in);
            int nr1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar");
            int nr2 = scanner.nextInt();
            int rezultat = nr1 / nr2;
            System.out.println("Rezultatul este " + rezultat);
        }
        catch (ArithmeticException e){
            System.out.println("the second number could not be zero");
        } catch (InputMismatchException e2) {
            System.out.println("Nu ati introdus un numar");

        }catch (Exception e3){
            System.out.println("Catch generala");
        }
    }
}
