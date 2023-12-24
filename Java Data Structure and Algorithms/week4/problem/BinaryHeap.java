package week4.problem;

public class BinaryHeap<Item extends Comparable<Item>> {

    private Item[] tree;
    private int N=0;

    public BinaryHeap(int capacity){
        tree=(Item[]) new Comparable[capacity+1];
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){return N;}

    public void add(Item item){
        tree[++N]=item;
        swim(N);
    }

    public Item delMax(){
        Item max=tree[1];
        swap(1,--N);
        sink(1);
        tree[++N]=null; // prevent loitering
        return max;
    }
    public void swim(int k){
        while(k>1&&less(k/2,k)){
            swap(k/2,k);
            k=k/2;
        }
    }

    public void sink(int k){
        while(2*k<N){
            int j=k*2;
            if(j<N && less(j,j+1)) j++;
            if(!less(k,j))  break;
            swap(j,k);
            j=k;
        }
    }

    public boolean less(int a, int b){
        if(tree[a].compareTo(tree[b])>=0){
            return false;
        }
        return true;
    }

    public void swap(int a, int b){
        Item item=tree[a];
        tree[a]=tree[b];
        tree[b]=item;
    }
}
