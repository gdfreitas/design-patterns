package gof.estrutura.bridge;

/**
 * @author gabriel.freitas
 */
public class JanelaDialogo extends JanelaAbstrata {

    public JanelaDialogo(final Janela janela) {
        super(janela);
    }

    @Override
    public void render() {
        addTitle("Diálogo");
        addButton("Salvar");
        addButton("Excluir");
        addButton("Cancelar");
    }
}
