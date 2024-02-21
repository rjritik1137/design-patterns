package command.calculatorexample;

public class Add implements Task{
    double value;
    Add(double value) {
        this.value = value;
    }
    @Override
    public double perform(double value) {
        return value + this.value;
    }

    @Override
    public double undo(double value) {
        return value - this.value;
    }
}
