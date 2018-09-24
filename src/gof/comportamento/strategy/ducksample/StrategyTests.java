package gof.comportamento.strategy.ducksample;

import gof.comportamento.strategy.ducksample.ducks.CityDuck;
import gof.comportamento.strategy.ducksample.ducks.CloudDuck;
import gof.comportamento.strategy.ducksample.ducks.RiverDuck;
import gof.comportamento.strategy.ducksample.ducks.WildDuck;

public class StrategyTests {

    public static void main(String[] args) {

        WildDuck wildDuck = new WildDuck();
        wildDuck.quack();
        wildDuck.fly();

        CloudDuck cloudDuck = new CloudDuck();
        cloudDuck.quack();
        cloudDuck.fly();

        CityDuck cityDuck = new CityDuck();
        cityDuck.quack();
        cityDuck.fly();

        RiverDuck riverDuck = new RiverDuck();
        riverDuck.quack();
        riverDuck.fly();

    }

}
