package section7.classExercise;

public class exe73 {
    public static void main(String[] args) {
        int [] value = {23, 1, 34, 54, 3, 7, 5, 12, 15, 8};
        for (int i = 0; i < value.length; i++){
            if ( value[i] % 3 ==0){
                System.out.println(value[i]);
            }
        }
    }
}
