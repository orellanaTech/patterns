package methodFactoryPattern.pizza.ny;

import methodFactoryPattern.pizza.Pizza;

public class NYPepperoniPizza extends Pizza {

    public NYPepperoniPizza(){

        this.setName("NY Pepperoni methodFactoryPattern.pizza.Pizza");
        this.setDough("thin");
        this.setSauce("tomato sauce");
        this.addIngredient("Mozzarella");
        this.addIngredient("Pepperoni");
    }
}
