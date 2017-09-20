package section5homework;

/**
 * Created by petrovaihannah on 16-Jul-17.
 */
public class SectionFiveThirdOne {
    public static void main(String[] args) {
        int line = 1; // line number
        int count = 10; // number of numbers on the line
        for (int x = 11; x <= 20; x++) {
            if (count == line) {
                System.out.println(""); // move to a new line
                count = 11; // set count back to 0
                line++; // increment the line number by 1
            }
            System.out.print(x); // keep on printing on the same line
            System.out.print(" "); // add a space after you printed your number
            count++;
        }
    }
}


