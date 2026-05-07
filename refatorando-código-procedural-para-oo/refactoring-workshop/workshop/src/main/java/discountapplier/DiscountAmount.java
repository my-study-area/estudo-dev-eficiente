package discountapplier;

public class DiscountAmount {
    private final double minAmount;
    private final double maxAmount;
    private final int minQuantity;
    private final int maxQuantity;
    private final double discount;

    public DiscountAmount(double minAmount, double maxAmount, int minQuantity, int maxQuantity, double discount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.minQuantity = minQuantity;
        this.maxQuantity = maxQuantity;
        this.discount = discount;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public double getDiscount() {
        return discount;
    }
}
