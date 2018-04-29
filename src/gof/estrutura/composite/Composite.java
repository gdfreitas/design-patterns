package gof.estrutura.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gabriel.freitas
 */
public class Composite extends Componente {

    private List<Componente> filhos;

    public Composite(int value, Componente pai) {
        this.value = value;
        this.pai = pai;
        this.filhos = new ArrayList<>();
    }

    @Override
    public int getTotalRelacionados() {
        return filhos.stream()
                .mapToInt(Componente::getTotalRelacionados)
                .sum();
    }

    @Override
    public void addFilho(final Componente filho) throws UnsupportedOperationException {
        filhos.add(filho);
    }

    @Override
    public void removeFilho(final Componente filho) throws UnsupportedOperationException {
        filhos.remove(filho);
    }

    @Override
    public List<Componente> getFilhos() {
        return new ArrayList<>(filhos);
    }
}
