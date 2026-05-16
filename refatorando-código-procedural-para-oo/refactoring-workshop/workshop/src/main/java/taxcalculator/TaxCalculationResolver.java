package taxcalculator;

public class TaxCalculationResolver {
    private final TaxStrategiesRepository repository;

    public TaxCalculationResolver(TaxStrategiesRepository repository) {
        this.repository = repository;
    }

    public TaxCalculatorStrategy getRole(Role role) {
        TaxValues taxValues = repository.getRole(role);
        return new ThreshouldBasedTaxCalculation(
                taxValues.getThresould(),
                taxValues.getAboveTax(),
                taxValues.getBellowTax()
        );
    }
}
