package Strategy.entity;

import Strategy.GoMethod.GoByDrivingAlgorithm;

public class FomularOne extends Vehicle {
    public FomularOne(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
