package jp.dip.invoiceapp.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the invoice_tbl database table.
 * 
 */
@Entity
@Table(name="invoice_tbl")
@NamedQuery(name="InvoiceTbl.findAll", query="SELECT i FROM InvoiceTbl i")
public class InvoiceTbl implements Serializable {
	
	/**  */
	private static final long serialVersionUID = 1L;

	/**  */
	@Id
	@Column(name="invoice_no")
	private int invoiceNo;

	/**  */
	@Column(name="client_no")
	private int clientNo;

	/**  */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_datetime")
	private Date createDatetime;

	/**  */
	@Column(name="create_user")
	private String createUser;

	/**  */
	@Column(name="del_flg")
	private String delFlg;

	/**  */
	@Column(name="invoice_amt")
	private int invoiceAmt;

	/**  */
	@Temporal(TemporalType.DATE)
	@Column(name="invoice_create_date")
	private Date invoiceCreateDate;

	/**  */
	@Temporal(TemporalType.DATE)
	@Column(name="invoice_end_date")
	private Date invoiceEndDate;

	/**  */
	@Column(name="invoice_note")
	private String invoiceNote;

	/**  */
	@Temporal(TemporalType.DATE)
	@Column(name="invoice_start_date")
	private Date invoiceStartDate;

	/**  */
	@Column(name="invoice_status")
	private String invoiceStatus;

	/**  */
	@Column(name="invoice_title")
	private String invoiceTitle;

	/**  */
	@Column(name="tax_amt")
	private int taxAmt;

	/**  */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_datetime")
	private Date updateDatetime;

	/**  */
	@Column(name="update_user")
	private String updateUser;

	/**
	 * 
	 */
	public InvoiceTbl() {
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public int getInvoiceNo() {
		return this.invoiceNo;
	}

	/**
	 * 
	 *
	 * @param invoiceNo 
	 */
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public int getClientNo() {
		return this.clientNo;
	}

	/**
	 * 
	 *
	 * @param clientNo 
	 */
	public void setClientNo(int clientNo) {
		this.clientNo = clientNo;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public Date getCreateDatetime() {
		return this.createDatetime;
	}

	/**
	 * 
	 *
	 * @param createDatetime 
	 */
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getCreateUser() {
		return this.createUser;
	}

	/**
	 * 
	 *
	 * @param createUser 
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getDelFlg() {
		return this.delFlg;
	}

	/**
	 * 
	 *
	 * @param delFlg 
	 */
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public int getInvoiceAmt() {
		return this.invoiceAmt;
	}

	/**
	 * 
	 *
	 * @param invoiceAmt 
	 */
	public void setInvoiceAmt(int invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public Date getInvoiceCreateDate() {
		return this.invoiceCreateDate;
	}

	/**
	 * 
	 *
	 * @param invoiceCreateDate 
	 */
	public void setInvoiceCreateDate(Date invoiceCreateDate) {
		this.invoiceCreateDate = invoiceCreateDate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public Date getInvoiceEndDate() {
		return this.invoiceEndDate;
	}

	/**
	 * 
	 *
	 * @param invoiceEndDate 
	 */
	public void setInvoiceEndDate(Date invoiceEndDate) {
		this.invoiceEndDate = invoiceEndDate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getInvoiceNote() {
		return this.invoiceNote;
	}

	/**
	 * 
	 *
	 * @param invoiceNote 
	 */
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public Date getInvoiceStartDate() {
		return this.invoiceStartDate;
	}

	/**
	 * 
	 *
	 * @param invoiceStartDate 
	 */
	public void setInvoiceStartDate(Date invoiceStartDate) {
		this.invoiceStartDate = invoiceStartDate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}

	/**
	 * 
	 *
	 * @param invoiceStatus 
	 */
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}

	/**
	 * 
	 *
	 * @param invoiceTitle 
	 */
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public int getTaxAmt() {
		return this.taxAmt;
	}

	/**
	 * 
	 *
	 * @param taxAmt 
	 */
	public void setTaxAmt(int taxAmt) {
		this.taxAmt = taxAmt;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	/**
	 * 
	 *
	 * @param updateDatetime 
	 */
	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getUpdateUser() {
		return this.updateUser;
	}

	/**
	 * 
	 *
	 * @param updateUser 
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}