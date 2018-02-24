package jp.dip.invoiceapp.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.dip.invoiceapp.app.entity.InvoiceTbl;

/**
 * 
 */
public interface InvoiceRepository extends JpaRepository<InvoiceTbl, Integer> {

    /* (non-Javadoc)
     * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
     */
    List<InvoiceTbl> findAll();
    
    /**
     * 
     *
     * @param invoiceNo 
     * @return 
     */
    InvoiceTbl findByInvoiceNo(int invoiceNo);

}
