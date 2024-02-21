package command.calculatorexample;

public class Divide implements Task{
    double value;
    public Divide(double value){
        this.value = value;
    }
    @Override
    public double perform(double value) {
        return value / this.value;
    }

    @Override
    public double undo(double value) {
        return value * this.value;
    }
}
