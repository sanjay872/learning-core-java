package services;

public interface InterfaceWithDefault {
    void abstractMethod();

    default void defaultMethod(){
        System.out.println("I am default method");
    }
}
