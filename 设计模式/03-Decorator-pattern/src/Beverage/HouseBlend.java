package Beverage;

import Abstract.Beverage;

/**
 * 烘焙咖啡
 *
 * @author MgBronya
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
