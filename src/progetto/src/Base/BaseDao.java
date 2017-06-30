package Base;
import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author Yassine Snoussi
 *
 */
public class BaseDao {
	protected static Connection mysqlConnection;
	/** Get MySQL Connection
	 * @return Connection
	 */
	protected static Connection getConnection() {

		try {
			if (mysqlConnection != null)
				return mysqlConnection;
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/exam");
			mysqlConnection = dataSource.getConnection();

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mysqlConnection;
	}

}
