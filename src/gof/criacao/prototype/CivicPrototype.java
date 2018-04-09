package gof.criacao.prototype;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class CivicPrototype extends CarroPrototype {

    public CivicPrototype(CivicPrototype civicPrototype) {
        this.preco = civicPrototype.getPreco();
    }

    public CivicPrototype() {
        this.preco = BigDecimal.ZERO;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println(String.format("Modelo: Civic\nMontadora: Honda\nPreco: R$ %s\n", this.getPreco()));
    }

    @Override
    public CarroPrototype clonar() {
        return new CivicPrototype(this);
    }
}
