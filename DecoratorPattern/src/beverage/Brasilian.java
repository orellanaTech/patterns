package beverage;

public class Brasilian extends Beverage {

    public Brasilian(){
        description = "Brasilian";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
