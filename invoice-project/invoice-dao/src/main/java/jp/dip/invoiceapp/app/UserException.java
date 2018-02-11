package jp.dip.invoiceapp.app;

/**
 * 独自例外エラー
 * @author systena
 *
 */
public class UserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1677459349306675872L;

	// 独自例外クラス
	public UserException(String err) {
		super(err);
	}
}

/**
 * リクエストエラー
 * @author systena
 *
 */
class UserBadRequestException extends UserException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7152246168254460519L;
	// リクエストエラー
	public UserBadRequestException() {
		super("Bad Request");
	}
	// MEMO：エラー発生元でエラー文字列を設定すること
	public UserBadRequestException(String err) {
		super(err);
	}
}

/**
 * サーバーエラー
 * @author systena
 *
 */
class UserServerErrorException extends UserException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1718337125121160147L;
	// サーバーエラー
	public UserServerErrorException() {
		super("Internal Server Error");
	}
	// MEMO：エラー発生元でエラー文字列を設定すること
	public UserServerErrorException(String err) {
		super(err);
	}
}