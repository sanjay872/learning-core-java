package InterfaceChanges;

class ClassOne implements InterfaceOne, InterfaceTwo
{
    @Override
    public void anyMethod()
    {
        System.out.println("Hi... From Class One");
    }
}
