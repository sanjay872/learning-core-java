import entity.Student;

import java.util.function.Function;
import java.util.function.Supplier;

//Shorthand for Lambda
public class MethodReference {
    public static void main(String args[]){

        //Static Reference
        Function<String,Integer> lambdaFunction=(String s)-> Integer.parseInt(s);
        System.out.println(lambdaFunction.apply("12"));

        Function<String,Integer> referenceFunction=Integer::parseInt;
        System.out.println(referenceFunction.apply("21"));

        //Class Reference
        Function<String, String> classMethodLambdaRef = (String s) -> s.toLowerCase();
        System.out.println(classMethodLambdaRef.apply("JAVA"));

         Function<String, String> classMethodMethodRef = String::toLowerCase;
        System.out.println(classMethodMethodRef.apply("JAVA"));


        //Instance Reference
        Function<Student,String> getNameByLambdaRef=(Student s)-> s.getName();
        System.out.println(getNameByLambdaRef.apply(new Student(1,"Luffy",100,"Rubber")));
        Function<Student,String> getNameByMethodRef=Student::getName;
        System.out.println(getNameByMethodRef.apply(new Student(2,"Zoro",100,"Sword")));

        //Constructor Reference
        Supplier<Student> newStudentByLambdaRef=()->new Student();
        Supplier<Student> newStudentByMethodRef=Student::new;

    }
}
