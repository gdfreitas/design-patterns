package gof.estrutura.composite;

/**
 * @author gabriel.freitas
 */
public class Folha extends Componente {

    public Folha(int value, Componente pai) {
        this.value = value;
        this.pai = pai;
    }

    @Override
    public int getTotalRelacionados() {
        return this.value;
    }
}
