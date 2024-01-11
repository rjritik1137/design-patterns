package decorator.beverage;

public class StarburstCoffee {
    public static void main(String args[]) {
        Beverage coffee = new Espresso();
        coffee = new Mocha(coffee);
        System.out.println("Coffee = " + coffee.getDescription() +  ", Coffee cost = " + coffee.cost());
        coffee = new Milk(coffee);
        System.out.println("Coffee = " + coffee.getDescription() +  ", Coffee cost = " + coffee.cost());
    }
}
