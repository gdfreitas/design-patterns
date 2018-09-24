package gof.comportamento.strategy.exemplosalario;

/**
 * @author gabriel.freitas
 */
public class QuinzeOuDezStrategy implements ICalculoImposto {

    @Override
    public double calcularSalarioComImposto(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 2000) {
            return funcionario.getSalarioBase() * 0.85;
        }

        return funcionario.getSalarioBase() * 0.9;
    }

}
