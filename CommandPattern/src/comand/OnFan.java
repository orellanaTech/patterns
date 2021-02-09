package comand;

import object.Fan;

public class OnFan implements CommandWithUndo {

    private final Fan fan;

    public OnFan(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void exceute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
