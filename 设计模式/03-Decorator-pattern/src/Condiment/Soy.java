package Condiment;

import Abstract.Beverage;
import Abstract.CondimentDecorator;

/**
 * 添加调料
 * 豆浆
 *
 * @author MgBronya
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Soy";
    }

    @Override
    public double cost() {
        return .99 + beverage.cost();
    }
}
