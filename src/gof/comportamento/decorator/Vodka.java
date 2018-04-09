package gof.comportamento.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Vodka extends Coquetel {

    public Vodka() {
        this.nome = "Vodka";
        this.preco = BigDecimal.valueOf(1.50);
    }

}
