package gof.estrutura.bridge;

/**
 * @author gabriel.freitas
 */
public class BridgeTests {

    public static void main(String[] args) {
        JanelaAbstrata janela = new JanelaDialogo(new LinuxTema());
        janela.render();

        janela = new JanelaAviso(new LinuxTema());
        janela.render();

        janela = new JanelaDialogo(new WindowsTema());
        janela.render();

        janela = new JanelaAviso(new MacTema());
        janela.render();
    }

}
