package section11class;

public class Exceptii3 {
    public static void main(String[] args) {
        int[] a = {23, 1, 34, 54, 3, 7, 5, 'a',12, 5, 8};
        try {
            //Here we put the function the calculation or the think we neet to verifi
            for (int i = 0; i <= a.length; i++)
                System.out.println(a[i]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enithing");
        }catch (Exception e){
            System.out.println("We have an general error");
        }finally {
            System.out.println("This it will be printed any time");
        }
    }
}
