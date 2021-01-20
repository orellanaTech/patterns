import beverage.Beverage;
import beverage.Brasilian;
import beverage.Espresso;
import condiment.Honey;
import condiment.Mocha;
import condiment.Soy;

import java.awt.desktop.AboutEvent;

public class DecoratorApp {

    public static void main(String[] args) throws InterruptedException {

        Beverage espresso = new Espresso();
        System.out.println("beverage without condiments: " + espresso.getDescription() + " -> " + espresso.cost());

        espresso = new Honey(espresso);
        espresso = new Mocha(espresso);

        System.out.println("beverage finished: " + espresso.getDescription() + " -> " + espresso.cost());

        Beverage brasilian = new Brasilian();

        brasilian = new Mocha(brasilian);
        brasilian = new Mocha(brasilian);
        brasilian = new Soy(brasilian);

        System.out.println("beverage finished: " + brasilian.getDescription() + " -> " + brasilian.cost());

    }
}
