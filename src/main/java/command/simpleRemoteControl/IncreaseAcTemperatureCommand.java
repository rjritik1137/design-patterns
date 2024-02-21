package command.simpleRemoteControl;

public class IncreaseAcTemperatureCommand implements Command{
    AirConditioner ac;
    public IncreaseAcTemperatureCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.ac.increaseTemperature();
    }
}

