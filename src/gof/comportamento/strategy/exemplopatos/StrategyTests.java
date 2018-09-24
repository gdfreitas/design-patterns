package gof.comportamento.strategy.exemplopatos;

import gof.comportamento.strategy.exemplopatos.ducks.CityDuck;
import gof.comportamento.strategy.exemplopatos.ducks.CloudDuck;
import gof.comportamento.strategy.exemplopatos.ducks.RiverDuck;
import gof.comportamento.strategy.exemplopatos.ducks.WildDuck;

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
