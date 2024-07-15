package kiosh.tony.Invoice_generator.controller;

@RestController
@RequestMapping("/api")
public class invoiceController {

//    Dependency injection
    private final invoiceRepository repository;

    public invoiceController(invoiceRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/invoices")
    public List<invoiceRecord> getInvoices() {
        return repository.findAll();
    }

    @PostMapping("/invoices")
    public void createInvoice(invoiceRecord record) {
        repository.save(record);
    }

    @DeleteMapping("")
    public void deleteInvoice(invoiceRecord record) {
        repository.delete(record);
    }
}
