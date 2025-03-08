// Name: Amitkumar Racha
// PRN:  24070126501
// Batch: A1 (2023-27)
package main;

import ducks.*;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redHead = new RedHeadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        System.out.println("----- Mallard Duck -----");
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.performSwim();

        System.out.println("\n----- RedHead Duck -----");
        redHead.display();
        redHead.performQuack();
        redHead.performFly();
        redHead.performSwim();

        System.out.println("\n----- Rubber Duck -----");
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        rubber.performSwim();

        System.out.println("\n----- Decoy Duck -----");
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        decoy.performSwim();
    }
}
