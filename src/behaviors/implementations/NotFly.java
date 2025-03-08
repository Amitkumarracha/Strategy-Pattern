package behaviors.implementations;

import behaviors.FlyBehavior;

public class NotFly implements FlyBehavior {
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
