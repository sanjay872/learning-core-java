package week2.problems.sort;

public class SelectionSort {
    public void sort(Comparable<Number>[] a){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(compare(a[i],a[j])){
                    min=j;
                }
            }
            swap(a,i,min);
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
