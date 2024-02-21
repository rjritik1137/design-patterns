package command.simpleRemoteControl;

public class SimpleRemoControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Command c1 = new AcTurnOnCommand(new AirConditioner());
        remoteControl.setCommand(c1);
        remoteControl.buttonPressed();
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.buttonPressed();
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.buttonPressed();
    }
}
