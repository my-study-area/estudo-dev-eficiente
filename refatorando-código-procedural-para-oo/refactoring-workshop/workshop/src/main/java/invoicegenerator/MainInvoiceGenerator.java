package invoicegenerator;

public class MainInvoiceGenerator {
    public static void main(String[] args) {
        InvoiceRepositoryFake repository = new InvoiceRepositoryFake();
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorFactory(repository).build();

        ProvidedService providedService = new ProvidedService(12.0, "Adriano");
        invoiceGenerator.generate(providedService);
    }
}
