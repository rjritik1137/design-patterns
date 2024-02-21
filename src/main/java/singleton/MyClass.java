package singleton;

public class MyClass {
    private volatile static MyClass instance;
    private MyClass(){
        System.out.println("Instance created");
    }
    public static MyClass getInstance() {
        if(instance == null) {
            synchronized (MyClass.class) {
                if(instance == null) instance = new MyClass();
            }

        }
        return instance;
    }
}