package gof.comportamento.strategy.exemplopatos.ducks;

import gof.comportamento.strategy.exemplopatos.fly.JetFlyStrategy;
import gof.comportamento.strategy.exemplopatos.quack.SimpleQuackStrategy;

public class CloudDuck extends Duck {

    public CloudDuck() {
        super(new JetFlyStrategy(), new SimpleQuackStrategy());
    }

}