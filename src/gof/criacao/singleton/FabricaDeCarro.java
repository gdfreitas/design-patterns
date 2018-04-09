package gof.criacao.singleton;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class FabricaDeCarro {

    public static FabricaDeCarro instancia;

    protected int qtdHonda;
    protected int qtdJeep;
    protected int qtdVolkswagen;

    protected FabricaDeCarro() {
    }

    public static FabricaDeCarro getInstancia() {
        if (instancia == null) {
            instancia = new FabricaDeCarro();
        }

        return instancia;
    }

    public String criarHonda() {
        return "Carro Honda #" + ++qtdHonda + " criado.";
    }

    public String criarJeep() {
        return "Carro Jeep #" + ++qtdJeep + " criado.";
    }

    public String criarVolkswagen() {
        return "Carro Volkswagen #" + ++qtdVolkswagen + " criado.";
    }

    @Override
    public String toString() {
        return "FabricaDeCarro{" +
                "qtdHonda=" + qtdHonda +
                ", qtdJeep=" + qtdJeep +
                ", qtdVolkswagen=" + qtdVolkswagen +
                '}';
    }

}
