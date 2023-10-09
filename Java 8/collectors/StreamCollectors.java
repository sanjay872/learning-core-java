package collectors;

import entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student( 11,"Paul",  78.9,"Economics"));
        studentList.add(new Student( 12,"Zevin",  91.2,"Computer Science"));
        studentList.add(new Student( 13, "Harish",  83.7, "History"));
        studentList.add(new Student( 14, "Xiano",  71.5,"Literature"));
        studentList.add(new Student( 15,"Soumya",  77.5,"Economics"));
        studentList.add(new Student( 16, "Asif",  89.4,"Mathematics"));
        studentList.add(new Student( 17, "Nihira",  84.6,"Computer Science"));
        studentList.add(new Student( 18, "Mitshu",  73.5,"History"));
        studentList.add(new Student(19, "Vijay",  92.8,"Mathematics"));
        studentList.add(new Student( 20, "Harry",  71.9, "History"));

        // collecting top 3 scored students
        //studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).forEach(System.out::println);

        // get all unique subject
        //studentList.stream().map(Student::getSpecialization).collect(Collectors.toSet()).forEach(System.out::println);

        //get name percentage for each student
//      Map<String,Double> nameAndMark=studentList.stream().collect(Collectors.toMap(Student::getName,Student::getPercentage));
//      System.out.println(nameAndMark);

        //get first 3 students in linked list
        //LinkedList<Student> studentLinkedList=studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList::new));
        //System.out.println(studentLinkedList);

        // get concatenated inputs
//        String allNames=studentList.stream().map(Student::getName).collect(Collectors.joining(","));
//        System.out.println(allNames);

        // count students
        //System.out.println(studentList.stream().collect(Collectors.counting()));

        //get the highest percentage
        //Optional<Double> highestPercentages=studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
        //System.out.println(highestPercentages);

        //get the lowest percentage
        //Optional<Double> lowestPercentages=studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));
        //System.out.println(lowestPercentages);

        // get sum
        //System.out.println(studentList.stream().collect(Collectors.summingDouble(Student::getPercentage)));

        // get average
        //System.out.println(studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage)));

        // get summarized data
        //System.out.println(studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage)));

        // group by
//        Map<String,List<Student>> groupedBySubjects=studentList.stream().collect(Collectors.groupingBy(Student::getSpecialization));
//        System.out.println(groupedBySubjects);

        // partitioning by
//        Map<Boolean,List<Student>> partitionedByPercentage=studentList.stream().collect(Collectors.partitioningBy(student -> student.getPercentage()>80));
//        System.out.println(partitionedByPercentage);

        //collecting and then
        List<Student> unModifiedList=studentList.stream().collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
        System.out.println(unModifiedList);


    }
}
