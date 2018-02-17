package jp.dip.invoiceapp.app.tbl;

import java.util.Date;

public class InvoiceTblData {

	private int m_InvoiceNo;			// 請求書管理番号
	private int m_ClientNo;				// 顧客管理番号
	private String m_InvoiceStatus;		// 請求状態
	private Date m_InvoiceCreateDate;	// 請求書作成日
	private String m_InvoiceTitle;		// 請求書件名
	private int m_InvoiceAmt;			// 請求金額
	private int m_TaxAmt;				// 消費税
	private Date m_InvoiceStartDate;	// 請求期間開始日
	private Date m_InvoiceEndDate;		// 請求期間終了日
	private String m_InvoiceNote;		// 備考
	private String m_CreateUser;		// 登録ユーザID
	private Date m_CreateDatetime;		// 登録日時
	private String m_UpdateUser;		// 更新ユーザID
	private Date m_UpdateDatetime;		// 更新日時
	private String m_DelFlg;			// 削除フラグ

	public int getInvoiceNo() {
		return m_InvoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.m_InvoiceNo = invoiceNo;
	}
	public int getClientNo() {
		return m_ClientNo;
	}
	public void setClientNo(int clientNo) {
		this.m_ClientNo = clientNo;
	}
	public String getInvoiceStatus() {
		return m_InvoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.m_InvoiceStatus = invoiceStatus;
	}
	public Date getInvoiceCreateDate() {
		return m_InvoiceCreateDate;
	}
	public void setInvoiceCreateDate(Date invoiceCreateDate) {
		this.m_InvoiceCreateDate = invoiceCreateDate;
	}
	public String getInvoiceTitle() {
		return m_InvoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.m_InvoiceTitle = invoiceTitle;
	}
	public int getInvoiceAmt() {
		return m_InvoiceAmt;
	}
	public void setInvoiceAmt(int invoiceAmt) {
		this.m_InvoiceAmt = invoiceAmt;
	}
	public int getTaxAmt() {
		return m_TaxAmt;
	}
	public void setTaxAmt(int taxAmt) {
		this.m_TaxAmt = taxAmt;
	}
	public Date getInvoiceStartDate() {
		return m_InvoiceStartDate;
	}
	public void setInvoiceStartDate(Date invoiceStartDate) {
		this.m_InvoiceStartDate = invoiceStartDate;
	}
	public Date getInvoiceEndDate() {
		return m_InvoiceEndDate;
	}
	public void setInvoiceEndDate(Date invoiceEndDate) {
		this.m_InvoiceEndDate = invoiceEndDate;
	}
	public String getInvoiceNote() {
		return m_InvoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.m_InvoiceNote = invoiceNote;
	}
	public String getCreateUser() {
		return m_CreateUser;
	}
	public void setCreateUser(String createUser) {
		this.m_CreateUser = createUser;
	}
	public Date getCreateDatetime() {
		return m_CreateDatetime;
	}
	public void setCreateDatetime(Date createDatetime) {
		this.m_CreateDatetime = createDatetime;
	}
	public String getUpdateUser() {
		return m_UpdateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.m_UpdateUser = updateUser;
	}
	public Date getUpdateDatetime() {
		return m_UpdateDatetime;
	}
	public void setUpdateDatetime(Date updateDatetime) {
		this.m_UpdateDatetime = updateDatetime;
	}
	public String getDelFlg() {
		return m_DelFlg;
	}
	public void setDelFlg(String delFlg) {
		this.m_DelFlg = delFlg;
	}

}
