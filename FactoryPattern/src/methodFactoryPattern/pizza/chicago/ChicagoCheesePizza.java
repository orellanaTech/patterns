package methodFactoryPattern.pizza.chicago;

import methodFactoryPattern.pizza.Pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(){

        this.setName("Chicago Cheese methodFactoryPattern.pizza.Pizza");
        this.setDough("thick");
        this.setSauce("tomato sauce");
        this.addIngredient("Mozzarella");
        this.addIngredient("Cheddar");
        this.addIngredient("Blue Cheese");
        this.addIngredient("Gorgonzola");
    }

    @Override
    public void cut() {
        System.out.println("Cut in squares");
    }
}
