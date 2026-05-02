package discountapplier;

import java.util.List;

public class DiscountFactory {
    public DiscountApplier build() {
        List<String> allProductsInTheBasketRuleOne = List.of("MACBOOK", "IPHONE");
        List<String> allProductsInTheBasketRuleTwo = List.of("NOTEBOOK", "WINDOWS PHONE");
        List<String> allProductsInTheBasketRuleThree = List.of("XBOX");

        List<DiscountStrategy> discounts = List.of(
            new DiscountPerProduct(allProductsInTheBasketRuleOne, 0.15), //Prioridade 1
            new DiscountPerProduct(allProductsInTheBasketRuleTwo, 0.12), //Prioridade 1
            new DiscountPerProduct(allProductsInTheBasketRuleThree, 0.7), //Prioridade 1
            new DiscountPerAmount(1, 1000, 1, 2, 0.02),   //Prioridade 2
            new DiscountPerAmount(3000, Double.MAX_VALUE, 3, 4, 0.05),   //Prioridade 2
            new DiscountPerAmount(3000, Double.MAX_VALUE, 5, Integer.MAX_VALUE, 0.06)   //Prioridade 2
        );
        return new DiscountApplier(discounts);
    }
}
