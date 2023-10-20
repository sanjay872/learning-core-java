package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //Adding elements at the end of the list
        list.add("JAVA");
        list.add("J2EE");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JDBC");

        /* how do you find out whether that element exist in a LinkedList or not. If it exists retrieve the position of that element? */

        //Printing the elements of list
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

        String s = "JSP";

        //Checking whether list contains "JSP"
        boolean contains = list.contains(s);
        if(contains)
        {
            //If list contains "JSP", printing its index
            System.out.println(list.indexOf(s));      //Output : 2
        }

        s = "STRUTS";

        //Checking whether list contains "STRUTS"
        contains = list.contains("STRUTS");
        if(contains)
        {
            //If list contains "STRUTS", printing its index
            System.out.println(list.indexOf(s));
        }

        /* to traverse the elements of a LinkedList in reverse direction? */

        //reverse iterate
        Iterator<String> iterator=list.descendingIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        /* to traverse the elements of a LinkedList in reverse direction */

        LinkedList<String> linkedList = new LinkedList<String>();

        //Adding elements at the end of the linkedList
        linkedList.add("ONE");
        linkedList.add("TWO");
        linkedList.add("THREE");
        linkedList.add("FOUR");
        linkedList.add("FIVE");

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("SIX");
        arrayList.add("SEVEN");
        arrayList.add("EIGHT");
        arrayList.add("NINE");

        linkedList.addAll(arrayList);

        System.out.println(linkedList);

        /* implement LinkedList as a Queue */

        LinkedList<Integer> queue = new LinkedList<Integer>();

        //adding the elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        //Printing the elements of queue
        System.out.println(queue);      //Output : [10, 20, 30, 40]

        //Removing the elements from the queue
        System.out.println(queue.poll());    //Output : 10
        System.out.println(queue.poll());    //Output : 20


        /*  insert an element at the head and tail of a LinkedList */
        queue.offerFirst(12); // also addFirst
        queue.offerLast(12); // also addLast
        System.out.println(queue);

        /* add an element or collection of elements at a specific position of a LinkedList */
        queue.add(1,10);
        System.out.println(queue);

        /*  remove the elements of a LinkedList from both the ends */
        queue.removeFirst();
        queue.removeLast();
        queue.pollFirst();
        queue.pollLast();
        System.out.println(queue);

        /* replace an element at a specific position of a LinkedList with the given element */
        queue.set(0,10);
        System.out.println(queue);

        /* you retrieve and remove and only retrieve an element from specific position of a LinkedList */
        System.out.println(queue.remove(0));
        System.out.println(linkedList.get(0));

        /*  get the position of last occurrence of a given element in a LinkedList */
        System.out.println(linkedList.lastIndexOf("ONE"));

    }
}
