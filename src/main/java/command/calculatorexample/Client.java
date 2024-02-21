package command.calculatorexample;

public class Client {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.add(10);
//        System.out.println(calculator.getCalculatedValue());
//        calculator.multiply(4);
//        System.out.println(calculator.getCalculatedValue());
//        calculator.subtract(10);
//        System.out.println(calculator.getCalculatedValue());
//        calculator.divide(10);
//        System.out.println(calculator.getCalculatedValue());
//        calculator.divide(1);
//        System.out.println(calculator.getCalculatedValue());

        BetterCalculator betterCalculator = new BetterCalculator();
        betterCalculator.execute(new Add(23));
        System.out.println(betterCalculator.getCalculatedValue());
        betterCalculator.execute(new Divide(2));
        System.out.println(betterCalculator.getCalculatedValue());
        betterCalculator.undo();
        System.out.println(betterCalculator.getCalculatedValue());
        betterCalculator.execute(new Divide(3));
        System.out.println(betterCalculator.getCalculatedValue());
        betterCalculator.execute(new Add(23));
        System.out.println(betterCalculator.getCalculatedValue());
        betterCalculator.execute(new Divide(2));
        System.out.println(betterCalculator.getCalculatedValue());
        betterCalculator.undo();
        System.out.println(betterCalculator.getCalculatedValue());
    }
}
