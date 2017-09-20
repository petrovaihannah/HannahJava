package section11class;

import java.util.HashMap;

public class ExHashMap {
    public static void main(String args[]) {
        HashMap<String, Integer> hmap = new HashMap<String,Integer>();
        hmap.put("mere",5);
        hmap.put("pere",10);
        hmap.put("caise", 8);
        hmap.put("piersici", 7);
        System.out.println(hmap);
        hmap.remove("pere");
        System.out.println(hmap);
        System.out.println(hmap);
        System.out.println("cantitate");
        hmap.put("caise", 15);
        System.out.println(hmap);
    }
}
