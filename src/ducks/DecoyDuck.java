package ducks;

import behaviors.implementations.NotFly;
import behaviors.implementations.Drown;
import behaviors.implementations.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new Drown();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I am a Decoy Duck!");
    }
}
