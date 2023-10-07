package InterfaceChanges;

public interface InterfaceThree {
    default void defaultMethod(){
        System.out.println("Default method from Interface three");
    }
}
