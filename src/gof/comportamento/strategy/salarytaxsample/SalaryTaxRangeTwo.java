package gof.comportamento.strategy.salarytaxsample;

/**
 * @author gabriel.freitas
 */
public class SalaryTaxRangeTwo implements ISalaryRangeTaxRole {

    @Override
    public double calculateSalaryWithTax(Employee employee) {
        if (employee.getBaseSalary() > 3500) {
            return employee.getBaseSalary() * 0.80;
        }

        return employee.getBaseSalary() * 0.85;
    }

}
