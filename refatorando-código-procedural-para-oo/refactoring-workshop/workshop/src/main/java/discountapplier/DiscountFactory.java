package discountapplier;

import java.util.List;

public class DiscountFactory {
    public DiscountApplier build() {
        List<DiscountStrategy> discounts = List.of(
                new DiscountPerProduct(), //Prioridade 1
                new DiscountPerAmount()   //Prioridade 2
        );
        return new DiscountApplier(discounts);
    }
}
