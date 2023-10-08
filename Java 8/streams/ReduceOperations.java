package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ReduceOperations {
    public static void main(String[] args) {
        //Reduce
        int[] data=new int[]{1,2,3,4,5,6};
        int sum= Arrays.stream(data).reduce(0,(a,b)->a+b);
        OptionalInt optionalSum=Arrays.stream(data).reduce((a,b)->a+b);
        System.out.println(sum+" "+optionalSum.getAsInt());

        //min
        System.out.println(Arrays.stream(data).min());

        //max
        System.out.println(Arrays.stream(data).max());

        //count
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        //Counting the names with length > 5
        long noOfBigNames = names.stream().filter((String name) -> name.length() > 5).count();
        System.out.println(noOfBigNames);

        //collect
        List<String> first3Names=names.stream().limit(3).collect(Collectors.toList());
        System.out.println(first3Names);

        // any match
        if(names.stream().anyMatch((String name) -> name.length() == 5))
        {
            System.out.println("Yes... There is a name exist with 5 letters");
        }

        // all match
        if(names.stream().allMatch((String name) -> name.length() > 5))
        {
            System.out.println("All are big names");
        }

        //none match
        if(names.stream().noneMatch((String name) -> name.length() > 10))
        {
            System.out.println("None are super big name");
        }

        //findFirst
        System.out.println(names.stream().findFirst());

        //find any pick a random
        System.out.println(names.stream().findAny());

    }
}
