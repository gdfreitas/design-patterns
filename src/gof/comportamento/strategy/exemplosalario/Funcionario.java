package gof.comportamento.strategy.exemplosalario;

/**
 * @author gabriel.freitas
 */
public class Funcionario {

    private Cargo cargo;
    private double salarioBase;
    private ICalculoImposto estrategiaDeCalculo;

    public Funcionario(Cargo cargo, double salarioBase) {
        this.salarioBase = salarioBase;

        // define estratégia de cálculo do salário
        switch (cargo) {

            case PROGRAMADOR:
            case ANALISTA_SISTEMAS:
                estrategiaDeCalculo = new QuinzeOuDezStrategy();
                break;

            case ARQUITETO_SISTEMAS:
            case DBA:
                estrategiaDeCalculo = new VinteOuQuinzeStrategy();
                break;

            default:
                throw new RuntimeException("cargo não encontrado");
        }
    }

    public double calcularSalarioComImposto() {
        return estrategiaDeCalculo.calcularSalarioComImposto(this);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

}
