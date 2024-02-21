package command.calculatorexample;

public class Calculator {
    private double calculatedValue = 0;
    public void add(int value) {
        calculatedValue += value;
   }
   public void multiply(int value) {
        calculatedValue *= value;
   }
   public void subtract(int value){
        calculatedValue -= value;
   }
   public void divide(int value) {
        if(value == 0) {
            throw new ArithmeticException("/ by zero");
        }
        calculatedValue /= value;
   }

    public double getCalculatedValue() {
        return calculatedValue;
    }
}
