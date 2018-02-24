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
	
	/**  */
	private static final long serialVersionUID = 1L;

	/**  */
	@Id
	@Column(name="client_no")
	private int clientNo;

	/**  */
	@Column(name="client_address")
	private String clientAddress;

	/**  */
	@Column(name="client_charge_first_name")
	private String clientChargeFirstName;

	/**  */
	@Column(name="client_charge_last_name")
	private String clientChargeLastName;

	/**  */
	@Column(name="client_fax")
	private String clientFax;

	/**  */
	@Column(name="client_name")
	private String clientName;

	/**  */
	@Column(name="client_tel")
	private String clientTel;

	/**  */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_datetime")
	private Date createDatetime;

	/**  */
	@Column(name="del_flg")
	private String delFlg;

	/**  */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_datetime")
	private Date updateDatetime;

	/**
	 * 
	 */
	public ClientTbl() {
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
	public String getClientAddress() {
		return this.clientAddress;
	}

	/**
	 * 
	 *
	 * @param clientAddress 
	 */
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getClientChargeFirstName() {
		return this.clientChargeFirstName;
	}

	/**
	 * 
	 *
	 * @param clientChargeFirstName 
	 */
	public void setClientChargeFirstName(String clientChargeFirstName) {
		this.clientChargeFirstName = clientChargeFirstName;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getClientChargeLastName() {
		return this.clientChargeLastName;
	}

	/**
	 * 
	 *
	 * @param clientChargeLastName 
	 */
	public void setClientChargeLastName(String clientChargeLastName) {
		this.clientChargeLastName = clientChargeLastName;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getClientFax() {
		return this.clientFax;
	}

	/**
	 * 
	 *
	 * @param clientFax 
	 */
	public void setClientFax(String clientFax) {
		this.clientFax = clientFax;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getClientName() {
		return this.clientName;
	}

	/**
	 * 
	 *
	 * @param clientName 
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getClientTel() {
		return this.clientTel;
	}

	/**
	 * 
	 *
	 * @param clientTel 
	 */
	public void setClientTel(String clientTel) {
		this.clientTel = clientTel;
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

}