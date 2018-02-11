package jp.dip.invoiceapp.app;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

final public class Common {

	public static final int INVOICE_NO_MIN = 20000;
	
	public static final Date getDate() {
        // 現在日時を取得
        Calendar c = Calendar.getInstance();
        Date result = new Date(c.getTimeInMillis());
        return result;
    }

	public static final Timestamp getNow() {
        // 現在日時を取得
        Calendar c = Calendar.getInstance();
        Timestamp  result = new Timestamp(c.getTimeInMillis());
        return result;
    }
}
