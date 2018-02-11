package jp.dip.invoiceapp.app.tbl;

import java.util.Date;

public class ClientTblData {

	private int m_ClientNo;					// 顧客管理番号
	private String m_ClientChargeLastName;	// 顧客担当者氏名（名字）
	private String m_ClientChargeFirstName;	// 顧客担当者氏名（名前）
	private String m_ClientName;			// 法人名
	private String m_ClientAddress;			// 住所
	private String m_ClientTel;				// 電話番号
	private String m_ClientFax;				// FAX
	private Date m_CreateDatetime;			// 登録日時
	private Date m_UpdateDatetime;			// 更新日時
	private String m_DelFlg;				// 削除フラグ

	public int getClientNo() {
		return m_ClientNo;
	}
	public void setClientNo(int clientNo) {
		this.m_ClientNo = clientNo;
	}
	public String getClientChargeLastName() {
		return m_ClientChargeLastName;
	}
	public void setClientChargeLastName(String clientChargeLastName) {
		this.m_ClientChargeLastName = clientChargeLastName;
	}
	public String getClientChargeFirstName() {
		return m_ClientChargeFirstName;
	}
	public void setClientChargeFirstName(String clientChargeFirstName) {
		this.m_ClientChargeFirstName = clientChargeFirstName;
	}
	public String getClientName() {
		return m_ClientName;
	}
	public void setClientName(String clientName) {
		this.m_ClientName = clientName;
	}
	public String getClientAddress() {
		return m_ClientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.m_ClientAddress = clientAddress;
	}
	public String getClientTel() {
		return m_ClientTel;
	}
	public void setClientTel(String clientTel) {
		this.m_ClientTel = clientTel;
	}
	public String getClientFax() {
		return m_ClientFax;
	}
	public void setClientFax(String clientFax) {
		this.m_ClientFax = clientFax;
	}
	public Date getCreateDatetime() {
		return m_CreateDatetime;
	}
	public void setCreateDatetime(Date createDatetime) {
		this.m_CreateDatetime = createDatetime;
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
