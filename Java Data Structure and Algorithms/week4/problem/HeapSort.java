package week4.problem;

public class HeapSort {
    private BinaryHeap binaryHeap;

    public HeapSort(BinaryHeap binaryHeap){
        this.binaryHeap=binaryHeap;
    }

    public void sort(){
        int N=binaryHeap.size();
        for(int k=N/2;k>=1;k--){ // getting the max element on the top
            binaryHeap.sink(k);
        }
        while (N>1){
            binaryHeap.swap(1,N--); // sorting the tree by swapping largest to the last element and the reduce the N
            binaryHeap.sink(1); // get the second largest and swap it to the end of the array.
        }
    }
}
