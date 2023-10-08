package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OtherOperations {
    public static void main(String[] args) {
        //for each
        Stream.of("First", "Second", "Second", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);

        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");

        //Storing first 3 names in an array

        Object[] streamArray = names.stream().limit(3).toArray();
        System.out.println(Arrays.toString(streamArray));

        //peek
        names.stream()
                .filter(name -> name.length() > 5)
                .peek(e -> System.out.println("Filtered Name :"+e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped Name :"+e))
                .toArray();

    }
}
