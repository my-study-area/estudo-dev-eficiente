package discountapplier;

import common.Basket;

public interface DiscountStrategy {
    boolean apply(Basket basket);
}
