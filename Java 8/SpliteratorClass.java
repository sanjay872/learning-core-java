import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorClass {
    public static void main(String[] args) {
        /*
        * Suitable for parallel programming.
        * Using old iterator we can iterate only collection.
        * In the new one, we iterator even arrays , stream and list.
        * */

        //Spliterator from an array
       String[] languages=new String[]{"C++","C","Java","Python"};
       Spliterator<String> spliterator1=Arrays.spliterator(languages);

       //Spliterator from a list
       List<String> languagesArray= Arrays.asList("C++","C","Java","Python");
       Spliterator<String> spliterator2=languagesArray.spliterator();

       //Spliterator from Stream
        Stream<String> languagesStream=Stream.of("C++","Java","C","Python");
        Spliterator<String> spliterator3=languagesStream.spliterator();

        spliterator1.tryAdvance(System.out::println); // try advance is for performing an action on data returns C++
        spliterator1.forEachRemaining(System.out::println); // get remaining data return C Java Python
        Spliterator<String> anotherLanguageSpliterator = spliterator2.trySplit();
        System.out.println("From 1st Spliterator");
        System.out.println("------------------");
        spliterator2.forEachRemaining(System.out::println);
        System.out.println("From 2st Spliterator");
        System.out.println("------------------");
        anotherLanguageSpliterator.forEachRemaining(System.out::println);

        System.out.println(anotherLanguageSpliterator.estimateSize()); // estimates the total size

        System.out.println(spliterator3.getExactSizeIfKnown());       //Output : 4 - initial count
        spliterator3.tryAdvance(System.out::println);
        System.out.println(spliterator3.getExactSizeIfKnown());       //Output : 3 - after one iterate

        System.out.println(spliterator3.characteristics()); // 17488 - code of Characteristics
        System.out.println(spliterator3.hasCharacteristics(Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED)); // true

        try{
            System.out.println(spliterator3.getComparator());
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
