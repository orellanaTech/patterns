
public class SingletonPattern {

    public static void main(String[] args) {

        ChocolatBoiler chocolatBoiler = ChocolatBoiler.getInstance();
        chocolatBoiler.fill();

        //the second instance cannot make the fill or drain because the boolean empty and
        // boiled are the same because are the same instance
        ChocolatBoiler chocolatBoiler2 = ChocolatBoiler.getInstance();
        chocolatBoiler2.fill();
        chocolatBoiler.boil();
        chocolatBoiler2.fill();
        chocolatBoiler.drain();
    }
}
