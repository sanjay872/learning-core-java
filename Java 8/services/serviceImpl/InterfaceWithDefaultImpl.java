package services.serviceImpl;

import services.InterfaceWithDefault;

public class InterfaceWithDefaultImpl implements InterfaceWithDefault {

    @Override
    public void abstractMethod() {
        System.out.println("I am Abstract Method Impl");
    }
}
