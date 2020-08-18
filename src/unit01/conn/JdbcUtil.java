package unit01.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
<<<<<<< HEAD
			String url = "jdbc:oracle:thin:@localhost:1521:xe?useSSL=false";
=======
			String url = "jdbc:oracle:thin:@localhost:1521:orcl?useSSL=false";
>>>>>>> branch 'master' of https://github.com/Jason-web1988/web-study-01.git
			String user = "erd_study";
			String password = "rootroot";
			conn = DriverManager.getConnection(url, user, password);
	}catch(SQLException e) {
		e.printStackTrace();
	}catch(ClassNotFoundException e) {	
		e.printStackTrace();
		}
		return conn;
	}
}
