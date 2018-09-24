package gof.comportamento.observer.exemplo1;

/**
 * @author gabriel.freitas
 */
public class TabelaObserver extends DadosObserver {

    public TabelaObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        System.out.println("\nTabela:\nValor A: " + dados.getState().valorA + "\nValor B: " + dados.getState().valorB + "\nValor C: " + dados.getState().valorC);
    }
}
