package gof.estrutura.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Energetico extends CoquetelDecorator {

    public Energetico(final Coquetel coquetel) {
        super(coquetel);
        this.nome = "Energetico";
        this.preco = BigDecimal.valueOf(2.50);
    }

}
