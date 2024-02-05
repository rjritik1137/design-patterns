package factory.simpleFactory;

public class Windows implements OperatingSystem{
    @Override
    public void printSpecs() {
        System.out.println("Windows");
    }
}
