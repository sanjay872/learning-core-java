package InterfaceChanges;

public class InterfaceChangeRule1 extends ClassOne implements InterfaceOne,InterfaceTwo {
    public static void main(String args[]){
        new InterfaceChangeRule1().anyMethod();
    }
}
