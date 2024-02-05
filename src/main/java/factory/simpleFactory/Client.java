package factory.simpleFactory;

import java.util.Calendar;

public class Client {
    public static void main(String []args) {
       OperatingSystemFactory factory = new OperatingSystemFactory();
       OperatingSystem os = factory.getOs("windows");
       os.printSpecs();
       os = factory.getOs("android");
       os.printSpecs();
    }
}
