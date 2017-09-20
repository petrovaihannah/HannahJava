package section11class;

import java.util.LinkedList;

public class ExLinkedList {
    public static void main(String args[]) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alb");
        linkedlist.add("Negru");
        linkedlist.add("Gri");
        linkedlist.add("Rosu");
        linkedlist.add("Roz");

        System.out.println("LinkedList contine: " +linkedlist);
        Object firstvar = linkedlist.get(0);
        System.out.println("Primul element: " +firstvar);
        linkedlist.set(0, "Maro");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("Primul element: " +firstvar2);

        linkedlist.add(0, "Portocaliu");
        linkedlist.remove(3);
        System.out.println("LinkedList contine: " +linkedlist);
    }
}
