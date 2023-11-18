package week3.problem;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class MergeSort {
    final static int CUTOFF=7;
    private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high){

        for(int i=low;i<=high;i++){ // copy data
            aux[i]=a[i];
        }
        int i=low,j=mid+1;
        for(int k=low;k<=high;k++){ // merge data
            if(i>mid) a[k]=aux[j++];
            else if(j>high) a[k]=aux[i++];
            else if(less(aux[j],aux[i])) a[k]=aux[j++];
            else a[k]=aux[i++];
        }
    }
    private static void mergeImproved(Comparable[] a, Comparable[] aux, int low, int mid, int high){
        int i=low,j=mid+1;
        for(int k=low;k<=high;k++){ // merge data
            if(i>mid) aux[k]=a[j++];
            else if(j>high) aux[k]=a[i++];
            else if(less(a[j],a[i])) aux[k]=a[j++];
            else aux[k]=a[i++];
        }
    }

    public static void sort(Comparable[] a, Comparable[] aux, int low, int high){
        if(high<=low) return;
        int mid=low+ (high-low)/2;
        sort(a,aux,low,mid); // to split the first half
        sort(a,aux,mid+1,high); // to split the second half
        merge(a,aux,low,mid,high); // merge after splitting
    }

    public static void improvedSort(Comparable[] a, Comparable[] aux, int low, int high){
        if(high<=low+CUTOFF-1){
            Insertion.sort(a,low,high+1); // improves the speed by 20%. IMPROVEMENT.
            return;
        }
        int mid=low+ (high-low)/2;
        sort(a,aux,low,mid); // to split the first half
        sort(a,aux,mid+1,high); // to split the second half
        if(less(a[mid],a[mid+1])) return;
        merge(a,aux,low,mid,high); // merge after splitting
    }
    private static boolean less(Comparable a, Comparable b){
        if(a.compareTo(b)>0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MergeSort ms1=new MergeSort();
        Comparable[] a1=new Comparable[]{2,1,4,2,35,3,12,42,12,4};
        Comparable[] aux1=new Comparable[a1.length];

        Stopwatch sw1=new Stopwatch();
        ms1.sort(a1,aux1,0,a1.length-1);
        System.out.println("======================================================");
        System.out.println("Time taken by sort: "+sw1.elapsedTime());
        System.out.println("Its elements");
        Arrays.stream(a1).forEach(c->System.out.print(c+" "));
        System.out.println();
        System.out.println("======================================================");

        MergeSort ms2=new MergeSort();
        Comparable[] a2=new Comparable[]{2,1,4,2,35,3,12,42,12,4};
        Comparable[] aux2=new Comparable[a1.length];

        Stopwatch sw2=new Stopwatch();
        ms2.improvedSort(a2,aux2,0,a2.length-1);
        System.out.println("======================================================");
        System.out.println("Time taken by sort: "+sw2.elapsedTime());
        System.out.println("Its elements");
        Arrays.stream(a2).forEach(c->System.out.print(c+" "));
        System.out.println();
        System.out.println("======================================================");
    }
}
