package invoicegenerator;

public class PersistInvoiceAction implements InvoiceGeneratedAction {
    private final InvoiceRepository repository;

    public PersistInvoiceAction(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public void process(Invoice invoice) {
        System.out.println("Persistindo invoice");
        repository.persist(invoice);
    }
}
