package InterfaceChanges;

public interface InterfaceOne {
    default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }
}
