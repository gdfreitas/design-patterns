package gof.comportamento.strategy.exemplosalario;

/**
 * @author gabriel.freitas
 */
public class VinteOuQuinzeStrategy implements ICalculoImposto {

    @Override
    public double calcularSalarioComImposto(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 3500) {
            return funcionario.getSalarioBase() * 0.8;
        }

        return funcionario.getSalarioBase() * 0.85;
    }

}
