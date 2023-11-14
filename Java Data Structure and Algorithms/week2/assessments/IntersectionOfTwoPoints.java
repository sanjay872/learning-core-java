package week2.assessments;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoPoints {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        Set<Integer> set2=new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(9);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        intersection.forEach(System.out::println);
    }
}
