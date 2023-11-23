package week3.assessment;

import week3.problem.QuickSort;

/*
* A disorganized carpenter has a mixed pile of n nuts and n bolts.
* The goal is to find the corresponding pairs of nuts and bolts.
* Each nut fits exactly one bolt and each bolt fits exactly one nut.
* By fitting a nut and a bolt together, the carpenter can see which one is bigger
* (but the carpenter cannot compare two nuts or two bolts directly).
* Design an algorithm for the problem that uses at most proportional to nlogn compares (probabilistically).
* */
public class NutsAndBolts {
    public static void main(String[] args) {
        QuickSort q=new QuickSort();
        Comparable[] nuts=new Comparable[]{2,4,7,1,3,5,6,8,9,10};
        Comparable[] bolts=new Comparable[]{1,3,5,7,9,10,6,8,2,4};
        q.sort(nuts);
        q.sort(bolts);
        for (Comparable nut : nuts) {
            System.out.print(nut+" ");
        }
        System.out.println();
        for (Comparable bolt : bolts) {
            System.out.print(bolt+" ");
        }
        // as the nuts and bolts are in same order, they can be combined
    }
}
