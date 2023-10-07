package InterfaceChanges;

public interface InterfaceWithStaticAndDefaultMethods {
    void abstractMethod();           //Abstract Method

    default void defaultMethod()
    {
        System.out.println("It is a default method");
    }

    static void staticMethod()
    {
        System.out.println("It is a static method");
    }
}
