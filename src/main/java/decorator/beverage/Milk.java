package decorator.beverage;

public class Milk extends CondimentDecorator{
    Beverage beverage;
    Milk(Beverage b) {
        beverage = b;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.90;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " milk";
    }
}
