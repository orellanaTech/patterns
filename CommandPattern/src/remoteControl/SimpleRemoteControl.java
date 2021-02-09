package remoteControl;

import comand.Command;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){};

    public void setSlot(Command command){
        slot = command;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
