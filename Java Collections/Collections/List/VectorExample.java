package Collections.List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        //Creating Vector with default initial capacity of 10
        Vector<Integer> vector = new Vector<Integer>();

        //Adding elements to vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        //Retrieving the current size of vector
        System.out.println(vector.size());      //Output : 4

        //Setting the size of vector as 10.
        vector.setSize(10);

        //Now retrieving the current size of vector
        System.out.println(vector.size());    //Output : 10

        //Printing the elements of vector. notice that 6 null elements are inserted
        System.out.println(vector);     //Output : [10, 20, 30, 40, null, null, null, null, null, null]

        //Again changing the size of vector to 3
        vector.setSize(3);

        //Printing the elements of vector. notice that extra elements are removed.
        System.out.println(vector);    //Output : [10, 20, 30]

        // iteration
        Enumeration<Integer> enumeration=vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        //Getting first element
        System.out.println(vector.firstElement());     //Output : 10

        //Getting last element
        System.out.println(vector.lastElement());      //Output : 40
    }
}
