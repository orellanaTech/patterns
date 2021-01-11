package domain.duck;

import domain.duck.flyBehavior.FlyBehavoir;
import domain.duck.quakBehavoir.QuakBehavoir;

public class Duck {

    private FlyBehavoir flyBehavoir;

    private QuakBehavoir quakBehavoir;

    public Duck(FlyBehavoir flyBehavoir, QuakBehavoir quakBehavoir){
        this.flyBehavoir = flyBehavoir;
        this.quakBehavoir = quakBehavoir;
    }

    public void fly(){
        this.flyBehavoir.fly();
    }

    public void quak(){
        this.quakBehavoir.quak();
    }

    public void setFlyBehavoir(FlyBehavoir flyBehavoir){
        this.flyBehavoir = flyBehavoir;
    }

    public void setQuakBehavoir(QuakBehavoir quakBehavoir){
        this.quakBehavoir = quakBehavoir;
    }
}
