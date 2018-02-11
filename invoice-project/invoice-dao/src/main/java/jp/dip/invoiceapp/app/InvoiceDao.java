package jp.dip.invoiceapp.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.dip.invoiceapp.app.tbl.ClientTblData;
import jp.dip.invoiceapp.app.tbl.InvoiceTblData;
import jp.dip.invoiceapp.app.tbl.OrderTblData;

public class InvoiceDao {

	private enum INVOICE_TBL_SELECT {
		ONCE,
		ALL
	}
	/**
	 * 請求書テーブル取得
	 * @param invoiceNo
	 * @return
	 * @throws UserBadRequestException 
	 * @throws UserServerErrorException 
	 * @throws SQLException 
	 */
	public List<InvoiceTblData> getInvoiceTbl(String strInvoiceNo) throws UserBadRequestException, UserServerErrorException {
		// 初期値設定
		INVOICE_TBL_SELECT proc = INVOICE_TBL_SELECT.ONCE;
		int invoiceNo = 0;
		// 引数がnull か空文字列なら全件検索
		if ((null == strInvoiceNo) || strInvoiceNo.equals("")) {
			// 全件検索
			proc = INVOICE_TBL_SELECT.ALL;
			
		} else {
			// 個別検索
			try {
				invoiceNo = Integer.parseInt(strInvoiceNo);
			} catch (Exception e) {
				// 数値以外っぽいのでエラー
				throw new UserBadRequestException("InvoiceNo is a number.");
			}
			if (Common.INVOICE_NO_MIN > invoiceNo) {
				// 最小値より小さいのでエラー
				throw new UserBadRequestException("InvoiceNo is small.(" + Common.INVOICE_NO_MIN + " and above)");
			}
			proc = INVOICE_TBL_SELECT.ONCE;
		}
		// 戻り値用クラス
		List<InvoiceTblData> result = new ArrayList<InvoiceTblData>();
		// MySQL 接続
		MySQLConnector mysqlConnector = new MySQLConnector();
		// DB オープン
		Connection con = mysqlConnector.open();
		ResultSet rs = null;
		if (INVOICE_TBL_SELECT.ONCE == proc) {
			rs = getInvoiceTblOnce(con, invoiceNo);
		} else {
			rs = getInvoiceTblAll(con);
		}
		try {
			while(rs.next()){
				InvoiceTblData invoice = new InvoiceTblData();
			    invoice.setInvoiceNo(rs.getInt("invoice_no"));
			    invoice.setClientNo(rs.getInt("client_no"));
			    invoice.setInvoiceStatus(rs.getString("invoice_status"));
			    invoice.setInvoiceCreateDate(rs.getDate("invoice_create_date"));
			    invoice.setInvoiceTitle(rs.getString("invoice_title"));
			    invoice.setInvoiceAmt(rs.getInt("invoice_amt"));
			    invoice.setTaxAmt(rs.getInt("tax_amt"));
			    invoice.setInvoiceStartDate(rs.getDate("invoice_start_date"));
			    invoice.setInvoiceEndDate(rs.getDate("invoice_end_date"));
			    invoice.setInvoiceNote(rs.getString("invoice_note"));
			    invoice.setCreateUser(rs.getString("create_user"));
			    invoice.setCreateDatetime(rs.getTimestamp("create_datetime"));
			    invoice.setUpdateUser(rs.getString("update_user"));
			    invoice.setUpdateDatetime(rs.getTimestamp("update_datetime"));
			    invoice.setDelFlg(rs.getString("del_flg"));
			    result.add(invoice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		} finally {
	        // DB クローズ
			mysqlConnector.close(con);
		}
		return result;
	}
	
	public ResultSet getInvoiceTblOnce(Connection con, int invoiceNo) throws UserServerErrorException {
		ResultSet rs = null;
		// データ取得
		String sql = "SELECT * FROM invoice_tbl WHERE invoice_no = ?;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, invoiceNo);
			rs = pstmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		}
		return rs;
	}

	public ResultSet getInvoiceTblAll(Connection con) throws UserServerErrorException {
		ResultSet rs = null;
		// データ取得
		String sql = "SELECT * FROM invoice_tbl;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		}
		return rs;
	}

	/**
	 * 請求書テーブル登録
	 * @param invoiceTblData
	 * @return
	 * @throws UserServerErrorException 
	 */
	public boolean setInvoiceTbl(InvoiceTblData invoiceTblData) throws UserServerErrorException {
		int num = 0;
		// MySQL 接続
		MySQLConnector mysqlConnector = new MySQLConnector();
		// DB オープン
		Connection con = mysqlConnector.open();
		// データ取得
		String sql = "INSERT INTO invoice_tbl values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, invoiceTblData.getInvoiceNo());			// 請求書管理番号
			pstmt.setInt(2, invoiceTblData.getClientNo());			// 顧客管理番号
			pstmt.setString(3, invoiceTblData.getInvoiceStatus());	// 請求状態
			pstmt.setDate(4, Common.getDate());						// 請求書作成日
			pstmt.setString(5, invoiceTblData.getInvoiceTitle());	// 請求書件名
			pstmt.setInt(6, invoiceTblData.getInvoiceAmt());		// 請求金額
			pstmt.setInt(7, invoiceTblData.getTaxAmt());			// 消費税
			pstmt.setDate(8, Common.getDate());						// 請求期間開始日
			pstmt.setDate(9, Common.getDate());						// 請求期間終了日
			pstmt.setString(10, invoiceTblData.getInvoiceNote());	// 備考
			pstmt.setString(11, invoiceTblData.getCreateUser());	// 登録ユーザID
			pstmt.setTimestamp(12, Common.getNow());				// 登録日時
			pstmt.setString(13, invoiceTblData.getUpdateUser());	// 更新ユーザID
			pstmt.setTimestamp(14, Common.getNow());				// 更新日時
			pstmt.setString(15, "0");								// 削除フラグ
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserServerErrorException(e.getMessage());
		}
        // DB クローズ
		mysqlConnector.close(con);
		// 戻り値
		if (0 == num) {
			// 登録件数なし
			return true;
		} else {
			// 登録件数あり
			return false;
		}
	}

	/**
	 * 注文実績テーブル取得
	 * @param orderNo
	 * @return
	 */
	public List<OrderTblData> getOrderTbl(int orderNo) {
		List<OrderTblData> result = new ArrayList<OrderTblData>();
		return result;
	}

	/**
	 * 注文実績テーブル登録
	 * @param orderTblData
	 * @return
	 */
	public boolean setOrderTbl(OrderTblData orderTblData) {
		return false;
	}

	/**
	 * 顧客管理テーブル取得
	 * @param clientNo
	 * @return
	 */
	public List<ClientTblData> getClientTbl(int clientNo) {
		List<ClientTblData> result = new ArrayList<ClientTblData>();
		return result;
	}

	/**
	 * 顧客管理テーブル登録
	 * @param clientTblData
	 * @return
	 */
	public boolean setClientTbl(ClientTblData clientTblData) {
		return false;
	}

}
