package week2.problems.Generics;

public class GenericStack<Item> {

    private Node first=null;

    private class Node{
        Item data;
        Node next;
    }

    public void push(Item item){
        Node newNode=new Node();
        newNode.data=item;
        newNode.next=first;
        first=newNode;
    }

    public Item pop(){
        Item item=first.data;
        first=first.next;
        return item;
    }

    public boolean isEmpty(){
        return first==null;
    }

}
