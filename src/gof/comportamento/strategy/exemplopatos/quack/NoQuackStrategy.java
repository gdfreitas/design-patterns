package gof.comportamento.strategy.exemplopatos.quack;

public class NoQuackStrategy implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("<no quack>");
    }

}
