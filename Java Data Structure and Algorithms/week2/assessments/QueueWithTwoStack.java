package week2.assessments;

import week2.problems.Generics.GenericStack;

public class QueueWithTwoStack {
    private final GenericStack<String> stack1;
    private final GenericStack<String> stack2;

    public QueueWithTwoStack(){
        stack1=new GenericStack<>();
        stack2=new GenericStack<>();
    }

    public void enQueue(String data){
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());
        stack1.push(data);
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

    public String deQueue(){
       return stack2.pop();
    }

    public boolean isEmpty(){
        return stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueWithTwoStack q=new QueueWithTwoStack();
        q.enQueue("1");
        q.enQueue("2");
        q.enQueue("3");
        q.enQueue("4");
        q.enQueue("5");

        q.deQueue();
        q.deQueue();

        q.enQueue("6");
        q.enQueue("7");

        while (!q.stack2.isEmpty()){
            System.out.println(q.stack2.pop());
        }
    }

}
