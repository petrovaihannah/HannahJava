package section11class;

import java.util.HashSet;

public class ExHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Maria");
        hashSet.add("Paul");
        hashSet.add("Marco");
        hashSet.add("Alice");
        System.out.println("HashSet contine " + hashSet);
        if (hashSet.contains("Marco"))
            System.out.println("L-am gasit pe Marco!!! ");
        hashSet.remove("Marco");
        if (hashSet.contains("Marco"))
            System.out.println("L-am gasit pe Marco!!! ");
        else
            System.out.println("Nu l-am gasit pe Marco");
    }
}
