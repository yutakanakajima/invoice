package jp.dip.invoiceapp.app.param;

import java.io.Serializable;

/**
 * 
 */
public class InvoiceEntryForm implements Serializable {

	/**  */
	private static final long serialVersionUID = 1L;

	/**  */
	private String InvoiceTitle;
	
	/**  */
	private String InvoiceStartDate;
	
	/**  */
	private String InvoiceEndDate;
	
	/**  */
	private String InvoiceNote;
	
	/**  */
	private String UserId;

	/**
	 * 
	 *
	 * @return 
	 */
	public String getInvoiceTitle() {
		return InvoiceTitle;
	}

	/**
	 * 
	 *
	 * @param invoiceTitle 
	 */
	public void setInvoiceTitle(String invoiceTitle) {
		InvoiceTitle = invoiceTitle;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getInvoiceStartDate() {
		return InvoiceStartDate;
	}

	/**
	 * 
	 *
	 * @param invoiceStartDate 
	 */
	public void setInvoiceStartDate(String invoiceStartDate) {
		InvoiceStartDate = invoiceStartDate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getInvoiceEndDate() {
		return InvoiceEndDate;
	}

	/**
	 * 
	 *
	 * @param invoiceEndDate 
	 */
	public void setInvoiceEndDate(String invoiceEndDate) {
		InvoiceEndDate = invoiceEndDate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getInvoiceNote() {
		return InvoiceNote;
	}

	/**
	 * 
	 *
	 * @param invoiceNote 
	 */
	public void setInvoiceNote(String invoiceNote) {
		InvoiceNote = invoiceNote;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getUserId() {
		return UserId;
	}

	/**
	 * 
	 *
	 * @param userId 
	 */
	public void setUserId(String userId) {
		UserId = userId;
	}
	
	
}
