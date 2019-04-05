package Strategy.entity;

import Strategy.GoMethod.GoByFlyingFast;

public class Jet extends Vehicle {
    public Jet (){
        setGoAlgorithm(new GoByFlyingFast());
    }
}
