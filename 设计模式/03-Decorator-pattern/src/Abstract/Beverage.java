package Abstract;

/**
 * 模拟星巴克咖啡添加调料
 *
 * 基础类，饮料
 * @author MgBronya
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
