package gof.comportamento.observer.exemplo1;

/**
 * @author gabriel.freitas
 */
public class BarraObserver extends DadosObserver {

    public BarraObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        StringBuilder barraA = new StringBuilder();
        StringBuilder barraB = new StringBuilder();
        StringBuilder barraC = new StringBuilder();

        for (int i = 0; i < dados.getState().valorA; i++) {
            barraA.append('=');
        }

        for (int i = 0; i < dados.getState().valorB; i++) {
            barraB.append('=');
        }

        for (int i = 0; i < dados.getState().valorC; i++) {
            barraC.append('=');
        }

        System.out.println("\nBarras:\nValor A: " + barraA + "\nValor B: " + barraB + "\nValor C: " + barraC);
    }
}
