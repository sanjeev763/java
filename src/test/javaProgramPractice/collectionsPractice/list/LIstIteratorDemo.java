package collectionsPractice.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class LIstIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator<Integer> listitr = list.listIterator(list.size());//list.size() in the argument because
        // the cursor index points at the first element initially and to iterate in backward direction we are
        //pointing cursor at the last index
        while(listitr.hasPrevious()){
            System.out.print(listitr.previous()+", ");
        }

    }
}
