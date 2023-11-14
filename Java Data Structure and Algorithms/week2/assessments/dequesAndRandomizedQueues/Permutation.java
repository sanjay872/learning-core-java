package week2.assessments.dequesAndRandomizedQueues;

import edu.princeton.cs.algs4.StdIn;

import java.util.Iterator;

public class Permutation {
    public static void main(String[] args) {
        String arg=args[0];
        int k=-1,pos=0;
        if(arg!=null){
            k=Integer.parseInt(arg);
        }
        RandomizedQueue<String> rq=new RandomizedQueue<>();
        while(!StdIn.isEmpty()){
            rq.enqueue(StdIn.readString());
        }
        Iterator<String> iterator1= rq.iterator();
        while (iterator1.hasNext()&&pos!=k) {
            System.out.println(iterator1.next());
            pos++;
        }
    }
}
