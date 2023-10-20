package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList with no size defined

        ArrayList<Integer> list = new ArrayList<>();

        //Adding elements to ArrayList

        list.add(10);

        list.add(20);

        list.add(30);

        list.add(40);

        System.out.println(list.size());     //Output : 4

        //Removing an element at index 0

        list.remove(0);

        System.out.println(list.size());    //Output : 3

        //iterate
        Iterator<Integer> iterator=list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
