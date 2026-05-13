package taxcalculator;

public class TenOrTwentyPercent extends ThreshouldBasedTaxCalculation {
    public TenOrTwentyPercent() {
        super(3000, 0.8, 0.9);
    }
}
