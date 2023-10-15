import java.util.Optional;

public class OptionalImprovements {
    public static void main(String[] args) {

        //Optional object with a value
        Optional<String> optionalAddress_1 = Optional.of("Address_1");

        // if present or else
        optionalAddress_1.ifPresentOrElse(System.out::println,()->System.out.println("Address not found"));

        // or
        //optionalAddress_1=Optional.empty();
        Optional<String> optional = optionalAddress_1.or(() -> Optional.of("No Address"));
        System.out.println(optional.get());

        // stream
        optionalAddress_1.stream().forEach(System.out::println);
    }
}
