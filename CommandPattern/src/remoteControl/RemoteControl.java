package remoteControl;

import comand.Command;
import comand.NoCommand;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCOmmand){

        onCommands[slot] = onCommand;
        offCommands[slot] = offCOmmand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------- Remote Control Buttons -------\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append("slot " + i + ": " + onCommands[i].getClass().getName() + " ----- " +
                    offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }

}
