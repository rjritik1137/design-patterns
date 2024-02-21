package command.calculatorexample;

import java.util.ArrayList;
import java.util.List;

public class BetterCalculator {
    private double calculatedValue = 0;
    private final List<Task> executedTask = new ArrayList<Task>();
    public void execute(Task task){
        calculatedValue = task.perform(calculatedValue);
        executedTask.add(task);
    }
    public void undo() {
        if(!executedTask.isEmpty()) {
            Task lastTask = executedTask.remove(executedTask.size() - 1);
            calculatedValue = lastTask.undo(calculatedValue);
        }
    }

    public double getCalculatedValue() {
        return calculatedValue;
    }
}
