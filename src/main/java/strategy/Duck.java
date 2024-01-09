package strategy;

public abstract class Duck {
    FlyBehaviour flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() { }
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehaviour f) {
        flyBehavior = f;
    }

    public void setQuackBehavior(QuackBehavior q) {
        quackBehavior = q;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}