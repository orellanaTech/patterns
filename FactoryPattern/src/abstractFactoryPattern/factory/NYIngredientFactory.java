package abstractFactoryPattern.factory;

import abstractFactoryPattern.ingredients.*;
import abstractFactoryPattern.ingredients.dough.Dough;
import abstractFactoryPattern.ingredients.dough.ThinCrustDough;
import abstractFactoryPattern.ingredients.ny.*;
import abstractFactoryPattern.ingredients.sauce.MarinaraSauce;
import abstractFactoryPattern.ingredients.sauce.Sauce;

public class NYIngredientFactory implements IngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies =  {new Garlic(), new Mushroom()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
         return new SlicedPepperoni();
    }

    @Override
    public CLams createClams() {
        return new FreshClams();
    }
}
