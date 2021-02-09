package comand;

import object.Fan;

public class OffFan implements CommandWithUndo {

    private final Fan fan;

    public OffFan(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void exceute() {
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
    }
}
