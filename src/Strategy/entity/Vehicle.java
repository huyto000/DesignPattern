package Strategy.entity;

import Strategy.GoMethod.GoAlgorithm;

public abstract class Vehicle implements GoAlgorithm {
    private GoAlgorithm goAlgorithm;

    public void setGoAlgorithm(GoAlgorithm goAlgorithm){
        this.goAlgorithm = goAlgorithm;
    }

    @Override
    public void go() {
        goAlgorithm.go();
    }
}
