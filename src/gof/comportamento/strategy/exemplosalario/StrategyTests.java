package gof.comportamento.strategy.exemplosalario;

/**
 * @author gabriel.freitas
 */
public class StrategyTests {

    public static void main(String[] args) {

        Funcionario programador = new Funcionario(Cargo.PROGRAMADOR, 2400);
        System.out.println(programador.calcularSalarioComImposto());

        Funcionario analista = new Funcionario(Cargo.ANALISTA_SISTEMAS, 4200);
        System.out.println(analista.calcularSalarioComImposto());

        Funcionario arquiteto = new Funcionario(Cargo.ARQUITETO_SISTEMAS, 7700);
        System.out.println(arquiteto.calcularSalarioComImposto());

        Funcionario dba = new Funcionario(Cargo.DBA, 6200);
        System.out.println(dba.calcularSalarioComImposto());
    }

}
