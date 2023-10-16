import java.util.*;

public class ImmutableCopyMethods {
    public static void main(String[] args) {

        // immutable list copy
        List<String> sportList = new ArrayList<String>();
        sportList.add("Hockey");
        sportList.add("Cricket");
        sportList.add("Tennis");
        List<String> immutableSportList = List.copyOf(sportList);

        System.out.println(immutableSportList);

        //immutableSportList.add("Football"); // throws error UnsupportedOperationException

        sportList.add("Football"); // no error, but this won't reflect in the immutableSportList

        System.out.println(sportList);
        System.out.println(immutableSportList);

        // immutable set copy
        Set<String> citySet = new HashSet<String>();
        citySet.add("Mumbai");
        citySet.add("New York");
        citySet.add("London");

        Set<String> immutableCitySet = Set.copyOf(citySet);
        System.out.println(citySet);       //Output : [New York, London, Mumbai]
        System.out.println(immutableCitySet);     //Output : [New York, Mumbai, London]

        //immutableCitySet.add("Colombo");      //It gives run-time error : UnsupportedOperationException
        citySet.add("Bangalore");       //It gives no error, but it will not be reflected in immutableCitySet

        System.out.println(citySet);      //Output : [New York, London, Mumbai, Bangalore]
        System.out.println(immutableCitySet);

        // immutable map copy
        Map<Integer, String> cityCodeMap = new HashMap<Integer, String>();

        cityCodeMap.put(111, "Mumbai");
        cityCodeMap.put(222, "New York");
        cityCodeMap.put(333, "London");

        Map<Integer, String> immutableCityCodeMap = Map.copyOf(cityCodeMap);

        System.out.println(cityCodeMap);     //Output : {333=London, 222=New York, 111=Mumbai}

        System.out.println(immutableCityCodeMap);     //Output : {333=London, 111=Mumbai, 222=New York}

        //immutableCityCodeMap.put(444, "Colombo");     //It gives run-time error : UnsupportedOperationException

        cityCodeMap.put(555, "Bangalore");    //It gives no error, but this entry will not be reflected in immutableCityCodeMap

        System.out.println(cityCodeMap);     //Output : {555=Bangalore, 333=London, 222=New York, 111=Mumbai}

        System.out.println(immutableCityCodeMap);     //Output : {333=London, 111=Mumbai, 222=New York}
    }
}
