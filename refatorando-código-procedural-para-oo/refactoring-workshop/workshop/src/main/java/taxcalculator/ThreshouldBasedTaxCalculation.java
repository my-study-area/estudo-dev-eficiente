package taxcalculator;

public class ThreshouldBasedTaxCalculation implements TaxCalculatorStrategy {
    private final double threshould;
    private final double aboveTheThreshouldTax;
    private final double belowTheThresghouldTax;

    public ThreshouldBasedTaxCalculation(double threshould, double aboveTheThreshouldTax, double belowTheThresghouldTax) {
        this.threshould = threshould;
        this.aboveTheThreshouldTax = aboveTheThreshouldTax;
        this.belowTheThresghouldTax = belowTheThresghouldTax;
    }

    @Override
    public double calculate(Employee employee) {
        if(employee.getBaseSalary() > threshould) {
            return employee.getBaseSalary() * aboveTheThreshouldTax;
        }
        else {
            return employee.getBaseSalary() * belowTheThresghouldTax;
        }
    }
}
