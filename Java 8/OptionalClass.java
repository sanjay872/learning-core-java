import java.util.NoSuchElementException;
import java.util.Optional;

class Person{
    Optional<House> house;

    public Optional<House> getHouse(){
        return house;
    }
}
class House{
    private Optional<HouseLoan> houseLoan;
    private String houseType;

    public Optional<HouseLoan> getHouseLoan(){
        return houseLoan;
    }
    public String getHouseType(){
        return houseType;
    }
}
class HouseLoan{
    private Optional<String> houseLoanDetails;

    public Optional<String> getHouseLoanDetails(){
        return houseLoanDetails;
    }
}

public class OptionalClass {
    public static void main(String[] args) {

        // Instantiation
        Optional<House> house=Optional.empty(); // empty optional
        Optional<House> emptyHouse=Optional.of(new House()); // empty house object
        Optional<House> nonNullable=Optional.ofNullable(emptyHouse.get()); // if empty house is null, nonNullable will return empty

        //Extraction
        //house.get(); // to get the house object
        house.orElse(new House()); // if house is not there, create new house
        System.out.println(house.isPresent()); // check if the object is present
        house.orElseGet(()->new House());
        try {
            house.orElseThrow(()->new NoSuchElementException());
        }
        catch (Exception e){
            System.out.println("Got Exception");
        }

        //Mapping and filtering
        nonNullable.map((House::getHouseLoan));
        //nonNullable.flatMap(House::getHouseLoan).map(HouseLoan::getHouseLoanDetails);
        //nonNullable.filter((h)->h.getHouseType().equals("house")).flatMap(House::getHouseLoan).map(HouseLoan::getHouseLoanDetails);
    }
}
