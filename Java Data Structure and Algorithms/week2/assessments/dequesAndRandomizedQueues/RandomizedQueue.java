package week2.assessments.dequesAndRandomizedQueues;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Node first;
    private int n;

    private class Node{
        Item item;
        Node next;
    }

    public RandomizedQueue(){
        first=null;
        n=0;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return n;
    }

    public void enqueue(Item item){
        if(item==null){
            throw new IllegalArgumentException();
        }
        Node newNode=new Node();
        newNode.item=item;
        newNode.next=first;
        first=newNode;
        n+=1;
    }

    public Item dequeue(){
        if(first==null)
            throw new NoSuchElementException();
        int rand;
        if(n==1)
            rand=1;
        else
            rand=StdRandom.uniformInt(n);
        Node start=first;
        Node prev=first;
        int pos=0;
        while(pos!=rand){
            prev=start;
            start=start.next;
            pos++;
        }
        Item item=first.item;
        if(start==null)
        {
            first=null;
        }
        else{
            prev.next=start.next;
            item=start.item;
        }
        n-=1;
        return item;
    }

    public Item sample(){
        if(first==null)
            throw new NoSuchElementException();
        int rand=StdRandom.uniformInt(1,n+1);
        Node start=first;
        int pos=1;
        while(pos!=rand){
            start=start.next;
            pos++;
        }
        return start.item;
    }


    @Override
    public Iterator<Item> iterator() {
        int[] order=new int[n];
        for(int i=1;i<=n;i++){
            order[i-1]=i;
        }
        StdRandom.shuffle(order);
       return new Iterator<Item>() {
           Node start=first;
           int showed=0;
           @Override
           public boolean hasNext() {
               return showed!=n;
           }

           @Override
           public Item next() {
               if(start==null)
                   throw new NoSuchElementException();
               int pos=1;
               while(pos!=order[showed])
               {
                   start=start.next;
                   pos++;
               }
               showed++;
               Item item=start.item;
               start=first;
               return item;
           }

           @Override
           public void remove() {
               throw new UnsupportedOperationException();
           }
       };
    }

    public static void main(String[] args) {
        RandomizedQueue<String> rq=new RandomizedQueue<>();
        rq.enqueue("1");
        rq.dequeue();
        rq.enqueue("2");
        rq.enqueue("3");
        rq.dequeue();
        rq.dequeue();
        rq.enqueue("4");
        rq.dequeue();
        rq.enqueue("5");
        rq.enqueue("6");
        rq.enqueue("7");
        rq.enqueue("8");
        rq.dequeue();
        rq.enqueue("9");

        System.out.println(rq.sample());
        System.out.println(rq.size());
        Iterator<String> iterator1=rq.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Iterator<String> iterator2=rq.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
