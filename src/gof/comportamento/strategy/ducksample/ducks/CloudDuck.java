package gof.comportamento.strategy.ducksample.ducks;

import gof.comportamento.strategy.ducksample.fly.JetFlyStrategy;
import gof.comportamento.strategy.ducksample.quack.SimpleQuackStrategy;

public class CloudDuck extends Duck {

    public CloudDuck() {
        super(new JetFlyStrategy(), new SimpleQuackStrategy());
    }

}