package week4.problem;

import java.util.Iterator;

public class UnOrderedMaxPQ<Key extends Comparable<Key>>{
    private Key[] pq;
    private int N;

    public UnOrderedMaxPQ(int capacity){
        pq=(Key[]) new Comparable[capacity];
    }

    public boolean isEmpty(){
        return N==0;
    }

    public void insertKey(Key item){
        pq[N++]=item;
    }

    public Key deMax(){
        int max=0;
        for(int i=1;i<N;i++){
            if(less(max,i)) max=i;
        }
        swap(max,N-1);
        return pq[--N];
    }

    private boolean less(int a, int b){
        if(pq[a].compareTo(pq[b])>=0){
            return false;
        }
        return true;
    }

    private void swap(int a, int b){
        Key swap=pq[a];
        pq[a]=pq[b];
        pq[b]=swap;
    }
}
