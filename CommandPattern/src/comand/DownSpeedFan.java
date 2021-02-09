package comand;

import object.Fan;

public class DownSpeedFan implements CommandWithUndo {

    private final Fan fan;

    public DownSpeedFan(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void exceute() {
        fan.setSpeed(fan.getSpeed()-1);
    }

    @Override
    public void undo() {
        fan.setSpeed(fan.getSpeed()+1);
    }
}
