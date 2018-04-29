package gof.comportamento.iterator;

import java.util.ArrayList;

/**
 * @author gabriel.freitas
 */
public abstract class AgregadoCanais {

    protected ArrayList<Canal> canais;

    public AgregadoCanais() {
        canais = new ArrayList<Canal>();
    }

    public int count() {
        return canais.size();
    }

    public IteradorCanais criarIterator() {
        return new IteradorCanais(canais);
    }
}
