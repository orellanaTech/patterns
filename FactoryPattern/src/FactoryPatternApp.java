import abstractFactoryPattern.ny.NYAPizzaStore;
import methodFactoryPattern.pizza.Pizza;
import methodFactoryPattern.store.ChicagoPizzaStore;
import methodFactoryPattern.store.NYPizzaStore;
import methodFactoryPattern.store.PizzaStore;

public abstract class FactoryPatternApp {

    public static void main(String[] args) {

        //METHOD FACTORY
//        PizzaStore NYStore= new NYPizzaStore();
//        PizzaStore ChicagoStore = new ChicagoPizzaStore();
//
//        System.out.println("Ordering veggie NY pizza");
//        Pizza firstPizza = NYStore.orderPizza("veggie");
//
//        System.out.println("Ordering cheese Chicago pizza");
//        Pizza secondPizza = ChicagoStore.orderPizza("cheese");

        //ABSTRACT FACTORY
        NYAPizzaStore abstractStore = new NYAPizzaStore();
        abstractStore.createAPizza("cheese");
        abstractStore.createAPizza("cams");

    }
}
