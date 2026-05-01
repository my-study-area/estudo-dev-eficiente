package discountapplier;

import common.Basket;

import java.util.List;

public class DiscountApplier {
    private final List<DiscountStrategy> discounts;

    public DiscountApplier(List<DiscountStrategy> discounts) {
        this.discounts = discounts;
    }

    public void apply(Basket basket) {
        for (DiscountStrategy discount : discounts) {
            if (discount.apply(basket)) {
                System.out.println("Valor do desconto: " + basket.getAmount());
                return;
            }
        }
        System.out.println("Sem desconto");
    }

}