package gof.comportamento.strategy.exemplopatos.ducks;

import gof.comportamento.strategy.exemplopatos.fly.NoFlyStrategy;
import gof.comportamento.strategy.exemplopatos.quack.SimpleQuackStrategy;

public class RiverDuck extends Duck {

    public RiverDuck() {
        super(new NoFlyStrategy(), new SimpleQuackStrategy());
    }

}
