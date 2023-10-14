import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsImprovements {
    public static void main(String[] args) {

        //Take while
        //IntStream.of(1,2,3,4,5,6,7,8,9,10).takeWhile(i->i<5).forEach(System.out::println); // in sorted order, prints till 4
        //IntStream.of(11,21,1,22,3,4,5,6,7,8,9,10).takeWhile(i->i<5).forEach(System.out::println); // in non-sorted order, returns empty

        // Drop while
        //IntStream.of(1,2,3,4,5,6,7,8,9,10).dropWhile(i->i<5).forEach(System.out::println); // in sorted order, prints from 5
        //IntStream.of(11,4,3,1,2,3,4,5,6,7,8,9,10).dropWhile(i->i<5).forEach(System.out::println); // in non-sorted order, returns all values

        //ofNullable
        //long count = Stream.ofNullable(25).count();   //Non-null element
        //System.out.println(count);                  //Output : 1
        //count = Stream.ofNullable(null).count();    //Null element
        //System.out.println(count);

        //iterate() this already, but it got updated now - takes an extra argument hasNext of type Predicate which decides when to terminate the operation
        Stream
                .iterate(1,i->i<=1000,i->i*10) // start, end condition, iterate condition
                .forEach(System.out::println);
    }
}
