package week2.problems.stack;

public class LinkedListStackOfStrings {
    private Node first=null;
    class Node{
        String data;
        Node next;
    }

    public void push(String data){
        Node oldNode=first;
        first=new Node();
        first.data=data;
        first.next=oldNode;
    }

    public String pop(){
        String data=first.data;
        first=first.next;
        return data;
    }

    public boolean isEmpty(){
        return first==null;
    }

}
