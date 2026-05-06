package discountapplier;

import common.Basket;

import java.util.List;

public class DiscountPerProduct implements DiscountStrategy {
    private final List<String> productsWithDiscountIfAllInTheBasket;
    private final double discountPercentage;

    public DiscountPerProduct(List<String> productsWithDiscountIfAllInTheBasket, double discountPercentage) {
        this.productsWithDiscountIfAllInTheBasket = productsWithDiscountIfAllInTheBasket;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public boolean shouldBeApplied(Basket basket) {
        return productsWithDiscountIfAllInTheBasket
                .stream()
                .allMatch(basket::has);
    }

    @Override
    public void apply(Basket basket) {
        basket.applyDiscountByPercentage(discountPercentage);
    }
}