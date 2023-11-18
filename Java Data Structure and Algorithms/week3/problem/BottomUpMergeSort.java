package week3.problem;

import java.util.Arrays;

public class BottomUpMergeSort {

    private void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high){
        for(int i=0;i<aux.length;i++){
            aux[i]=a[i];
        }
        int j=low,k=mid+1;
        for(int i=low;i<=high;i++){
            if(j>mid) a[i]=aux[k++];
            else if(k>high) a[i]=aux[j++];
            else if(less(aux[j],aux[k])) a[i]=aux[j++];
            else a[i]=aux[k++];
        }
    }

    public void sort(Comparable[] a, Comparable[] aux, int low, int high){
        if(high<=low) return;
        int mid=low+(high-low)/2;
        sort(a,aux,low,mid);
        sort(a,aux,mid+1,high);
        merge(a,aux,low,mid,high);
    }

    public void sortWithoutRecursion(Comparable[] a){
        int n=a.length;
        Comparable[] aux=new Comparable[n];
        for(int i=1;i<n;i+=i){
            for(int j=0;j<n-i;j+=i+i){
                merge(a,aux,j,i+j-1,Math.min(j+i+i-1,a.length-1));
            }
        }
    }

    private boolean less(Comparable a, Comparable b){
        if(a.compareTo(b)>0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        BottomUpMergeSort b=new BottomUpMergeSort();
        Comparable[] a=new Comparable[]{2,31,23,5,2,1,4,2,6,73};
        Comparable[] aux=new Comparable[a.length];
        //b.sort(a,aux,0,a.length-1);
        b.sortWithoutRecursion(a);
        System.out.println(Arrays.toString(a));
    }
}
