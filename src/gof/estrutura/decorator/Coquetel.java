package gof.estrutura.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public abstract class Coquetel {

    String nome;
    BigDecimal preco;

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
