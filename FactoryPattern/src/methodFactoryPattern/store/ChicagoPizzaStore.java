package methodFactoryPattern.store;

import methodFactoryPattern.pizza.Pizza;
import methodFactoryPattern.pizza.chicago.ChicagoCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    //FACTORY METHOD
    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")){
            return new ChicagoCheesePizza();
        } else {
            return null;
        }
    }
}
