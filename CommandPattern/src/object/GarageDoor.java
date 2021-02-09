package object;

public class GarageDoor {

    private boolean moving_up = false;

    private boolean moving_down = false;

    private boolean open = false;

    private final Light light;

    public GarageDoor(){
        light = new Light();
    }

    public void up(){
        if(!open) {
            moving_up = true;
            moving_down = false;
            System.out.println("moving up...");
        }
    }

    public void down(){
        if(open){
            moving_down = true;
            moving_up = false;
            System.out.println("moving down...");
        }

    }

    public void stop(){
        if (moving_up){
            moving_up = false;
            open = true;
        }
        else if (moving_down){
            moving_down = false;
            open = false;
        }
    }

    public void lightOn(){
        this.light.on();
    }

    public void lightOff(){
        this.light.off();
    }
}
