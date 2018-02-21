package jp.dip.invoiceapp.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.dip.invoiceapp.app.entity.InvoiceTbl;

public interface InvoiceDao extends JpaRepository<InvoiceTbl, Integer> {

}
