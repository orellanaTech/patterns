package domain.duck.flyBehavior;

public class FlyWithoutWings implements FlyBehavoir {
    @Override
    public void fly() {
        System.out.println("Not Flying");
    }
}
