import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingMapsWithSameKey {
    public static void main(String[] args) {
        /*
            Four was to Merge two maps having same key into a new map
            1. Map.merge()
            2. Stream.concat()
            3. Stream.of() and flatMap()
            4. Stream pipeline()
        * */

        //Map-1

        HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();

        subjectToStudentCountMap1.put("Maths", 45);
        subjectToStudentCountMap1.put("Physics", 57);
        subjectToStudentCountMap1.put("Chemistry", 52);
        subjectToStudentCountMap1.put("History", 41);

        //Map-2

        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();

        subjectToStudentCountMap2.put("Economics", 49);
        subjectToStudentCountMap2.put("Maths", 42);
        subjectToStudentCountMap2.put("Biology", 41);
        subjectToStudentCountMap2.put("History", 55);

        //Merging Map-1 and Map-2 into Map-3
        //If any two keys are found same, their values are added

        HashMap<String, Integer> subjectToStudentCountMap3 = new HashMap<>(subjectToStudentCountMap1);

        //Way 1
        subjectToStudentCountMap2.forEach((key,value)->{subjectToStudentCountMap3.merge(key,value,(v1,v2)->v1+v2);});
        System.out.println(subjectToStudentCountMap3);

        //Way 2
        HashMap<String,Integer> subjectToStudentMap= Stream
                .concat(subjectToStudentCountMap1.entrySet().stream(),subjectToStudentCountMap2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v1,v2)->v1+v2, LinkedHashMap::new));
        System.out.println(subjectToStudentMap);

        //Way 3
        HashMap<String,Integer> subjectToStudentMapByFlatMap=Stream
                .of(subjectToStudentCountMap1,subjectToStudentCountMap2)
                .flatMap(map->map.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,Integer::sum,LinkedHashMap::new));
        System.out.println(subjectToStudentMapByFlatMap);

        //Way 4
        HashMap<String,Integer> subjectToStudentMapByPipeline=subjectToStudentCountMap1
                .entrySet().
                stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v1,v2)->v1>v2?v2:v1,()->new HashMap<>(subjectToStudentCountMap2)));
        System.out.println(subjectToStudentMapByPipeline);
    }
}
