package gof.criacao.prototype;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class GolfPrototype extends CarroPrototype {

    public GolfPrototype(GolfPrototype golfPrototype) {
        this.preco = golfPrototype.getPreco();
    }

    public GolfPrototype() {
        this.preco = BigDecimal.ZERO;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println(String.format("Modelo: Golf\nMontadora: Volkswagen\nPreco: R$ %s\n", this.getPreco()));
    }

    @Override
    public CarroPrototype clonar() {
        return new GolfPrototype(this);
    }
}
