package gof.criacao.abstractfactory;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public interface FabricaDeCarro {

    CarroSedan fabricarSedan();
    CarroHatch fabricarHatch();

}
