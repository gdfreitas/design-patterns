package gof.comportamento.memento;

/**
 * @author gabriel.freitas
 */
public class MementoTests {

    public static void main(String[] args) {
        Texto texto = new Texto();
        texto.escrever("Primeira frase\n");
        texto.escrever("Segunda frase\n");
        texto.escrever("Terceira frase\n");
        texto.mostrar();
        texto.desfazer();
        texto.mostrar();
        texto.desfazer();
        texto.mostrar();
        texto.desfazer();
        texto.mostrar();
        texto.desfazer();
        texto.mostrar();
    }

}
