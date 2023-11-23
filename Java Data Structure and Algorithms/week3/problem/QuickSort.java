package week3.problem;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class QuickSort {

    public void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    private void sort(Comparable[] a, int low, int high) {
        if(high<=low) return;
        int j=partition(a,low,high);
        sort(a,low,j-1);
        sort(a,j+1,high);
    }
    private int partition(Comparable[] a, int pivot, int high ){ // low is the pivot, high is the end
        int start=pivot,end=high+1; // start is the start and end is the end
        while(true) {
            while (less(a[++start], a[pivot])) if (start == high) break;
            while (less(a[pivot],a[--end])) if (end == pivot) break;
            if (start >= end) break;
            swap(a, start, end);
        }
        swap(a,pivot,end);
        return end;
    }
    private boolean less(Comparable a, Comparable b){
        if(a.compareTo(b)>=0)
            return false;
        return true;
    }
    private void swap(Comparable[] a,int i,int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }

    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();
        Comparable[] a=new Comparable[]{4,21,5,2,5,61,3,431,6,7,67};
        quickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
