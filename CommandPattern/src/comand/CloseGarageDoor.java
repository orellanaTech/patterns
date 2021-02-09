package comand;

import object.GarageDoor;

public class CloseGarageDoor implements Command {

    private final GarageDoor garageDoor;

    public CloseGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {

        garageDoor.lightOn();
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOff();
    }
}
