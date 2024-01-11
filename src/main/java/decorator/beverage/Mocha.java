package decorator.beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;
    Mocha(Beverage b) {
        beverage = b;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
