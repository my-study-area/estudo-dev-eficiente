package discountapplier;

import common.Basket;

public class DiscountPerProduct implements DiscountStrategy {
    @Override
    public boolean apply(Basket basket) {
        if(basket.has("MACBOOK") && basket.has("IPHONE")) {
            basket.subtract(basket.getAmount() * 0.15);
            return true;
        }

        if(basket.has("NOTEBOOK") && basket.has("WINDOWS PHONE")) {
            basket.subtract(basket.getAmount() * 0.12);
            return true;
        }

        if(basket.has("XBOX")) {
            basket.subtract(basket.getAmount() * 0.7);
            return true;
        }

        // ... and many more ...

        return false;
    }
}