package gof.comportamento.strategy.ducksample.ducks;

import gof.comportamento.strategy.ducksample.fly.NoFlyStrategy;
import gof.comportamento.strategy.ducksample.quack.SimpleQuackStrategy;

public class RiverDuck extends Duck {

    public RiverDuck() {
        super(new NoFlyStrategy(), new SimpleQuackStrategy());
    }

}
