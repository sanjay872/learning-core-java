package InterfaceChanges;

import services.serviceImpl.InterfaceWithDefaultImpl;

public class InterfaceChanges {
    public static void main(String args[]){
        InterfaceWithDefaultImpl impl=new InterfaceWithDefaultImpl();
        impl.defaultMethod();
        impl.abstractMethod();
    }
}
