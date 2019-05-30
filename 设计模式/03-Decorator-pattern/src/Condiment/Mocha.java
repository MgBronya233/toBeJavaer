package Condiment;

import Abstract.Beverage;
import Abstract.CondimentDecorator;

/**
 * 添加调料
 * 摩卡
 *
 * @author MgBronya
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
