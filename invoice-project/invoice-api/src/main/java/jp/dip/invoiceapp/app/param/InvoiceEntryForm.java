package jp.dip.invoiceapp.app.param;

import java.io.Serializable;

public class InvoiceEntryForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String InvoiceTitle;
	
	private String InvoiceStartDate;
	
	private String InvoiceEndDate;
	
	private String InvoiceNote;
	
	private String UserId;

	public String getInvoiceTitle() {
		return InvoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		InvoiceTitle = invoiceTitle;
	}

	public String getInvoiceStartDate() {
		return InvoiceStartDate;
	}

	public void setInvoiceStartDate(String invoiceStartDate) {
		InvoiceStartDate = invoiceStartDate;
	}

	public String getInvoiceEndDate() {
		return InvoiceEndDate;
	}

	public void setInvoiceEndDate(String invoiceEndDate) {
		InvoiceEndDate = invoiceEndDate;
	}

	public String getInvoiceNote() {
		return InvoiceNote;
	}

	public void setInvoiceNote(String invoiceNote) {
		InvoiceNote = invoiceNote;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}
	
	
}
