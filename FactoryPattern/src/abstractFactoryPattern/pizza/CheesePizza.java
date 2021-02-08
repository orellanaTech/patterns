package abstractFactoryPattern.pizza;

import abstractFactoryPattern.factory.IngredientFactory;

public class CheesePizza extends Pizza {

    private IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory){
        this.name = "cheese pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + name + " pizza ...");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        ingredients.add(ingredientFactory.createCheese());
        this.bake();
        this.cut();
    }
}
