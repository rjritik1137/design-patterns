package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        // set the behaviour at run time
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        // modify the behaviour at run time, this would have been possible if the behaviour was written inside the duck class.
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();
    }
}
