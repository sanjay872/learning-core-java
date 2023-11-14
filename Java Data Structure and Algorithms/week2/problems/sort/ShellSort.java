package week2.problems.sort;

public class ShellSort {
    public void sort(Comparable<Number>[] a){

        int N=a.length;
        int h=1;
        while(h<N/3) h=3*h-1; // 1, 4, 13, 40, 121, 364, .......

        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&compare(a[j],a[j-h]);j-=h) swap(a,i,j);
            }
            h=h/3;
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
