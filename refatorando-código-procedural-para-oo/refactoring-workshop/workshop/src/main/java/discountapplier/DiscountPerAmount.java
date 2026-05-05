package discountapplier;

import common.Basket;

public class DiscountPerAmount implements DiscountStrategy {
    private final double minAmount;
    private final double maxAmount;
    private final int minQuantity;
    private final int maxQuantity;
    private final double discount;

    public DiscountPerAmount(double minAmount, double maxAmount, int minQuantity, int maxQuantity, double discount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.minQuantity = minQuantity;
        this.maxQuantity = maxQuantity;
        this.discount = discount;
    }

    @Override
    public boolean shouldBeApplied(Basket basket) {
        int quantityOfItens = basket.qtyOfItems();
        double amount = basket.getAmount();
        boolean withinQuantityLimit = quantityOfItens >= minQuantity && quantityOfItens <= maxQuantity;
        boolean withinAmountLimit = amount >= minAmount && amount <= maxAmount;

        return withinQuantityLimit && withinAmountLimit;
    }

    @Override
    public void apply(Basket basket) {
        basket.subtract(basket.getAmount() * discount);
    }
}