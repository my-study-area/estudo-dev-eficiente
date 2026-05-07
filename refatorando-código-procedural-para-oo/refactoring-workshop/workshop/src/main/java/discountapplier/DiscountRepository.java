package discountapplier;

import java.util.List;

public interface DiscountRepository {
    List<DiscountProduct> getAllDiscountsPerProdut();
    List<DiscountAmount> getAllDiscountsPerAmount();
}
