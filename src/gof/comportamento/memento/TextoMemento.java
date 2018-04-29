package gof.comportamento.memento;

/**
 * @author gabriel.freitas
 */
public class TextoMemento {

    private String estado;

    public TextoMemento(String texto) {
        estado = texto;
    }

    public String getTextoSalvo() {
        return estado;
    }

}
