package ducks;

import behaviors.FlyBehavior;
import behaviors.SwimBehavior;
import behaviors.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display(); // Method to display the type of duck

    // Setters for dynamically changing behaviors
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setSwimBehavior(SwimBehavior sb) {
        swimBehavior = sb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    // Performing behaviors
    public void performFly() {
        flyBehavior.fly();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
