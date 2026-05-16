package taxcalculator;

public class TaxCalculator {
    private final TaxCalculationResolver resolver;

    public TaxCalculator(TaxCalculationResolver resolver) {
        this.resolver = resolver;
    }

    public double calculateTax(Employee employee) {
        TaxCalculatorStrategy strategy = resolver.getRole(employee.getRole());
        return strategy.calculate(employee);
    }
}