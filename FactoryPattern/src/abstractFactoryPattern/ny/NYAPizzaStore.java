package abstractFactoryPattern.ny;

import abstractFactoryPattern.factory.IngredientFactory;
import abstractFactoryPattern.factory.NYIngredientFactory;
import abstractFactoryPattern.pizza.CheesePizza;
import abstractFactoryPattern.pizza.ClamPizza;
import abstractFactoryPattern.pizza.Pizza;

public class NYAPizzaStore {

    private IngredientFactory ingredientFactory = new NYIngredientFactory();

    public Pizza createAPizza(String type) {

        Pizza pizza = null;

        if (type == "cheese"){
            pizza = new CheesePizza(ingredientFactory);
            pizza.prepare();
        } else if(type == "clams"){
            pizza = new ClamPizza(ingredientFactory);
            pizza.prepare();
        }

        return pizza;
    }
}
