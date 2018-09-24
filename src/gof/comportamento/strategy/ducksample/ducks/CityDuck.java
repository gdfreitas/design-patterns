package gof.comportamento.strategy.ducksample.ducks;

import gof.comportamento.strategy.ducksample.fly.SimpleFlyStrategy;
import gof.comportamento.strategy.ducksample.quack.SimpleQuackStrategy;

public class CityDuck extends Duck{

    public CityDuck() {
        super(new SimpleFlyStrategy(), new SimpleQuackStrategy());
    }

}