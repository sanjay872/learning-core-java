import java.util.HashMap;
import java.util.List;

public class VarKeyword {

    // var g=10;  //it can't be globe variable and can't be used as arg in method

    public static void main(String[] args) {

        //before java 10
        int a=10;
        double b=10.12;
        System.out.println(a+b);

        //after java 10
        var c=10; // initialisation is must
        var d=10.12;
        //var ID = null;   //Cannot infer type for local variable initialized to 'null'
        System.out.println(c+d);

        //d="1"; //can't reassign it to different data type

        // moreover used to remove unwanted code, here adding type definition is avoided because of var.
        var studentToSubjectsMap = new HashMap<String, List<String>>();

        for (var entry : studentToSubjectsMap.entrySet())
        {
            var studentName = entry.getKey();

            var subjectsTaken = entry.getValue();
        }

        // var is not a reserved keyword, so it can be even defined as a variable name.

    }
}
