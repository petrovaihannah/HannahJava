package section7.classExercise;

public class sec1 {
    public static void main(String[] args) {


        int[] value = {23, 1, 34, 54, 3, 7, 5, 12, 15, 8};
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum = sum + value[i];
            //sum += value[i];
            System.out.println(value[i]);
        }




        System.out.println(value.length);
        System.out.println("sum is " + sum);
        //calculeaza max
        int max = 0;
        for (int i = 0; i < value.length; i++) {
            if (
                    max < value[i])
                max = value[i];
        }
        System.out.println("max is " + max);
        //calculeaza newMax

        int newMax = 0;
        int half = value.length / 2;
        for (int i = 0; i < (value.length / 2); i++) {
            if (newMax <= value[i])
                newMax = value[i];
            if (newMax <= value[value.length - 1 - i])
                newMax = value[value.length];
        }
        System.out.println("max is " + newMax);

        //calculeaza min
        int min = 99;
        for (int i = 0; i < value.length; i++) {
            if (min > value[i]) {
                min = value[i];
            }
            System.out.println(i + " " + min);
        }
        System.out.println("min is " + min);

        //
        int lowest = value[0];
        for (int i = 0; i < value.length; i++) {
            if (lowest > value[i])
                lowest = value[i];
        }
        System.out.println("min is " + lowest);

        //
        double mediaAritmetica = (double) (sum / 2);
        System.out.println("media Aritmetica is " + mediaAritmetica);
    }


}

