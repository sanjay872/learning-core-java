package streams;

import java.util.ArrayList;
import java.util.List;

public class SelectionOperations {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        names.add("Samontika");

        System.out.println("Filtered");
        names.stream().filter(n->n.length()>5).forEach(System.out::println);

        System.out.println("Unique Names");
        names.stream().distinct().forEach(System.out::println);

        System.out.println("Limits");
        names.stream().limit(2).forEach(System.out::println);

        System.out.println("Skipped");
        names.stream().skip(2).forEach(System.out::println);
    }
}
