package discountapplier;

import java.util.List;

/**
 * Repository Fake
 */
public class DiscountRepositoryFake implements DiscountRepository {
    @Override
    public List<DiscountProduct> getAllDiscountsPerProdut() {
        List<String> allProductsInTheBasketRuleOne = List.of("MACBOOK", "IPHONE");
        List<String> allProductsInTheBasketRuleTwo = List.of("NOTEBOOK", "WINDOWS PHONE");
        List<String> allProductsInTheBasketRuleThree = List.of("XBOX");

        return List.of(
            new DiscountProduct(1, allProductsInTheBasketRuleOne, 0.15),
            new DiscountProduct(2, allProductsInTheBasketRuleTwo, 0.12),
            new DiscountProduct(3, allProductsInTheBasketRuleThree, 0.7)
        );
    }

    @Override
    public List<DiscountAmount> getAllDiscountsPerAmount() {
        return List.of(
            new DiscountAmount(1, 1000, 1, 2, 0.02),
            new DiscountAmount(3000, Double.MAX_VALUE, 3, 4, 0.05),
            new DiscountAmount(3000, Double.MAX_VALUE, 5, Integer.MAX_VALUE, 0.06)
        );
    }
}
