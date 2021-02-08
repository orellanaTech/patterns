package methodFactoryPattern.store;

import methodFactoryPattern.pizza.Pizza;
import methodFactoryPattern.pizza.ny.NYBBQPizza;
import methodFactoryPattern.pizza.ny.NYCheesePizza;
import methodFactoryPattern.pizza.ny.NYPepperoniPizza;
import methodFactoryPattern.pizza.ny.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    //FACTORY METHOD
    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")){
            return new NYCheesePizza();
        } else if (type.equals("veggie")){
             return new NYVeggiePizza();
        } else if (type.equals("bbq")){
            return new NYBBQPizza();
        } else if (type.equals("pepperoni")){
            return new NYPepperoniPizza();
        } else {
            return null;
        }
    }
}
