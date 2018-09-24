package gof.comportamento.strategy.exemplopatos.ducks;

import gof.comportamento.strategy.exemplopatos.fly.SimpleFlyStrategy;
import gof.comportamento.strategy.exemplopatos.quack.SimpleQuackStrategy;

public class CityDuck extends Duck{

    public CityDuck() {
        super(new SimpleFlyStrategy(), new SimpleQuackStrategy());
    }

}