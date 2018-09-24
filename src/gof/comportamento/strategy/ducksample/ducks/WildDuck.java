package gof.comportamento.strategy.ducksample.ducks;

import gof.comportamento.strategy.ducksample.fly.SimpleFlyStrategy;
import gof.comportamento.strategy.ducksample.quack.NoQuackStrategy;

public class WildDuck extends Duck {

    public WildDuck() {
        super(new SimpleFlyStrategy(), new NoQuackStrategy());
    }

}