package discountapplier;

import java.util.List;

public class DiscountProduct {
    private int id;
    private List<String> produtos;
    private double discount;

    public DiscountProduct(int id, List<String> produtos, double discount) {
        this.id = id;
        this.produtos = produtos;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public double getDiscount() {
        return discount;
    }
}
