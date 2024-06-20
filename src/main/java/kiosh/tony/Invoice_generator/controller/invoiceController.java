package kiosh.tony.Invoice_generator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
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

    public void deleteInvoice(invoiceRecord record) {
        repository.delete(record);
    }
}
