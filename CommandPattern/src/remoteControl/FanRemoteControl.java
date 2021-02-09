package remoteControl;

import comand.*;
import object.Fan;

public class FanRemoteControl {

    CommandWithUndo onCommand;
    CommandWithUndo offCommand;
    CommandWithUndo upSpeed;
    CommandWithUndo downSpeed;
    CommandWithUndo lastCommand;

    public FanRemoteControl(Fan fan){
        onCommand = new OnFan(fan);
        offCommand = new OffFan(fan);
        upSpeed = new UpSpeedFan(fan);
        downSpeed = new DownSpeedFan(fan);
    }

    public void pressOnButton(){
        onCommand.exceute();
        lastCommand = onCommand;
    }

    public void pressOffButton(){
        offCommand.exceute();
        lastCommand = offCommand;
    }

    public void pressUpSpeedButton(){
        upSpeed.exceute();
        lastCommand = upSpeed;
    }

    public void pressDOwnSpeedButton(){
        downSpeed.exceute();
        lastCommand = downSpeed;
    }

    public void pressUndoButton(){
        System.out.print("undo button: ");
        lastCommand.undo();
    }
}
