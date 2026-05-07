package discountapplier;

import java.util.ArrayList;
import java.util.List;

public class DiscountApplyFactory {
    private final DiscountRepository repository;

    public DiscountApplyFactory(DiscountRepository repository) {
        this.repository = repository;
    }

    public DiscountApplier build() {
        List<DiscountStrategy> discounts = new ArrayList<>();
        List<DiscountProduct> allDiscountsPerProdut = repository.getAllDiscountsPerProdut();
        List<DiscountAmount> allDiscountsPerAmount = repository.getAllDiscountsPerAmount();

        allDiscountsPerProdut.forEach(discountProduct -> {
            DiscountPerProduct discountPerProduct = new DiscountPerProduct(discountProduct.getProdutos(), discountProduct.getDiscount());
            discounts.add(discountPerProduct);
        });

        allDiscountsPerAmount.forEach(discountAmount -> {
            DiscountPerAmount discountPerAmount = new DiscountPerAmount(discountAmount.getMinAmount(), discountAmount.getMaxAmount(), discountAmount.getMinQuantity(), discountAmount.getMaxQuantity(), discountAmount.getDiscount());
            discounts.add(discountPerAmount);
        });

        return new DiscountApplier(discounts);
    }
}
