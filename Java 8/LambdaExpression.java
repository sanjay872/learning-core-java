import entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class LambdaExpression{
    public static void main(String args[]){
        List<Student> listOfStudents = new ArrayList<Student>();

        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));

        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));

        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));

        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));

        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));

        Comparator<Student> comparator= (student1,student2)-> (int) (student1.getPercentage()-student2.getPercentage());
        listOfStudents.sort(comparator);
        listOfStudents.forEach((s)->{
            System.out.println(s.getName());
        });
    }

}