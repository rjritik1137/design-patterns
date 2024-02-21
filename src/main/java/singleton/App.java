package singleton;

public class App {
        public static void main(String[] args)
        {
            int n = 4; // Number of threads
            for (int i = 0; i < n; i++) {
                Thread object = new Thread (){
                    @Override
                    public void run() {
                        super.run();
                        MyClass.getInstance();
                    }
                };
                object.start();
            }
        }
}
