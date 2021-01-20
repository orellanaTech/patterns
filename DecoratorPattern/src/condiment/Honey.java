package condiment;

import beverage.Beverage;

public class Honey extends CondimentDecorator {

    Beverage beverage;

    public Honey(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Honey";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
