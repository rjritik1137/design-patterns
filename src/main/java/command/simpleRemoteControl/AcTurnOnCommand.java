package command.simpleRemoteControl;

public class AcTurnOnCommand implements Command{
    AirConditioner ac;
    public AcTurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.ac.turnOn();
    }
}
