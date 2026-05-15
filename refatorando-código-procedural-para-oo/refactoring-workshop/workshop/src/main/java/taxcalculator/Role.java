package taxcalculator;

public enum Role {
    DEVELOPER(new TenOrTwentyPercent()),
    DBA(new FifteenOrTwentyFivePercent()),
    TESTER(new FifteenOrTwentyFivePercent());

    private final TaxCalculatorStrategy strategy;

    Role(TaxCalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public TaxCalculatorStrategy getStrategy() {
        return strategy;
    }
}
