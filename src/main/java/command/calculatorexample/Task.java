package command.calculatorexample;

public interface Task {
    double perform(double value);

    double undo(double value);
}
