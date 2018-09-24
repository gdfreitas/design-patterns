package gof.comportamento.strategy.ducksample.fly;

public class NoFlyStrategy implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("<no fly>");
    }

}
