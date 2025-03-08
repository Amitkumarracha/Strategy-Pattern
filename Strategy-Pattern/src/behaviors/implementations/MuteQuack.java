package behaviors.implementations;

import behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {

        System.out.println("I am silent!");
    }
}
