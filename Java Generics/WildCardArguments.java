import java.util.ArrayList;

public class WildCardArguments {

    // with unknown type
    static void printData(ArrayList<?> a){
        for (Object o : a) {
            System.out.println(o);
        }
    }

    // with upper bound
    static void printDataWithUpperBound(ArrayList<? extends Number> a){
        for (Object o : a) {
            System.out.println(o);
        }
    }

    // with lower bound
    static void printDataWithLowerBound(ArrayList<? super Integer> a){
        for (Object o : a) {
            System.out.println(o);
        }
    }


    public static void main(String[] args) {

        /* Wildcard Arguments With An Unknown Type  */

        ArrayList<String> strings=new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(12);
        integers.add(13);
        integers.add(24);
        integers.add(42);

        ArrayList<Double> doubles=new ArrayList<>();
        doubles.add(12.1);
        doubles.add(13.2);
        doubles.add(24.3);
        doubles.add(42.3);

        WildCardArguments.printData(strings);
        WildCardArguments.printData(integers);

        /* Wildcard Arguments With An Upper Bound */

        WildCardArguments.printDataWithUpperBound(integers);
        WildCardArguments.printDataWithUpperBound(doubles);
        //WildCardArguments.printDataWithUpperBound(strings); // won't work

        /* Wildcard Arguments With Lower Bound */
        WildCardArguments.printDataWithLowerBound(integers);
        //WildCardArguments.printDataWithLowerBound(doubles); // won't work

    }
}
