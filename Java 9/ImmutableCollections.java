import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class ImmutableCollections {
    public static void main(String[] args) {

        // unmodifiable

//        List<String> sportsList=new ArrayList<>();
//        sportsList.add("Football");
//        sportsList.add("Cricket");
//        sportsList.add("Hockey");
//
//        List<String> unModifiableSportsList= Collections.unmodifiableList(sportsList);
//        Set<String> unModifiableSportsListSet=Collections.unmodifiableSet(new HashSet<>(sportsList));
//        System.out.println(sportsList);
//        System.out.println(unModifiableSportsList);
//        System.out.println(unModifiableSportsListSet);
//        sportsList.add("Tennis"); // unmodifiable list also will get updated
//        System.out.println(sportsList);
//        System.out.println(unModifiableSportsList);
//        unModifiableSportsList.add("new sport"); // this will throw error


        //Immutable are 100% immutable, they don't have original data like unmodifiable

        //List

        //Creating immutable list with three elements
        List<String> immutableSportList = List.of("Hockey", "Cricket", "Tennis");

        //Creating immutable list with five elements
        List<String> immutableNameList = List.of("John", "Michy", "Renu", "Arnold", "Srini");

        //Creating immutable list with seven elements
        List<Integer> immutableNumberList = List.of(1, 2, 3, 4, 5, 6, 7);

        // Set
        Set<String> immutableSportsListSet= Set.of("Hockey","Cricket","Cricket","Tennis","Hockey");

        // Map
        Map<Integer,String> immutableSportsListMap=Map.of(1,"Hockey",2,"Cricket",3,"Football");

    }
}
