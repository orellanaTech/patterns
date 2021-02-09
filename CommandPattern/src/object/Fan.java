package object;

public class Fan {


    private int speed;

    public void on(){
        System.out.println("Fan on");
    }

    public void off(){
        System.out.println("Fan off");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        System.out.println("speed set to " + speed);
        this.speed = speed;
    }
}
