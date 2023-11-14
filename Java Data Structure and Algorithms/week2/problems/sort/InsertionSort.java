package week2.problems.sort;

public class InsertionSort {
    public void sort(Comparable<Number>[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i;j>0;j--) {
                if(compare(a[j],a[j-1])){
                    swap(a,i,j);
                }
                else break;
            }
        }
    }
    private static boolean compare(Comparable a, Comparable b){
        if(a.compareTo(b)>0)
            return true;
        return false;
    }
    private static void swap(Comparable[] a, int i, int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }
}
