package Collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        //Adding elements to HashSet
        set.add("BANGALORE");
        set.add("DELHI");
        set.add("CHENNAI");
        set.add("MUMBAI");
        set.add("AHMEDABAD");

        //getting set
        set.forEach(System.out::println);

        //getting synchronized set
        Set<String> syncSet = Collections.synchronizedSet(set);

        // HashSet with objects
        HashSet<Student> students=new HashSet<>();
        students.add(new Student("Avinash", 121, "ECE"));
        students.add(new Student("Bharat", 101, "EEE"));
        students.add(new Student("Malini", 151, "Civil"));
        students.add(new Student("Suresh", 200, "IT"));
        students.add(new Student("Vikram", 550, "CS"));
        students.add(new Student("Bharat", 301, "IT"));
        students.add(new Student("Amit", 301, "IT"));           //duplicate element
        students.add(new Student("Bhavya", 872, "ECE"));
        students.add(new Student("Naman", 301, "CS"));        //duplicate element
        students.add(new Student("Samson", 565, "Civil"));

        Iterator<Student> it=students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
