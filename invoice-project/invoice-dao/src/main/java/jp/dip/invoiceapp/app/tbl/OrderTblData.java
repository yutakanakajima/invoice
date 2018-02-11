package jp.dip.invoiceapp.app.tbl;

import java.util.Date;

public class OrderTblData {

	private int m_OrderNo;			// 注文管理番号
	private int m_ClientNo;			// 顧客管理番号
	private int m_ItemNo;			// 商品管理番号
	private String m_ItemName;		// 商品名
	private String m_ItemType;		// 商材区分
	private int m_ItemPrice;		// 商品販売価格（税抜き）
	private int m_ItemCount;		// 購入数量
	private Date m_CreateDatetime;	// 登録日時
	private Date m_UpdateDatetime;	// 更新日時
	private String m_DelFlg;		// 削除フラグ

	public int getOrderNo() {
		return m_OrderNo;
	}
	public void setOrderNo(int orderNo) {
		this.m_OrderNo = orderNo;
	}
	public int getClientNo() {
		return m_ClientNo;
	}
	public void setClientNo(int clientNo) {
		this.m_ClientNo = clientNo;
	}
	public int getItemNo() {
		return m_ItemNo;
	}
	public void setItemNo(int itemNo) {
		this.m_ItemNo = itemNo;
	}
	public String getItemName() {
		return m_ItemName;
	}
	public void setItemName(String itemName) {
		this.m_ItemName = itemName;
	}
	public String getItemType() {
		return m_ItemType;
	}
	public void setItemType(String itemType) {
		this.m_ItemType = itemType;
	}
	public int getItemPrice() {
		return m_ItemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.m_ItemPrice = itemPrice;
	}
	public int getItemCount() {
		return m_ItemCount;
	}
	public void setItemCount(int itemCount) {
		this.m_ItemCount = itemCount;
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
