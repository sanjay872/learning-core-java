package services;

public interface Interface1 {
    default void defaultMethod(){
        System.out.println("Default method from interface 1");
    }
}
