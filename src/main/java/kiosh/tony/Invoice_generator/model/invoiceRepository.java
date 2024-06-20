package kiosh.tony.Invoice_generator.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface invoiceRepository extends JpaRepository<invoiceRecord, Long>{

}
