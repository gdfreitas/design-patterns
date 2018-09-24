package gof.comportamento.strategy.salarytaxsample;

/**
 * @author gabriel.freitas
 */
public class Employee {

    private Role role;
    private double baseSalary;
    private ISalaryRangeTaxRole salaryRangeTaxBehavior;

    Employee(Role role, double baseSalary) {
        this.baseSalary = baseSalary;

        switch (role) {
            case PROGRAMMER:
            case SYSTEM_ANALIST:
                salaryRangeTaxBehavior = new SalaryTaxRangeOne();
                break;
            case SYSTEM_ARQUITECT:
            case DATABASE_ADMINISTRATOR:
                salaryRangeTaxBehavior = new SalaryTaxRangeTwo();
                break;
        }
    }

    double calculateSalary() {
        return salaryRangeTaxBehavior.calculateSalaryWithTax(this);
    }

    double getBaseSalary() {
        return baseSalary;
    }

    public Role getRole() {
        return role;
    }

}