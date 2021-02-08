package methodFactoryPattern.pizza.ny;

import methodFactoryPattern.pizza.Pizza;

public class NYBBQPizza extends Pizza {

    public NYBBQPizza(){

        this.setName("NY BBQ methodFactoryPattern.pizza.Pizza");
        this.setDough("thin");
        this.setSauce("bbq sauce");
        this.addIngredient("Mozzarella");
        this.addIngredient("Meat");
    }
}
