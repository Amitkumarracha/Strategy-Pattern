package ducks;

import behaviors.implementations.NotFly;
import behaviors.implementations.Float;
import behaviors.implementations.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new Float();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
}
