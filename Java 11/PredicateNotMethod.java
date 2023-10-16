import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateNotMethod {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList(" ", "\t", "\n", "One", "Two", "Three");
        // get string that are blank
        listOfStrings.stream().filter(String::isBlank).forEach(System.out::println);
        // get string that are not blank
        listOfStrings.stream().filter(str->!str.isBlank()).forEach(System.out::println);

        // with not predicate
        listOfStrings.stream().filter(Predicate.not(String::isBlank)).forEach(System.out::println);
    }
}
