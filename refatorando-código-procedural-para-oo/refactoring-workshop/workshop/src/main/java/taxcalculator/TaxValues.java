package taxcalculator;

public class TaxValues {
    private double thresould;
    private double aboveTax;
    private double bellowTax;

    public TaxValues(double thresould, double aboveTax, double bellowTax) {
        this.thresould = thresould;
        this.aboveTax = aboveTax;
        this.bellowTax = bellowTax;
    }

    public double getThresould() {
        return thresould;
    }

    public double getAboveTax() {
        return aboveTax;
    }

    public double getBellowTax() {
        return bellowTax;
    }
}
