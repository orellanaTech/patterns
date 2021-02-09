package comand;

import object.Fan;

public class UpSpeedFan implements CommandWithUndo {

    private final Fan fan;

    public UpSpeedFan(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void exceute() {
        fan.setSpeed(fan.getSpeed()+1);
    }

    @Override
    public void undo() {
        fan.setSpeed(fan.getSpeed()-1);
    }
}
