package behavior.behaviorImp;

import behavior.QuackBeHavior;

public class Quack implements QuackBeHavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
