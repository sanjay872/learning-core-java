package Collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        // as queue
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

        //Adding elements at the tail of arrayDeque
        arrayDeque.offer("One");
        arrayDeque.offer("Two");
        arrayDeque.offer("Three");
        arrayDeque.offer("Four");
        arrayDeque.offer("Five");

        //Printing the elements of arrayDeque
        System.out.println(arrayDeque);     //Output : [One, Two, Three, Four, Five]

        //Removing the elements from the head of arrayDeque
        System.out.println(arrayDeque.poll());    //Output : One
        System.out.println(arrayDeque.poll());    //Output : Two


        //Creating an array deque as stack
        ArrayDeque<String> arrayDequeAsStack = new ArrayDeque<String>();

        //pushing elements into arrayDeque
        arrayDequeAsStack.push("One");
        arrayDequeAsStack.push("Two");
        arrayDequeAsStack.push("Three");
        arrayDequeAsStack.push("Four");
        arrayDequeAsStack.push("Five");

        //Printing the elements of arrayDeque
        System.out.println(arrayDequeAsStack);     //Output : [Five, Four, Three, Two, One]

        //popping up the elements from arrayDeque
        System.out.println(arrayDequeAsStack.pop());    //Output : Five

        System.out.println(arrayDequeAsStack.pop());    //Output : Four

    }
}
