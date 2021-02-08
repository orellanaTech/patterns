package methodFactoryPattern.pizza.ny;

import methodFactoryPattern.pizza.Pizza;

public class NYVeggiePizza extends Pizza {

    public NYVeggiePizza(){

        this.setName("NY Veggie methodFactoryPattern.pizza.Pizza");
        this.setDough("thin");
        this.setSauce("tomato sauce");
        this.addIngredient("Pepper");
        this.addIngredient("Tofu");
    }
}
