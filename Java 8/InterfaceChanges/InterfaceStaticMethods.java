package InterfaceChanges;

public class InterfaceStaticMethods implements InterfaceWithStaticAndDefaultMethods{

    @Override
    public void abstractMethod() {
        System.out.println("Impl of abstract method from class");
    }

    public static void main(String args[]){
        InterfaceWithStaticAndDefaultMethods.staticMethod();
        new InterfaceStaticMethods().abstractMethod();
    }
}
