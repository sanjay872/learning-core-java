package week2.assessments.dequesAndRandomizedQueues;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item>{

    private Node first;
    private Node last;
    private int n;

    private class Node{
        Item item;
        Node next;
    }

    public Deque(){
        first=null;
        last=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){return n;}

    public void addFirst(Item item){
        if(item==null){
            throw new IllegalArgumentException();
        }
        Node newNode=new Node();
        newNode.item=item;
        if(first==null){
            newNode.next=null;
            last=newNode;
        }
        else{
            newNode.next=first;
        }
        first=newNode;
        n+=1;
    }

    public void addLast(Item item){
        if(item==null){
            throw new IllegalArgumentException();
        }
        Node newNode=new Node();
        newNode.item=item;
        if(first==null||last==null){
            first=newNode;
        }
        else{
            last.next=newNode;
        }
        newNode.next=null;
        last=newNode;
        n+=1;
    }

    public Item removeFirst(){
        if(first==null){
            throw new NoSuchElementException();
        }
        Item item=first.item;
        first=first.next;
        n-=1;
        return item;
    }

    public Item removeLast(){
        if(last==null){
            throw new NoSuchElementException();
        }
        Item item=last.item;
        Node newLast=first;
        if(n>1) {
            while (newLast!=null&&newLast.next!=last){
                newLast=newLast.next;
            }
            last=newLast;
            if(last!=null)
                last.next=null;
        }
        else{
            first=last=null;
        }
        n-=1;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node ptr=first;
            @Override
            public boolean hasNext() {
                return ptr!=null;
            }

            @Override
            public Item next() {
                if(ptr==null){
                    throw new NoSuchElementException();
                }
                Item item=ptr.item;
                ptr=ptr.next;
                return item;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        Deque<Integer> deque=new Deque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.size();
        deque.removeFirst();
        deque.addLast(5);
        deque.removeFirst();
        deque.isEmpty();
        deque.removeFirst();
        deque.isEmpty();
        deque.addLast(10);
        deque.removeFirst();
        Iterator<Integer> iterator=deque.iterator();
        while(iterator.hasNext()){
            StdOut.println(iterator.next());
        }
    }
}
