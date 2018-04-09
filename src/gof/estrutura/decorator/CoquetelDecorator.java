package gof.estrutura.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class CoquetelDecorator extends Coquetel {

    Coquetel coquetel;

    public CoquetelDecorator(final Coquetel coquetel) {
        this.coquetel = coquetel;
    }

    @Override
    public String getNome() {
        return coquetel.getNome() + " + " + this.nome;
    }

    @Override
    public BigDecimal getPreco() {
        return coquetel.getPreco().add(this.preco);
    }

}
