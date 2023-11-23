package week3.problem;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class KthLargestElement {

    public Comparable find(Comparable[] a,int k){
        StdRandom.shuffle(a);
        System.out.println(Arrays.toString(a));
        int low=0, high=a.length-1;
        while (high>low){
            int j=partition(a,low,high);
            System.out.println(j);
            if(j<k) low=j+1;
            else if(j>k) high=j-1;
            else return a[k];
        }
        return a[k];
    }

    private int partition(Comparable[] a, int pivot, int high){
        int start=pivot, end=high+1;
        while (true){
            while (less(a[++start],a[pivot])) if(start==high) break;
            while (less(a[pivot],a[--end])) if(end==pivot) break;
            if (start>=end) break;
            swap(a,start,end);
        }
        swap(a,pivot,end);
        System.out.println(Arrays.toString(a)+"==========");
        return end;
    }

    private boolean less(Comparable a, Comparable b){
        if(a.compareTo(b)>=0){
            return true;
        }
        return false;
    }

    private void swap(Comparable[] a, int i, int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }

    public static void main(String[] args) {
        KthLargestElement k=new KthLargestElement();
        Comparable[] a =new Comparable[]{4,21,5,2,5,61,3,431,6,7,67};
        //k.find(a,2);
        System.out.println(k.find(a,2)); // k starts from 0, for 1st largest element
    }
}
