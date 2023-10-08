package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingOperations {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

//Sorting the names according to natural order

        names.stream().sorted().forEach(System.out::println);

        //sort by length
        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

    }
}
