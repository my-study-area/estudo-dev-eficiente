package invoicegenerator;

public class SendInvoiceEmailAction implements InvoiceGeneratedAction {
    @Override
    public void process(Invoice invoice) {
        System.out.println("Enviando email");
    }
}