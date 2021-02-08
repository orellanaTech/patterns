package abstractFactoryPattern.factory;

import abstractFactoryPattern.ingredients.*;
import abstractFactoryPattern.ingredients.dough.Dough;
import abstractFactoryPattern.ingredients.sauce.Sauce;

public interface IngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggie[] createVeggies();

    public Pepperoni createPepperoni();

    public CLams createClams();
}
