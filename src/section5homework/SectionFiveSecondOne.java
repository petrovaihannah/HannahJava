package section5homework;

/**
 * Created by petrovaihannah on 15-Jul-17.
 */
public class SectionFiveSecondOne {
    public static void print_sums() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1 ; j <= i; j++){
                sum = sum + j;
            }
            System.out.println( sum );
            sum = 0 ;
        }
    }

    public static void main(String[] args) {

        print_sums();
    }
}