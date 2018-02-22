package jp.dip.invoiceapp.app.param;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class InvoiceSearchRequest {

	@Min(0)
	@Max(999999)
	private Integer invoiceNo;

	public Integer getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
}
