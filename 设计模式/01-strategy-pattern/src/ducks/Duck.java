package ducks;

import behavior.FlyBehavior;
import behavior.QuackBeHavior;

/**
 * @author MgBronya
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;

    public QuackBeHavior quackBeHavior;

    public abstract void display();

    public void performQuack() {
        quackBeHavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBeHavior(QuackBeHavior quackBeHavior) {
        this.quackBeHavior = quackBeHavior;
    }
}
