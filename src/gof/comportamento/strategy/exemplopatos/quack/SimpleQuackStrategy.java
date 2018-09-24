package gof.comportamento.strategy.exemplopatos.quack;

public class SimpleQuackStrategy implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

}
