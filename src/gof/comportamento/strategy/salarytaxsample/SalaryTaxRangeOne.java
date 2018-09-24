package gof.comportamento.strategy.salarytaxsample;

/**
 * @author gabriel.freitas
 */
public class SalaryTaxRangeOne implements ISalaryRangeTaxRole {

    @Override
    public double calculateSalaryWithTax(Employee employee) {
        if (employee.getBaseSalary() > 2000) {
            return employee.getBaseSalary() * 0.92;
        }

        return employee.getBaseSalary() * 0.95;
    }

}
