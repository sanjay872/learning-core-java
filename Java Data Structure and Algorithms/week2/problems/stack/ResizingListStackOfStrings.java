package week2.problems.stack;

public class ResizingListStackOfStrings {
    private String[] stack;
    private int N=0;

    public ResizingListStackOfStrings(int capacity){
        stack=new String[capacity];
    }

    public void push(String data){
        //if(N==stack.length) resize(stack.length*2); // non-Amortized, meaning - more space wastage and more operations
        if(N>0&&N==stack.length/4) resize(stack.length/4); // Amortized, meaning - less space and operations
        stack[N++]=data;
    }

    public String pop(){
        String data=stack[--N];
        stack[N]=null;
        return data;
    }

    private void resize(int capacity){
        String[] copy=new String[capacity];
        if (N >= 0) System.arraycopy(stack, 0, copy, 0, N);
        stack=copy;
    }

    public boolean isEmpty(){
        return N==0;
    }
}
