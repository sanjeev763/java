package collectionsPractice.list;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        LinkedList<String> linkedlist2 = new LinkedList<>();
        linkedlist.add("dog");
        linkedlist.add("cat");
        linkedlist.add("elephant");
        System.out.println(linkedlist);
        linkedlist.addFirst("crow");
        linkedlist.addLast("sparrow");
        System.out.println(linkedlist);
        linkedlist2.add("lion");
        linkedlist2.add("dog");
        System.out.println(linkedlist2);
        linkedlist.addAll(linkedlist2);
        System.out.println(linkedlist);
        linkedlist.remove(2);
        linkedlist.remove("crow");
        System.out.println(linkedlist);
        linkedlist.removeAll(linkedlist2);
        System.out.println(linkedlist);
    }
}
