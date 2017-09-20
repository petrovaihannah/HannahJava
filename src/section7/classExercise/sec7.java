package section7.classExercise;

public class sec7 {
    public static void main(String[] args) {
        int a = 3;
        String orher = "hanna";
        int b = 5;
        int sum = adunare(a, b);
        System.out.println("sum is " + sum);

        int maxim = max (a,b);
        System.out.println("Max is " + maxim);

        String someting = answer(orher,b,a);
        System.out.println(someting + "................");
        double media = mediaAritmetica (a,b);
        System.out.println(media);
    }
    public static int mediaAritmetica(int x, int y){
        return x+y;
    }

    public static int adunare(int x, int y) {
        return (x+y);
    }
    //calculate max
    public static int max(int x, int y)
    {if (x>y)
        return x;
    else
        return y;

    }
    public static String answer(String x, int y, int z){
        return x +" have "+ (y+z) + " yeas";
    }


}

