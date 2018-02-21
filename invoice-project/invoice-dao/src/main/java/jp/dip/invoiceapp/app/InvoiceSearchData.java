package jp.dip.invoiceapp.app;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class InvoiceSearchData {

	@Min(0)
	@Max(999999)
	private Integer InvoiceNo;

	public Integer getInvoiceNo() {
		return InvoiceNo;
	}

	public void setInvoiceNo(Integer invoiceNo) {
		InvoiceNo = invoiceNo;
	}

}
