package abstractFactoryPattern.pizza;

import abstractFactoryPattern.factory.IngredientFactory;

public class ClamPizza extends Pizza {
    private IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + name + " pizza ...");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        ingredients.add(ingredientFactory.createCheese());
        ingredients.add(ingredientFactory.createClams());
        this.bake();
        this.cut();
    }
}
