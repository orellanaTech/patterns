import domain.duck.Duck;
import domain.duck.flyBehavior.FlyWithWings;
import domain.duck.flyBehavior.FlyWithoutWings;
import domain.duck.quakBehavoir.MuteQuak;
import domain.duck.quakBehavoir.Quak;
import domain.duck.quakBehavoir.Squeak;

public class DuckApp {

    public static void main(String[] args){

        Duck mallardDuck = new Duck(new FlyWithWings(), new Quak() );

        mallardDuck.quak();
        mallardDuck.fly();

        Duck rubberDuck = new Duck(new FlyWithoutWings(), new MuteQuak());

        rubberDuck.fly();
        rubberDuck.quak();

        rubberDuck.setFlyBehavoir(new FlyWithWings());
        rubberDuck.setQuakBehavoir(new Squeak());

        rubberDuck.fly();
        rubberDuck.quak();
    }
}
