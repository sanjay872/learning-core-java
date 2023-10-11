package InterfaceVsAbstract;

abstract class AbstractClass {
    private int a;          //Abstract class can have private field

    protected int b;        //Abstract class can have protected field

    public int c;           //Abstract class can have public field

    static int d;           //Abstract class can have static field

    final int e = 10;       //Abstract class can have final field

    int f;                  //Abstract class can have non-static and non-final field

    public void anyAbstractClass()
    {
        System.out.println("Abstract class can have constructors");
    }

    abstract void abstractmethod();    //Abstract class can have abstract method

    private static void staticMethod()
    {
        System.out.println("Abstract class can have private and static method");
    }

    public void nonStaticMethod()
    {
        System.out.println("Abstract class can have public and non-static method");
    }

    protected void protectedMethod()
    {
        System.out.println("Abstract class can have protected method");
    }

    final void finalMethod()
    {
        System.out.println("Abstract class can have final method");
    }

    //No default method in an abstract class

}
