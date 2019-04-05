package Strategy.test;

import Strategy.entity.*;

public class Main {
    public static void main(String[] args) {
        Vehicle streetRacer = new StreetRacer();
        Vehicle fomularone = new FomularOne();
        Vehicle helicopter = new Helicopter();
        Vehicle jet = new Jet();
       streetRacer.go();
       fomularone.go();
       helicopter.go();
       jet.go();
    }
}
