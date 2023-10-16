import java.util.List;

public class VarLambda {
    public static void main(String[] args) {
        List<String> data=List.of("one","two","three");
        data.stream().filter(( var s)->s.length()>3).forEach(System.out::println);
    }
}
