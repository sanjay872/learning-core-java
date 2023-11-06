package week2.problems.stack;

public class FixedListStackOfStrings {
    private String[] stack;
    private int N=0;

    public FixedListStackOfStrings(int capacity){
        stack=new String[capacity];
    }

    public void push(String data){
        stack[N++]=data;
    }

    public String pop(){
        String data=stack[--N];
        stack[N]=null;
        return data;
    }

    public boolean isEmpty(){
        return N==0;
    }

}
