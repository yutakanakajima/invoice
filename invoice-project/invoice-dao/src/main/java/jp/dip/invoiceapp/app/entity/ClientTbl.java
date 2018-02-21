package jp.dip.invoiceapp.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the client_tbl database table.
 * 
 */
@Entity
@Table(name="client_tbl")
@NamedQuery(name="ClientTbl.findAll", query="SELECT c FROM ClientTbl c")
public class ClientTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="client_no")
	private int clientNo;

	@Column(name="client_address")
	private String clientAddress;

	@Column(name="client_charge_first_name")
	private String clientChargeFirstName;

	@Column(name="client_charge_last_name")
	private String clientChargeLastName;

	@Column(name="client_fax")
	private String clientFax;

	@Column(name="client_name")
	private String clientName;

	@Column(name="client_tel")
	private String clientTel;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_datetime")
	private Date createDatetime;

	@Column(name="del_flg")
	private String delFlg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_datetime")
	private Date updateDatetime;

	public ClientTbl() {
	}

	public int getClientNo() {
		return this.clientNo;
	}

	public void setClientNo(int clientNo) {
		this.clientNo = clientNo;
	}

	public String getClientAddress() {
		return this.clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientChargeFirstName() {
		return this.clientChargeFirstName;
	}

	public void setClientChargeFirstName(String clientChargeFirstName) {
		this.clientChargeFirstName = clientChargeFirstName;
	}

	public String getClientChargeLastName() {
		return this.clientChargeLastName;
	}

	public void setClientChargeLastName(String clientChargeLastName) {
		this.clientChargeLastName = clientChargeLastName;
	}

	public String getClientFax() {
		return this.clientFax;
	}

	public void setClientFax(String clientFax) {
		this.clientFax = clientFax;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientTel() {
		return this.clientTel;
	}

	public void setClientTel(String clientTel) {
		this.clientTel = clientTel;
	}

	public Date getCreateDatetime() {
		return this.createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getDelFlg() {
		return this.delFlg;
	}

	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}