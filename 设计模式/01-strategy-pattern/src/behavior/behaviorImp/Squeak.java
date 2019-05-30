package behavior.behaviorImp;

import behavior.QuackBeHavior;

public class Squeak implements QuackBeHavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
