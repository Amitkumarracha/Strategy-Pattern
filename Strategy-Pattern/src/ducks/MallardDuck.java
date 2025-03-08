package ducks;

import behaviors.implementations.FlyWithWings;
import behaviors.implementations.Swim;
import behaviors.implementations.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        swimBehavior = new Swim();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a Mallard Duck!");
    }
}
