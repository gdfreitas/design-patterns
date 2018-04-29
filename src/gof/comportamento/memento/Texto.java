package gof.comportamento.memento;

/**
 * @author gabriel.freitas
 */
public class Texto {

    private String texto;
    private TextoCareTaker caretaker;

    public Texto() {
        caretaker = new TextoCareTaker();
        texto = "";
    }

    public void escrever(String novoTexto) {
        caretaker.adicionarMemento(new TextoMemento(texto));
        texto += novoTexto;
    }

    public void desfazer() {
        texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
    }

    public void mostrar() {
        System.out.println(texto);
    }

}
