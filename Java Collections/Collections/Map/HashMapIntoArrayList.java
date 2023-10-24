package Collections.Map;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapIntoArrayList {
    public static void main(String[] args) {

        HashMap<String,String> studentPerformanceMap=new HashMap<>();

        //Adding elements to HashMap
        studentPerformanceMap.put("John Kevin", "Average");
        studentPerformanceMap.put("Rakesh Sharma", "Good");
        studentPerformanceMap.put("Prachi D", "Very Good");
        studentPerformanceMap.put("Ivan Jose", "Very Bad");
        studentPerformanceMap.put("Smith Jacob", "Very Good");
        studentPerformanceMap.put("Anjali N", "Bad");

        // way 1 -> getting all key into array
        Set<String> studentsNames=studentPerformanceMap.keySet();
        ArrayList<String> studentsNamesInArray=new ArrayList<>(studentsNames);
        System.out.println(studentsNamesInArray);

        // way 2 -> getting all values into array
        Collection<String> studentsGrade=studentPerformanceMap.values();
        ArrayList<String> studentsGradeInArray=new ArrayList<>(studentsGrade);
        System.out.println(studentsGradeInArray);

        // way 3 -> getting all entry into array
        Set<Map.Entry<String,String>> studentsEntry=studentPerformanceMap.entrySet();
        ArrayList<Map.Entry<String,String>> studentEntryArray=new ArrayList<>(studentsEntry);
        System.out.println(studentEntryArray);

        // Above three ways in stream api
        studentPerformanceMap.keySet().stream().collect(Collectors.toList());
        studentPerformanceMap.values().stream().collect(Collectors.toList());
        studentPerformanceMap.entrySet().stream().collect(Collectors.toList());

    }
}
