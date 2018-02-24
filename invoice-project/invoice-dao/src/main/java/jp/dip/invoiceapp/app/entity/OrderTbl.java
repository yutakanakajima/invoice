package jp.dip.invoiceapp.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the order_tbl database table.
 * 
 */
@Entity
@Table(name="order_tbl")
@NamedQuery(name="OrderTbl.findAll", query="SELECT o FROM OrderTbl o")
public class OrderTbl implements Serializable {
	
	/**  */
	private static final long serialVersionUID = 1L;

	/**  */
	@Id
	@Column(name="order_no")
	private int orderNo;

	/**  */
	@Column(name="client_no")
	private int clientNo;

	/**  */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_datetime")
	private Date createDatetime;

	/**  */
	@Column(name="del_flg")
	private String delFlg;

	/**  */
	@Column(name="item_count")
	private int itemCount;

	/**  */
	@Column(name="item_name")
	private String itemName;

	/**  */
	@Column(name="item_no")
	private int itemNo;

	/**  */
	@Column(name="item_price")
	private int itemPrice;

	/**  */
	@Column(name="item_type")
	private String itemType;

	/**  */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_datetime")
	private Date updateDatetime;

	/**
	 * 
	 */
	public OrderTbl() {
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public int getOrderNo() {
		return this.orderNo;
	}

	/**
	 * 
	 *
	 * @param orderNo 
	 */
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
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
	public int getItemCount() {
		return this.itemCount;
	}

	/**
	 * 
	 *
	 * @param itemCount 
	 */
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getItemName() {
		return this.itemName;
	}

	/**
	 * 
	 *
	 * @param itemName 
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public int getItemNo() {
		return this.itemNo;
	}

	/**
	 * 
	 *
	 * @param itemNo 
	 */
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public int getItemPrice() {
		return this.itemPrice;
	}

	/**
	 * 
	 *
	 * @param itemPrice 
	 */
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getItemType() {
		return this.itemType;
	}

	/**
	 * 
	 *
	 * @param itemType 
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
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