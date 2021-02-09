package comand;

import object.GarageDoor;

public class OpenGarageDoor implements Command {

    private final GarageDoor garageDoor;

    public OpenGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute(){

        garageDoor.lightOn();
        garageDoor.up();
        garageDoor.stop();
        garageDoor.lightOff();
    }
}
