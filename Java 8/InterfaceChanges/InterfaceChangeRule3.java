package InterfaceChanges;

public class InterfaceChangeRule3 implements InterfaceOne, InterfaceTwo, InterfaceThree{
    @Override
    public void defaultMethod() {
        InterfaceThree.super.defaultMethod();
    }

    public static void main(String args[]){
        new InterfaceChangeRule3().defaultMethod();
    }
}
