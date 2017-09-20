package section11class;

import java.util.HashMap;

public class Angajati {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put ("Maria", 2000);
        hmap.put ("Ioan",2200);
        hmap.put ("Zara", 3500);
        hmap.put ("Marco", 2000);
        System.out.println(hmap);
        boolean angajat1 = hmap.containsValue(3500);
        System.out.println(angajat1);
        System.out.println(hmap.clone());
    }
}
