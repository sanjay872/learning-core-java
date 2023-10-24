package Collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {
    public static void main(String[] args) {

        /* Explain the different ways of creating HashMap in java */

        //1. Creating HashMap with default initial capacity and load factor
        HashMap<String, Integer> map1 = new HashMap<>();

        //2. Creating HashMap with 30 as initial capacity
        HashMap<String, Integer> map2 = new HashMap<>(30);

        //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor
        HashMap<String, Integer> map3 = new HashMap<>(30, 0.5f);

        //4. Creating HashMap by copying another HashMap
        HashMap<String, Integer> map4 = new HashMap<>(map1);

        /* How do you add key-value pairs to HashMap */

        //Inserting key-value pairs to map using put() method
        map4.put("ONE", 1);
        map4.put("TWO", 2);
        map4.put("THREE", 3);
        map4.put("FOUR", 4);
        map4.put("FIVE", 5);

        Set<Map.Entry<String,Integer>> entrySet=map4.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            System.out.println(stringIntegerEntry.getKey()+" "+stringIntegerEntry.getValue());
        }

        /* How do you add given key-value pair to HashMap if and only if it is not present in the HashMap */

        map4.putIfAbsent("ONE",1); // added the key if it is not present.

        /* How do you retrieve a value associated with a given key from the HashMap */
        System.out.println(map4.get("ONE"));

        /* How do you check whether a particular key/value exist in a HashMap */
        System.out.println(map4.containsKey("ONE")+" "+map4.containsValue(1));

        /* How do you find out the number of key-value mappings present in a HashMap */
        System.out.println(map4.size());

        /* How do you remove all key-value pairs from a HashMap? OR How do you clear the HashMap for reuse */
        map1.clear();

        /* How do you retrieve all keys present in a HashMap */
        System.out.println(map4.keySet());

        /* How do you retrieve all values present in a HashMap */
        System.out.println(map4.values());

        /* How do you retrieve all key-value pairs present in a HashMap */
        map4.entrySet();

        /* How do you remove a key-value pair from the HashMap */
        map4.remove("ONE");

        /* How do you remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value */
        map4.remove("TWO",2);

        /* How do you replace a value associated with a given key in the HashMap */
        map4.replace("THREE",6);

        /* How do you replace a value associated with the given key if and only if it is currently mapped to given value */
        map4.replace("THREE",6,3);

        /* How do you get synchronized HashMap in java */
        Map<String,Integer> syncMap= Collections.synchronizedMap(map4);
        syncMap.forEach((k,v)->{System.out.println(k+","+v);});
    }
}
