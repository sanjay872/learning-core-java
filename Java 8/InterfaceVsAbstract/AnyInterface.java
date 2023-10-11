package InterfaceVsAbstract;

/*
    By default, interface fields are public, static and final
    Interface can have abstract method
* */
public interface AnyInterface {
    int i=10;
    void abstractMethod();
    default void defaultMethod(){
        System.out.println("default method");
    }
    static void staticMethod(){
        System.out.println("Static method");
    }
    //No constructors in an interface

    //No non-static and non-final variables in an interface

    //No private fields and methods in an interface

    //No protected fields and methods in an interface

    //No final methods in an interface
}
