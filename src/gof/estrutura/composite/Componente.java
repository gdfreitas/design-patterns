package gof.estrutura.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gabriel.freitas
 */
public abstract class Componente {

    protected int value;
    protected Componente pai = null;

    public int getValue() {
        return this.value;
    }

    public abstract int getTotalRelacionados();

    public void addFilho(Componente filho) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("não é permitido adicionar filhos para este tipo");
    }

    public void removeFilho(Componente filho) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("não é permitido remover filhos para este tipo");
    }

    public List<Componente> getFilhos() {
        return new ArrayList<>();
    }

}
