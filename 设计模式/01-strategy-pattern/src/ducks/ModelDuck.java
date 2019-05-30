package ducks;

import behavior.behaviorImp.FlyNoWay;
import behavior.behaviorImp.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBeHavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
