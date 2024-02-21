package command.simpleRemoteControl;

public class SimpleRemoteControl {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonPressed(){
        this.command.execute();
    }
}
