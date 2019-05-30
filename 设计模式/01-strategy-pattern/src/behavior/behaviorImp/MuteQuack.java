package behavior.behaviorImp;

import behavior.QuackBeHavior;

public class MuteQuack implements QuackBeHavior {
    @Override
    public void quack() {
        System.out.println("<< Slience >>");
    }
}
