package Condiment;

import Abstract.Beverage;
import Abstract.CondimentDecorator;

/**
 * 添加调料
 * 奶泡
 *
 * @author MgBronya
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Whip ";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
