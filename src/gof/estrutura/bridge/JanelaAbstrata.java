package gof.estrutura.bridge;

/**
 * @author gabriel.freitas
 */
public abstract class JanelaAbstrata {

    protected Janela janela;

    public JanelaAbstrata(Janela janela) {
        this.janela = janela;
    }

    public void addTitle(String title) {
        janela.addTitle(title);
    }

    public void addButton(String name) {
        janela.addButton(name);
    }

    public abstract void render();

}
