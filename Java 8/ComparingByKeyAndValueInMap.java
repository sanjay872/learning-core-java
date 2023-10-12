import java.util.*;
import java.util.stream.Collectors;

public class ComparingByKeyAndValueInMap {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);

        /*
        Sorted by key
        * 1. Convert map into entry set.
        * 2. Convert entry set into stream.
        * 3. Sort it by passing Entry.comparingByKey().
        * 4. Collect data into LinkedHashMap to maintain the order of insertion.

        Ways of adding sorting:
        1) default ascending sort by Map.Entry.comparingByKey().
        2) reversed sort by:
            sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
             OR
             sorted(Entry.comparingByKey(Comparator.reverseOrder()))
         3) custom sort:
            Map.Entry.comparingByKey(Comparator.comparingInt(String::length)) - sort by length of key
        * */
        Map<String,Integer> studentsSortedByKey=studentMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                //reverse order
                    //.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                    //  OR
                    // .sorted(Entry.comparingByKey(Comparator.reverseOrder()))
                // using customized comparator
                    //.sorted(Map.Entry.comparingByKey(Comparator.comparingInt(String::length)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2, LinkedHashMap::new));
        System.out.println(studentsSortedByKey);

        /*
        Sorted by value
        * 1. Convert map into entry set.
        * 2. Convert entry set into stream.
        * 3. Sort it by passing Entry.comparingByValue().
        * 4. Collect data into LinkedHashMap to maintain the order of insertion.

        Ways of adding sorting:
        1) default ascending sort by Map.Entry.comparingByKey().
        2) reversed sort by:
            sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
             OR
             sorted(Entry.comparingByKey(Comparator.reverseOrder()))
         3) custom sort:
            Map.Entry.comparingByKey(Comparator.comparingInt(String::length)) - sort by length of key
        * */
        Map<String,Integer> studentSortedByValue=studentMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
        System.out.println(studentSortedByValue);

    }
}
