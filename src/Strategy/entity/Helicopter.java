package Strategy.entity;

import Strategy.GoMethod.GoByFlying;

public class Helicopter extends Vehicle {
    public Helicopter(){
        setGoAlgorithm(new GoByFlying());
    }
}
