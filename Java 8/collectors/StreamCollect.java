package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {
        List<String> data= Arrays.asList("1","2","2","3","4","3","1");
        data.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
