package object;

public class Stereo {

    private int volume;

    public Stereo(){
        volume = 10;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("stereo off");
    }

    public void setCD(){
        System.out.println("inserting cd ...");
    }

    public void play(){
        System.out.println(" playing cd...");
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        if (0 < volume && volume < 50){
            System.out.println("volume set to " + volume);
            this.volume = volume;
        }
    }
}
