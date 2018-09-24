package gof.comportamento.strategy.exemplopatos.ducks;

import gof.comportamento.strategy.exemplopatos.fly.IFlyBehavior;
import gof.comportamento.strategy.exemplopatos.quack.IQuackBehavior;

public abstract class Duck {

    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;

    public Duck(final IFlyBehavior flyBehavior, final IQuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("Displaying a duck");
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }

}
