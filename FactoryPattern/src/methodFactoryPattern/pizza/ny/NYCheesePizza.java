package methodFactoryPattern.pizza.ny;

import methodFactoryPattern.pizza.Pizza;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza(){
        this.setName("NY Cheese methodFactoryPattern.pizza.Pizza");
        this.setDough("thin");
        this.setSauce("tomato sauce");
        this.addIngredient("Mozzarella");
        this.addIngredient("Cheddar");
        this.addIngredient("Blue Cheese");
        this.addIngredient("Gorgonzola");
    }
}
