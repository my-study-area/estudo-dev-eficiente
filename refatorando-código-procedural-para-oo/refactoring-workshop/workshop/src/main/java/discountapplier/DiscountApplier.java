package discountapplier;

import common.Basket;

import java.util.List;

public class DiscountApplier {
    private final List<DiscountStrategy> discounts;

    public DiscountApplier(List<DiscountStrategy> discounts) {
        this.discounts = discounts;
    }

    /**
     * Aplica o desconto na cesta
     * É realizado apenas um tipo de desconto e a prioridade é o desconto de produtos
     * e somente depois o desconto por quantidade. Caso não atenda as regras não aplica
     * desconto na cesta de produtos.
     * @param basket
     */
    public void apply(Basket basket) {
        boolean noneDiscountApplied = true;
        for (DiscountStrategy discount : discounts) {
            if (discount.shouldBeApplied(basket)) {
                discount.apply(basket);
                noneDiscountApplied = false;
                System.out.println("Valor do desconto: " + basket.getAmount());
                break;
            }
        }

        if (noneDiscountApplied) {
            System.out.println("Sem desconto");
        }
    }

}