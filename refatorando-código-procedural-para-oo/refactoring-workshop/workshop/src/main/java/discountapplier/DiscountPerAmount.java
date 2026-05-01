package discountapplier;

import common.Basket;

public class DiscountPerAmount implements DiscountStrategy {
    @Override
    public boolean apply(Basket basket) {

        if (basket.getAmount() <= 1000 && basket.qtyOfItems() <= 2) {
            basket.subtract(basket.getAmount() * 0.02);
            return true;
        } else if (basket.getAmount() > 3000 && basket.qtyOfItems() < 5 && basket.qtyOfItems() > 2) {
            basket.subtract(basket.getAmount() * 0.05);
            return true;
        } else if (basket.getAmount() > 3000 && basket.qtyOfItems() >= 5) {
            basket.subtract(basket.getAmount() * 0.06);
            return true;
        }
        return false;
    }
}