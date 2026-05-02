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
    public boolean apply(Basket basket) {
        boolean allProductsInTheBasket = productsWithDiscountIfAllInTheBasket.stream().allMatch(product -> basket.has(product));
        if (allProductsInTheBasket) {
            basket.subtract(basket.getAmount() * discountPercentage);
            return true;
        }
        return false;
    }
}