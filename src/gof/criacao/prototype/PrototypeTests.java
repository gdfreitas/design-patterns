package gof.criacao.prototype;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
public class PrototypeTests {

    public static void main(String[] args) {

        CivicPrototype civicPrototype = new CivicPrototype();

        CarroPrototype civic2013 = civicPrototype.clonar();
        civic2013.setPreco(BigDecimal.valueOf(55000));

        CarroPrototype civic2018 = civicPrototype.clonar();
        civic2018.setPreco(BigDecimal.valueOf(90000));

        civic2013.imprimirInformacoes();
        civic2018.imprimirInformacoes();

    }

}
