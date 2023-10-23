package Collections.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //Creating a TreeSet
        TreeSet<Integer> set = new TreeSet<Integer>();

        //Adding elements to TreeSet
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(80);
        set.add(30);

        //Printing elements of TreeSet
        System.out.println(set);      //Output : [10, 20, 30, 40, 80]
        //Notice that elements are placed in the sorted order.
    }
}
