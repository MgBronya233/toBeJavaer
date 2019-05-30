package ducks;

import behavior.behaviorImp.FlyWithWings;
import behavior.behaviorImp.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBeHavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
