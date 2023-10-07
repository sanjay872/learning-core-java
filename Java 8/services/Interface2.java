package services;

public interface Interface2 {
    default void defaultMethod(){
        System.out.println("Default method from Interface2");
    }
}
