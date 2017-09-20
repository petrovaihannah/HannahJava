package section11home;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) throws IOException {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");
        obj.add("F");
        obj.add("G");
        System.out.println("Lista cu obiecte "+obj);

        System.out.println("the third student is " + 2);

        obj.remove(4);
        System.out.println("Lista cu obiecte "+obj);
}
}
