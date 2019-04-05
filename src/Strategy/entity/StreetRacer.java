package Strategy.entity;

import Strategy.GoMethod.GoByDrivingAlgorithm;

public class StreetRacer extends Vehicle {

    public StreetRacer(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }

}
