package discountapplier;

import common.Basket;

import java.util.List;

public class DiscountApplier {
    private final List<DiscountStrategy> discounts;

    public DiscountApplier(List<DiscountStrategy> discounts) {
        this.discounts = discounts;
    }

    public void apply(Basket basket) {
        boolean noneDiscountApplied = true;
        for (DiscountStrategy discount : discounts) {
            if (discount.shouldBeApplied(basket)) {
                discount.apply(basket);
                noneDiscountApplied = false;
                System.out.println("Valor do desconto: " + basket.getAmount());
            }
        }

        if (noneDiscountApplied) {
            System.out.println("Sem desconto");
        }
    }

}