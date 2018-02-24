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
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="order_no")
	private int orderNo;

	@Column(name="client_no")
	private int clientNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_datetime")
	private Date createDatetime;

	@Column(name="del_flg")
	private String delFlg;

	@Column(name="item_count")
	private int itemCount;

	@Column(name="item_name")
	private String itemName;

	@Column(name="item_no")
	private int itemNo;

	@Column(name="item_price")
	private int itemPrice;

	@Column(name="item_type")
	private String itemType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_datetime")
	private Date updateDatetime;

	public OrderTbl() {
	}

	public int getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getClientNo() {
		return this.clientNo;
	}

	public void setClientNo(int clientNo) {
		this.clientNo = clientNo;
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

	public int getItemCount() {
		return this.itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public int getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

}