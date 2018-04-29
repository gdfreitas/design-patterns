package gof.comportamento.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gabriel.freitas
 */
public class TextoCareTaker {

    private List<TextoMemento> estados;

    public TextoCareTaker() {
        estados = new ArrayList<>();
    }

    public void adicionarMemento(TextoMemento memento) {
        estados.add(memento);
    }

    public TextoMemento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new TextoMemento("");
        }
        TextoMemento saved = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return saved;
    }

}
