package section7.classExercise;

public class exe74 {
    public static void main(String[] args) {
        int [] value = {23, 1, 34, 54, 3, 7, 5, 12, 15, 8};
        for (int i = 0; i < value.length; i++){
               System.out.println(value[i] + 5);
                if (value[i] % 2 == 0){
                    System.out.println(value[i]);
                }

        }

    }
}
