package invoicegenerator;

import java.util.List;

public class InvoiceGeneratorFactory {
    private final InvoiceRepository repository;

    public InvoiceGeneratorFactory(InvoiceRepository repository) {
        this.repository = repository;
    }

    public InvoiceGenerator build() {
        return new InvoiceGenerator(
            List.of(
                new SendInvoiceEmailAction(),
                new PersistInvoiceAction(repository)
            )
        );
    }
}
