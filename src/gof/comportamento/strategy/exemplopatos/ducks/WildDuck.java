package gof.comportamento.strategy.exemplopatos.ducks;

import gof.comportamento.strategy.exemplopatos.fly.SimpleFlyStrategy;
import gof.comportamento.strategy.exemplopatos.quack.NoQuackStrategy;

public class WildDuck extends Duck {

    public WildDuck() {
        super(new SimpleFlyStrategy(), new NoQuackStrategy());
    }

}