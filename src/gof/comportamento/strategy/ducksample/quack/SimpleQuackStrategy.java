package gof.comportamento.strategy.ducksample.quack;

public class SimpleQuackStrategy implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

}
