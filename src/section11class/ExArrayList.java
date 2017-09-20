package section11class;

import java.util.ArrayList;

public class ExArrayList {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("caine");
        obj.add("pisica");
        obj.add("cal");
        obj.add("gaina");
        obj.add("rata");
        System.out.println("Lista cu obiecte "+obj);

        obj.add(2, "porumbel");
        obj.add(1, "curcan");

        obj.add(1, "curcan");
        System.out.println("Lista cu obiecte:"+obj);
        obj.remove(1);
        System.out.println("Lista finala:"+obj);
    }
}
