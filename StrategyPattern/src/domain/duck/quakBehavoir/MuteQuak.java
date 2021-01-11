package domain.duck.quakBehavoir;

public class MuteQuak implements QuakBehavoir {
    @Override
    public void quak() {
        System.out.println("...");
    }
}
