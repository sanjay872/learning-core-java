package Collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(11);
        queue.offer(12);
        queue.add(13);
        queue.add(10);

        System.out.println(queue.poll()); // by default in ascending order data is polled

        //with customized comparator
        PriorityQueue<Employee> pQueue = new PriorityQueue<Employee>(7, Comparator.comparingInt((Employee e) -> e.salary));
        pQueue.add(new Employee("emp 1",1000));
        pQueue.add(new Employee("emp 2",100));
        pQueue.add(new Employee("emp 3",3000));
        pQueue.add(new Employee("emp 4",1400));
        pQueue.add(new Employee("emp 5",2000));
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
    }
}
