package abstractFactoryPattern.pizza;

import abstractFactoryPattern.ingredients.dough.Dough;
import abstractFactoryPattern.ingredients.Ingredient;
import abstractFactoryPattern.ingredients.sauce.Sauce;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    public abstract void prepare();

    public void bake(){
        System.out.println("Baking 300ºC for 10 min");
    }

    public void cut(){
        System.out.println(" Cutting in diagonal slices");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }


}
