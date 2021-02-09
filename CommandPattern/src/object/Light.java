package object;

public class Light {

    Boolean on = false;

    public void on(){
        System.out.println("light on");
        on = true;
    }

    public void off(){
        System.out.println("light off");
        on = false;
    }
}
