package factory.simpleFactory;

public class OperatingSystemFactory {
    OperatingSystem getOs(String str) {
        if(str.equals("windows")) {
            return new Windows();
        }else if(str.equals("android")) return new Android();
        return null;
    }
}
