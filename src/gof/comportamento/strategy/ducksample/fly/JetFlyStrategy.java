package gof.comportamento.strategy.ducksample.fly;

public class JetFlyStrategy implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with a turbine!");
    }

}
