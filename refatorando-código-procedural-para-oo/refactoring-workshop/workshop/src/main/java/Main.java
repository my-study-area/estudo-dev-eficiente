import common.Basket;
import common.Item;
import discountapplier.DiscountApplier;
import discountapplier.DiscountFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DiscountApplier discountApplier = new DiscountFactory().build();
        Item geladeira = new Item("geladeira", 3, 100.00);
        Item xbox = new Item("XBOX", 1, 1000.00);

        Basket basketComDesconto = new Basket(List.of(geladeira, xbox));
        printBucket(basketComDesconto);
        discountApplier.apply(basketComDesconto);

        Basket basketSemDesconto = new Basket(List.of(geladeira));
        printBucket(basketSemDesconto);
        discountApplier.apply(basketSemDesconto);
    }

    private static void printBucket(Basket basket) {
        System.out.println("");
        System.out.println("");
        basket.getItems().forEach(item ->{
            System.out.println("Item: " + item.getName());
            System.out.println("Quantidade: " + item.getQty());
            System.out.println("Preco: " + item.getTotalPrice());
            System.out.println("");
        });

        System.out.println("Total: " + basket.getAmount());
        System.out.println("Quantidade total de itens: " + basket.qtyOfItems());
    }
}
