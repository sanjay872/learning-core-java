package week2.problems.queue;

public class LinkedListQueueOfStrings {

    private Node first=null;
    private Node last=null;

    class Node{
        String data;
        Node next;
    }

    public void enQueue(String data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        if(isEmpty()) {
            first = newNode;
        }
        else{
            first.next=newNode;
        }
        last = newNode;
    }

    public String deQueue(){
        String data=first.data;
        first=first.next;
        if (isEmpty()) last=null;
        return data;
    }

    public boolean isEmpty(){
        return first==null;
    }
}
