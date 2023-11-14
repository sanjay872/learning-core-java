package week2.assessments;

public class FindMaxValueInStack {
    private Node first=null;
    private int MAX_VALUE = Integer.MIN_VALUE;
    class Node{
        Integer data;
        Node next;
    }

    public void push(Integer data){
        Node oldNode=first;
        first=new Node();
        first.data=data;
        first.next=oldNode;
        if(data>MAX_VALUE){
            MAX_VALUE=data;
        }
    }

    public Integer pop(){
        Integer data=first.data;
        first=first.next;
        return data;
    }

    public Integer getMaxValue(){
        return MAX_VALUE;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public static void main(String[] args) {
        FindMaxValueInStack s=new FindMaxValueInStack();
        s.push(10);
        s.push(14);
        s.push(100);
        s.push(1);
        s.push(13);
        System.out.println(s.getMaxValue());
    }
}
