package Collections.set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

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
    }
}
