package methodFactoryPattern.pizza;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> ingredients = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce  " + sauce);
        System.out.println("Adding toppings:  ");
        ingredients.forEach(ingredient -> System.out.println("    " + ingredient));
    }

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

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }


}
