
interface InterfacePrivateMethod
{
    //Constant Variables

    int constantVariableOne = 10;
    int constantVariableTwo = 20;

    //Abstract Methods

    void abstractMethodOne();
    void abstractMethodTwo();

    //Default Method

    default void defaultMethod()
    {
        System.out.println("I am default method!!!");
    }

    //Static Method

    static void staticMethod()
    {
        System.out.println("I am static method!!!");
    }

    //Private Method - to hide it

    private void privatemethod()
    {
        System.out.println("I am private method!!!");
    }

    //Private Static Method - hide and single instance

    private static void privateStaticMethod()
    {
        System.out.println("I am private static method!!!");
    }
}