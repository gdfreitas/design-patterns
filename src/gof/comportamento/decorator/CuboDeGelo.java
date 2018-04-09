package gof.comportamento.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class CuboDeGelo extends CoquetelDecorator {

    public CuboDeGelo(final Coquetel coquetel, int qtdCubos) {
        super(coquetel);
        this.nome = "Cubos de gelo";
        this.preco = BigDecimal.valueOf(qtdCubos * 0.75);
    }

}
