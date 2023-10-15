import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {
    public static void main(String[] args) {
        // before java 7
        List<String> beforeJava7=new ArrayList<String>(); // need to mention type on both sides

        // after java 7
        List<String> afterJava7= new ArrayList<>(); // no need to mention type in array list
        List<String> afterJava7WithAnonymousInnerClasses=new ArrayList<String>(){ // need to mention type in the ArrayList
            @Override
            public boolean add(String s) {
                return super.add(s);
            }
        };

        // after java 9
        List<String> afterJava9= new ArrayList<>();
        List<String> afterJava9WithAnonymousInnerClasses=new ArrayList<>(){
            @Override
            public boolean add(String s) {
                return super.add(s);
            }
        };
    }
}
