package invoicegenerator;

import java.util.List;

public class InvoiceGenerator {

    private final List<InvoiceGeneratedAction> actions;

    public InvoiceGenerator(List<InvoiceGeneratedAction> actions) {
        this.actions = actions;
    }

    public Invoice generate(ProvidedService providedService) {

        double amount = providedService.getMonthlyAmount();

        Invoice nf = new Invoice(amount, simpleTax(amount));

        actions.forEach(action-> {
            action.process(nf);
        });

        return nf;
    }

    private double simpleTax(double value) {
        return value * 0.06;
    }
}
