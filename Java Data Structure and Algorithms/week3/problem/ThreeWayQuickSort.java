package week3.problem;

import java.util.Arrays;

public class ThreeWayQuickSort {

    private void sort(Comparable[] a, int low, int high) {
        if (high<=low) return;
        int start = low, mid = low, end = high;
        Comparable v=a[low];
        while (mid <= end) {
            int cmp = a[mid].compareTo(v);
            if (cmp < 0) swap(a, start++, mid++);
            else if(cmp >0) swap(a,mid,end--);
            else mid++;
        }
        sort(a,low,start-1);
        sort(a,end+1,high);
    }

    private void swap(Comparable[] a, int i, int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }

    public static void main(String[] args) {
        ThreeWayQuickSort threeWayQuickSort=new ThreeWayQuickSort();
        Comparable[] a=new Comparable[]{2,31,25,2,515,63,63,12,65,74,53};
        threeWayQuickSort.sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
