package gof.comportamento.strategy.salarytaxsample;

/**
 * @author gabriel.freitas
 */
public class StrategyTests {

    public static void main(String[] args) {

        Employee programador = new Employee(Role.PROGRAMMER, 2400);
        System.out.println(programador.calculateSalary());

        Employee analista = new Employee(Role.SYSTEM_ANALIST, 4200);
        System.out.println(analista.calculateSalary());

        Employee arquiteto = new Employee(Role.SYSTEM_ARQUITECT, 7700);
        System.out.println(arquiteto.calculateSalary());

        Employee dba = new Employee(Role.DATABASE_ADMINISTRATOR, 6200);
        System.out.println(dba.calculateSalary());
    }

}
