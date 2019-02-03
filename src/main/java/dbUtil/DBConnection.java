package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBConnection {
	private static final Logger logger = LoggerFactory.getLogger(DBConnection.class);

	public static final String URL = "jdbc:sqlserver://vNTDACLSCRAPR01:1433";
	public static final String USER = "bankaccountmng_dbo";
	public static final String PASS = "bankaccountmng_dbo123";
	public static Connection conn;

	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			log.info("connection created.");
			// conn.close();
		} catch (SQLException e) {
			log.error("Connection error: " + e.getMessage());
		}
		return conn;
	}
}
