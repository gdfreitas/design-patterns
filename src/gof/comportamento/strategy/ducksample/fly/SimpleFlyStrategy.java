package gof.comportamento.strategy.ducksample.fly;

public class SimpleFlyStrategy implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying trough the skies!!");
    }

}
