package streams;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreationOperations {
    public static void main(String[] args) {

        //Stream of Object
        Stream<Student> emptyStream=Stream.empty();
        System.out.println(emptyStream.count()); // 0

        Stream<Student> singleElementStream=Stream.of(new Student(1,"sanjay",100,""));
        System.out.println(singleElementStream.count()); // 1

        Stream<Integer> streamOfNumbers=Stream.of(1,2,3,4,5,6,7);
        System.out.println(streamOfNumbers.count()); // 7

        //Stream of Collections
        List<String> streamOfList=new ArrayList<>();
        streamOfList.add("One");
        streamOfList.add("Two");
        streamOfList.add("Three");
        streamOfList.stream().forEach(System.out::println);
    }
}
